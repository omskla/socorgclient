package socorgclient

import cxf.client.OrgBean
import cxf.client.OrgInfBean
import cxf.client.SocOrgService
import cxf.client.SocOrgServiceService
import cxf.client.SubDivisionBean

class CommandController {

    def orgList() {
        params.max = Math.min(10, 100)
        def orgList
        def total
        if (null == params.searchText || "".equals(params.searchText)) {
            orgList = Org.list(params)
            total = Org.count
        } else {
            orgList = Org.findAllByFullNameIlike("%${params.searchText}%", params)
            total = Org.countByFullNameIlike("%${params.searchText}%")//todo
        }

        [orgList: orgList, orgInstanceCount: total]
    }

    def runjob() {
        GetOrgListJob.triggerNow();
    }

    def getOrgListByServGuid(String servGuid) {
        SocOrgService service = new SocOrgServiceService().getSocOrgServicePort();

        return service.getOrgBeanListByServGuid(servGuid).orgBeanList
    }

    def showOrgInf() {
        def bean = Org.findByGuid(params.guid);
        def serviceBean = new OrgBean();
        serviceBean.setOuid(bean.ouid)
        serviceBean.setShortName(bean.shortName)
        serviceBean.setGuid(bean.guid)
        serviceBean.setFullName(bean.fullName)
        SocOrgService service = new SocOrgServiceService().getSocOrgServicePort();
        OrgInfBean orgInfBean = service.getOrgInfBeanById(serviceBean)
        List subDivisionList = service.getSubDivisionBeanListByGuidOrg(bean.getGuid()).subDivisionBeanList
        SubDivisionBean divisionBean = subDivisionList.get(0);
        List serviceBeanList = service.getServiceBeanListByGuidDep(bean.guid).getServiceBeanList()
        //all sprServiceList
//        ServiceBeanList sprServiceBeanList = service.getSprServiceBeanList();
        List staffBeanList = service.getStaffListByGuidDep(divisionBean.guid).getStaffBeanList()
        List licenseBeanList = service.getLicenseInfByGuidOrg(serviceBean.guid).getLicenseBeanList()
        List depList = service.getSubDivisionBeanListByGuidOrg(serviceBean.guid).getSubDivisionBeanList()
        List checkList = service.getCheckInfByGuidOrg(serviceBean.guid).getCheckBeanList()
        [orgInfBean: orgInfBean, serviceBeanList: serviceBeanList, staffBeanList: staffBeanList, licenseBeanList: licenseBeanList, depList: depList, checkList: checkList]
    }

}