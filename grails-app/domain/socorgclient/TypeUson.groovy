package socorgclient
/**
 * ????? ????????????
 */
class TypeUson {
    String description
    String code

    static constraints = {
        description nullable: false
        code nullable: false
    }

    String toString() {
        description
    }

}
