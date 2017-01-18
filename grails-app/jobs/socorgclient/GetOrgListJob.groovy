package socorgclient

import cxf.client.AreaBean
import cxf.client.AreaBeanList
import cxf.client.CategoryBean
import cxf.client.CategoryBeanList
import cxf.client.OrgBean
import cxf.client.OrgBeanList
import cxf.client.ServiceBean
import cxf.client.ServiceBeanList
import cxf.client.SocOrgService
import cxf.client.SocOrgServiceService
import groovy.sql.Sql

class GetOrgListJob {
    static triggers = {
        cron name: "once", cronExpression: "0 00 7 * * ?"
    }
    def dataSource

    def execute() {
        println("---------------JOB WORK---------------------")
        fillOrgs()
        println("---------------org updated---------------------")
        fillAreas()
        println("---------------areas updated---------------------")
        fillSprSocServ()
        println("---------------serv updated---------------------")
        fillCategories()
        println("---------------category updated---------------------")
    }

    private void fillOrgs() {
        SocOrgService service = new SocOrgServiceService().getSocOrgServicePort();
        OrgBeanList list = service.getSocOrgList("")
        List<OrgBean> orgList = list.getOrgBeanList();
        Org org;
        Sql sql = Sql.newInstance(dataSource)
        Set guidOrgSet = new HashSet<>();
        sql.eachRow("SELECT  guid from Org") { row ->
            guidOrgSet.add(row.guid);
        }
        for (OrgBean bean : orgList) {
            if (!guidOrgSet.contains(bean.getGuid())) {
                org = new Org();
                org.setShortName(bean.getShortName())
                org.setOuid(bean.getOuid())
                org.setGuid(bean.getGuid())
                if (bean.fullName && bean.fullName.length() < 255) {
                    org.setFullName(bean.getFullName())
                } else if (bean.fullName) {
                    org.setFullName(bean.getFullName().substring(0, 254))
                }
                org.save(true)
            }
        }
    }


    private static void fillAreas() {
        Area.deleteAll(Area.list())
        SocOrgService service = new SocOrgServiceService().getSocOrgServicePort();
        AreaBeanList list = service.getAreaList();
        List<AreaBean> areaList = list.getAreaBeanList()
        Area area;
        for (AreaBean bean : areaList) {
            area = new Area();
            area.setCode(bean.getCode())
            area.setGuid(bean.getGuid())
            area.setName(bean.getName())

            area.save(true)
        }
    }

    private static void fillCategories() {
        Category.deleteAll(Category.list())
        SocOrgService service = new SocOrgServiceService().getSocOrgServicePort();
        CategoryBeanList list = service.getCategoryList()
        List<CategoryBean> areaList = list.getCategoryBeanList()
        Category cat;
        for (CategoryBean bean : areaList) {
            cat = new Category();
            cat.setCode(bean.getCode())
            cat.setGuid(bean.getGuid())
            cat.setName(bean.getName())

            cat.save(true)
        }
    }


    private static void fillSprSocServ() {
        SprService.deleteAll(SprService.list())
        SocOrgService service = new SocOrgServiceService().getSocOrgServicePort();
        ServiceBeanList serviceBeanList = service.getSprServiceBeanList()

        List<ServiceBean> serviceList = serviceBeanList.getServiceBeanList();
        SprService sprService;
        Set guidSprServiceSet = new HashSet<>();
        SprService.list().each { row ->
            guidSprServiceSet.add(row.guid);
        }
        int count = 0
        for (ServiceBean o : serviceList) {
            count++;
            if (!guidSprServiceSet.contains(o.guid)) {
                sprService = new SprService();
                sprService.setGuid(o.getGuid())
                if (o.name && o.name.length() < 255) {
                    sprService.setName(o.getName())
                } else if (o.name) {
                    sprService.setName(o.getName().substring(0, 254))
                }
                sprService.setCode(o.getCode())
                sprService.setServType(o.getServType())
                sprService.setCalcType(o.getCalcType())

                sprService.save(true)
            }
        }
    }

}
