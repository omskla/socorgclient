import socorgclient.ReasonNeed
import socorgclient.TypeUson

class BootStrap {
    def init = { servletContext ->
        new TypeUson(description: 'Стационарная', code: "stationary").save(flush: true)
        new TypeUson(description: 'Полустационарная', code: "semistationary").save(flush: true)
        new TypeUson(description: 'Полустационарная, на дому', code: "semistathome").save(flush: true)
        new TypeUson(description: 'Полустационарная, стационарная', code: "statsemistat").save(flush: true)
        new TypeUson(description: 'Нестационарное', code: "nostationary").save(flush: true)
        new TypeUson(description: 'Комплексное', code: "complex").save(flush: true)

        new ReasonNeed(description: 'полная или частичная утрата способности либо возможности осуществлять самообслуживание, самостоятельно передвигаться, обеспечивать основные жизненные потребности в силу заболевания, травмы, возраста или наличия инвалидности', code: "utrata").save(flush: true)
        new ReasonNeed(description: 'наличие в семье инвалида или инвалидов, в том числе ребенка-инвалида или детей-инвалидов, нуждающихся в постоянном постороннем уходе', code: "haveinv").save(flush: true)
        new ReasonNeed(description: 'наличие ребенка или детей (в том числе находящихся под опекой, попечительством), испытывающих трудности в социальной адаптации', code: "havechild").save(flush: true)
        new ReasonNeed(description: 'отсутствие возможности обеспечения ухода (в том числе временного) за инвалидом, ребенком, детьми, а также отсутствие попечения над ними', code: "nouxod").save(flush: true)
        new ReasonNeed(description: 'наличие внутрисемейного конфликта, в том числе с лицами с наркотической или алкогольной зависимостью, лицами, имеющими пристрастие к азартным играм, лицами, страдающими психическими расстройствами, наличие насилия в семье', code: "konflict").save(flush: true)
        new ReasonNeed(description: 'отсутствие определенного места жительства, в том числе у лица, не достигшего возраста двадцати трех лет и завершившего пребывание в организации для детей-сирот и детей, оставшихся без попечения родителей', code: "bomj").save(flush: true)
        new ReasonNeed(description: 'отсутствие работы и средств к существованию', code: "nowork").save(flush: true)
        new ReasonNeed(description: 'наличие иных обстоятельств, которые нормативными правовыми актами субъекта Российской Федерации признаны ухудшающими или способными ухудшить условия жизнедеятельности граждан', code: "other").save(flush: true)

    }
    def destroy = {
    }
}
