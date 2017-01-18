package socorgclient
//guid, a_name, a_code, A_SOC_SERV_TYPE, A_CALC_TYPE
/**
 * ???? ?????
 */
class SprService {
    String guid
    String name
    String code
    Integer servType
    String calcType

    static constraints = {
        guid nullable: false
        name nullable: true
        code  nullable: true
        servType  nullable: true
        calcType  nullable: true
    }

    @Override
    public String toString() {
        return name
    }
}
