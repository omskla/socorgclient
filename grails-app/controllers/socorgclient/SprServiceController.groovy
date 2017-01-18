package socorgclient


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class SprServiceController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    static scaffold = true

//    def index(Integer max) {
//        params.max = Math.min(max ?: 10, 100)
//        respond SprService.list(params), model: [sprServiceInstanceCount: SprService.count()]
//    }
//
//    def show(SprService sprServiceInstance) {
//        respond sprServiceInstance
//    }
//
//    def create() {
//        respond new SprService(params)
//    }
//
//    @Transactional
//    def save(SprService sprServiceInstance) {
//        if (sprServiceInstance == null) {
//            notFound()
//            return
//        }
//
//        if (sprServiceInstance.hasErrors()) {
//            respond sprServiceInstance.errors, view: 'create'
//            return
//        }
//
//        sprServiceInstance.save flush: true
//
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.created.message', args: [message(code: 'sprServiceInstance.label', default: 'SprService'), sprServiceInstance.id])
//                redirect sprServiceInstance
//            }
//            '*' { respond sprServiceInstance, [status: CREATED] }
//        }
//    }
//
//    def edit(SprService sprServiceInstance) {
//        respond sprServiceInstance
//    }
//
//    @Transactional
//    def update(SprService sprServiceInstance) {
//        if (sprServiceInstance == null) {
//            notFound()
//            return
//        }
//
//        if (sprServiceInstance.hasErrors()) {
//            respond sprServiceInstance.errors, view: 'edit'
//            return
//        }
//
//        sprServiceInstance.save flush: true
//
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.updated.message', args: [message(code: 'SprService.label', default: 'SprService'), sprServiceInstance.id])
//                redirect sprServiceInstance
//            }
//            '*' { respond sprServiceInstance, [status: OK] }
//        }
//    }
//
//    @Transactional
//    def delete(SprService sprServiceInstance) {
//
//        if (sprServiceInstance == null) {
//            notFound()
//            return
//        }
//
//        sprServiceInstance.delete flush: true
//
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.deleted.message', args: [message(code: 'SprService.label', default: 'SprService'), sprServiceInstance.id])
//                redirect action: "index", method: "GET"
//            }
//            '*' { render status: NO_CONTENT }
//        }
//    }
//
//    protected void notFound() {
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.not.found.message', args: [message(code: 'sprServiceInstance.label', default: 'SprService'), params.id])
//                redirect action: "index", method: "GET"
//            }
//            '*' { render status: NOT_FOUND }
//        }
//    }

}
