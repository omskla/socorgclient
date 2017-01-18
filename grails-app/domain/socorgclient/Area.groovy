package socorgclient

class Area {
    String name;
    String code;
    String guid;

    static constraints = {
        name nullable: false
        guid nullable: false
        code nullable: false
    }

    @Override
    public String toString() {
        return name
    }
}
