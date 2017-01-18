package socorgclient

import grails.transaction.Transactional
import groovy.sql.GroovyRowResult
import groovy.sql.Sql

@Transactional
class LocalDAOImplService  implements DAOInterface{
    def dataSource
    def List executeQueryDbManyRows(String queryCode,String operator){
        Sql sql = Sql.newInstance(dataSource)
         List<GroovyRowResult> res;

//         String queryStr = QueryDb.findByCode(queryCode).queryStr;
        String actQuery
//        if(yearStr!=null)
//            actQuery = queryStr.replaceAll("#year#",yearStr)
//        if(idOrg!=null)
//            actQuery = actQuery.replaceAll("#idOrg#",idOrg)
//        if(operator!=null)
//            actQuery = actQuery.replaceAll("#operator#",operator)

        try {
            res = sql.rows("select  guid from org")
        } catch (Exception e) {
            println(e.getLocalizedMessage())
        }finally{
            sql.close()
        }
        Set<String> foo = new HashSet<String>();
        GroovyRowResult result;
        for(Object o: res){
           result = o;
            foo.add(result.get("GUID"));
        }

        return res;
    }

    def serviceMethod() {

    }
}
