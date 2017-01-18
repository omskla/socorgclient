package socorgclient

class Org {
    Integer ouid
    String guid
    String fullName
    String shortName

    static constraints = {
        ouid nullable: false
        guid nullable: true
        fullName nullable: true
        shortName nullable: true
    }

    String toString() {
        fullName
    }
}

