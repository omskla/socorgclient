package socorgclient

import cxf.client.OrgBean
import cxf.client.OrgBeanList
import cxf.client.SocOrgService
import cxf.client.SocOrgServiceService

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class OrgController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    static scaffold = true
//    def index(Integer max) {
//        params.max = Math.min(max ?: 10, 100)
//        respond Org.list(params), model: [orgInstanceCount: Org.count()]
//    }
//
//    def show(Org orgInstance) {
//        respond orgInstance
//    }
//
//    def create() {
//        respond new Org(params)
//    }
//
//    @Transactional
//    def save(Org orgInstance) {
//        if (orgInstance == null) {
//            notFound()
//            return
//        }
//
//        if (orgInstance.hasErrors()) {
//            respond orgInstance.errors, view: 'create'
//            return
//        }
//
//        orgInstance.save flush: true
//
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.created.message', args: [message(code: 'orgInstance.label', default: 'Org'), orgInstance.id])
//                redirect orgInstance
//            }
//            '*' { respond orgInstance, [status: CREATED] }
//        }
//    }
//
//    def edit(Org orgInstance) {
//        respond orgInstance
//    }
//
//    @Transactional
//    def update(Org orgInstance) {
//        if (orgInstance == null) {
//            notFound()
//            return
//        }
//
//        if (orgInstance.hasErrors()) {
//            respond orgInstance.errors, view: 'edit'
//            return
//        }
//
//        orgInstance.save flush: true
//
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.updated.message', args: [message(code: 'Org.label', default: 'Org'), orgInstance.id])
//                redirect orgInstance
//            }
//            '*' { respond orgInstance, [status: OK] }
//        }
//    }
//
//    @Transactional
//    def delete(Org orgInstance) {
//
//        if (orgInstance == null) {
//            notFound()
//            return
//        }
//
//        orgInstance.delete flush: true
//
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Org.label', default: 'Org'), orgInstance.id])
//                redirect action: "index", method: "GET"
//            }
//            '*' { render status: NO_CONTENT }
//        }
//    }
//
//    protected void notFound() {
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.not.found.message', args: [message(code: 'orgInstance.label', default: 'Org'), params.id])
//                redirect action: "index", method: "GET"
//            }
//            '*' { render status: NOT_FOUND }
//        }
//    }

    def search() {
    }

    def searchByForm() {
    }

    def searchByServ() {

    }

    def showOrgList() {
        SocOrgService service = new SocOrgServiceService().getSocOrgServicePort();
        OrgBeanList list = service.getOrgBeanListByServGuid(params.hiddenServGuidName)

        List<String> guidList = new ArrayList<>()
        for (OrgBean orgBean : list.orgBeanList) {
            guidList.add(orgBean.guid)
        }

        params.max = Math.min(10, 100)
        if (guidList.isEmpty()) {
            flash.message = "ничего не найдено..."
            redirect(action: "search")
            return;
        }
        def c = Org.createCriteria()
        def results = c.list(max: params.max, offset: params.offset) {
            inList('guid', guidList)
        }

        def total = Org.countByGuidInList(guidList)

        [orgList: results, orgInstanceCount: results.totalCount, hiddenServGuidName: params.hiddenServGuidName]
    }

}
