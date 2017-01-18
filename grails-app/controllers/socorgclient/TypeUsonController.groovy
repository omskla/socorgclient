package socorgclient


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class TypeUsonController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond TypeUson.list(params), model: [typeUsonInstanceCount: TypeUson.count()]
    }

    def show(TypeUson typeUsonInstance) {
        respond typeUsonInstance
    }

    def create() {
        respond new TypeUson(params)
    }

    @Transactional
    def save(TypeUson typeUsonInstance) {
        if (typeUsonInstance == null) {
            notFound()
            return
        }

        if (typeUsonInstance.hasErrors()) {
            respond typeUsonInstance.errors, view: 'create'
            return
        }

        typeUsonInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'typeUsonInstance.label', default: 'TypeUson'), typeUsonInstance.id])
                redirect typeUsonInstance
            }
            '*' { respond typeUsonInstance, [status: CREATED] }
        }
    }

    def edit(TypeUson typeUsonInstance) {
        respond typeUsonInstance
    }

    @Transactional
    def update(TypeUson typeUsonInstance) {
        if (typeUsonInstance == null) {
            notFound()
            return
        }

        if (typeUsonInstance.hasErrors()) {
            respond typeUsonInstance.errors, view: 'edit'
            return
        }

        typeUsonInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'TypeUson.label', default: 'TypeUson'), typeUsonInstance.id])
                redirect typeUsonInstance
            }
            '*' { respond typeUsonInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(TypeUson typeUsonInstance) {

        if (typeUsonInstance == null) {
            notFound()
            return
        }

        typeUsonInstance.delete flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'TypeUson.label', default: 'TypeUson'), typeUsonInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'typeUsonInstance.label', default: 'TypeUson'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
