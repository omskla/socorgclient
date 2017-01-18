<%@ page import="socorgclient.Org" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main">
    <title>${orgInfBean.orgBean.shortName}s</title>
</head>
<body>
<a href="#list-education" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
    <ul>
        %{--<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>--}%
        <li><g:link class="list" action="orgList">Список организаций</g:link></li>
    </ul>
</div>
<div id="list-education" class="content scaffold-list" role="main">
    <h1>${orgInfBean.orgBean.fullName}</h1>
    %{--<hr/>--}%


    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <div class="dialog" id="inform" >
        <label for="founder">Учредитель: </label><span  class="myfont" id="founder"> ${orgInfBean.founder}</span><br/>
        <label for="founder">Сокращенное наименование: </label><span  class="myfont" id="sokr"> ${socorgclient.Org.findByGuid(orgInfBean.guid).shortName}</span><br/>
        <label for="street">Адрес: </label><span class="myfont" id="street"> ${orgInfBean.street}</span><br/>
        <label for="vid">Вид учреждения: </label><span class="myfont" id="vid"> ${orgInfBean.vid}</span><br/>
        <label for="tip">Форма социального обслуживания: </label><span class="myfont"  id="tip"> ${orgInfBean.tip}</span><br/>
        <label for="dt">Дата государственной регистрации: </label><span class="myfont" id="dt"> <g:formatDate date="${orgInfBean?.dtreg?.toGregorianCalendar()?.getTime()}" /></span><br/>
        <label for="regNum">Регистрационный номер: </label><span class="myfont" id="regNum"> ${orgInfBean.regNum}</span><br/>


        <label for="ruk">Руководитель: </label><span class="myfont" id="ruk"> ${orgInfBean.getHead()}</span><br/>
        <label for="tel">Телефон: </label><span class="myfont" id="tel"> ${orgInfBean.getTel()}</span><br/>
        %{--<label for="bux">Главный бухгалтер: </label><span class="myfont" id="bux"> ${orgInfBean.getBux()}</span><br/>--}%
        <label for="hours">Часы приема: </label><span class="myfont" id="hours"> ${orgInfBean.getWorkTime()}</span><br/>
        <label for="email">Электронная почта: </label><span class="myfont" id="email"> ${orgInfBean.email}</span><br/>
    </div>




    %{--<table table table-striped>--}%
        %{--<thead>--}%
        %{--<tr>--}%

            %{--<g:sortableColumn property="code" title="${message(code: 'education.code.label', default: 'Руководитель')}" />--}%
            %{--<g:sortableColumn property="code" title="${message(code: 'education.code.label', default: 'Телефон')}" />--}%
            %{--<g:sortableColumn property="code" title="${message(code: 'education.code.label', default: 'Главный бухгалтер')}" />--}%
            %{--<g:sortableColumn property="description" title="${message(code: 'education.description.label', default: 'Часы приема')}" />--}%
        %{--</tr>--}%
        %{--</thead>--}%
        %{--<tbody>--}%

            %{--<tr >--}%


                %{--<td><g:link action="show" id="dfdfdfd">${orgInfBean.getHead()}</g:link></td>--}%
                %{--<td>${orgInfBean.getTel()}</td>--}%
                %{--<td>${orgInfBean.getBux()}</td>--}%
                %{--<td>${orgInfBean.getWorkTime()}</td>--}%
                %{--<td>${fieldValue(bean: educationInstance, field: "description")}</td>--}%

            %{--</tr>--}%
        %{--</tbody>--}%
    %{--</table>--}%



    <ul id="limenu" class="nav nav-tabs" role="tablist">
        <li class="active"><a id="infSubDivisionBut" href="#">Подразделения </a></li>
        <li ><a id="infOrgBut" href="#">Лицензии</a></li>
        <li><a  id="infServiceBut" href="#">Предоставляемые услуги</a></li>

        %{--<li><a id="infStafBut" href="#">Информация о штате </a></li>--}%

        <li><a id="checkBut" href="#">Информация о проверках</a></li>
    <li><a id="statBut" href="#">Опыт работы</a></li>
    </ul>

<div class="dialog" id="infOrg_div" style="display: none;">
    <table table table-striped>
    <thead>
    <tr>
    %{--<g:sortableColumn property="code" title="${message(code: 'education.code.label', default: 'Вид деятельности')}" />--}%
    %{--<g:sortableColumn property="code" title="${message(code: 'education.code.label', default: 'Кем выдана')}" />--}%
    %{--<g:sortableColumn property="code" title="${message(code: 'education.code.label', default: 'Дата выдачи')}" />--}%
    %{--<g:sortableColumn property="description" title="${message(code: 'education.description.label', default: 'Дата окончания срока лицензии')}" />--}%
<th>Вид деятельности</th>
<th>Кем выдана</th>
<th>Дата выдачи</th>
<th>Дата окончания срока лицензии</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${licenseBeanList}" var="obj">
    <tr >
    <td>${obj.vid}</td>
    <td>${obj.orgLicense}</td>
    <td><g:formatDate date="${obj?.dtStart?.toGregorianCalendar()?.getTime()}"/></td>

        <td>
        <g:if test="${obj?.dtEnd!=null}">
            <g:formatDate date="${obj?.dtEnd?.toGregorianCalendar()?.getTime()}"/>
        </g:if>
            <g:else>
               -----
            </g:else>
        </td>

    </tr>
        </g:each>
    </tbody>
    </table>
    </div>

%{--информация об организации--}%
    %{--<div class="dialog" id="infOrg_div" >--}%
       %{--<label for="founder">Учредитель: </label><span  class="myfont" id="founder"> ${orgInfBean.founder}</span><br/>--}%
    %{--<label for="street">Адрес: </label><span class="myfont" id="street"> ${orgInfBean.street}</span><br/>--}%
    %{--<label for="vid">Вид учреждения: </label><span class="myfont" id="vid"> ${orgInfBean.vid}</span><br/>--}%
    %{--<label for="tip">Тип учреждения: </label><span class="myfont"  id="tip"> ${orgInfBean.tip}</span><br/>--}%
    %{--<label for="dt">Дата государственной регистрации: </label><span class="myfont" id="dt"> <g:formatDate date="${orgInfBean?.dtreg?.toGregorianCalendar()?.getTime()}" /></span><br/>--}%
    %{--<label for="regNum">Регистрационный номер: </label><span class="myfont" id="regNum"> ${orgInfBean.regNum}</span><br/>--}%
    %{--</div>--}%



    <div class="dialog" id="infService_div" style="display: none;">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Наименование услуги</th>
                <th>Тип услуги</th>
                <th>Тариф</th>
                <th>Норматив</th>
            </tr>
            </thead>
            <tbody>
            <g:each in="${serviceBeanList}" var = "beanL">
                <tr class = "radius">
                    <td>
                        ${beanL.name}
                    </td>
                    <td>
                        ${beanL.typeService}
                    </td>
                    <td>
                      ${beanL.tarif}
                    </td>
                    <td>
                       ${beanL.norm}
                    </td>
                </tr>
            </g:each>
            </tbody>
        </table>
    </div>

%{--информация о штате--}%
    %{--<div class="dialog" id="infStaf_div" style="display: none;">--}%
        %{--<table class="table table-striped">--}%
            %{--<thead>--}%
            %{--<tr>--}%
                %{--<th>Должность</th>--}%
                %{--<th>ФИО</th>--}%
            %{--</tr>--}%
            %{--</thead>--}%
            %{--<tbody>--}%
            %{--<g:each in="${staffBeanList}" var = "staff">--}%
                %{--<tr class = "radius">--}%
                    %{--<td>--}%
                        %{--${staff.post}--}%
                    %{--</td>--}%
                    %{--<td>--}%
                        %{--${staff.employee}--}%
                    %{--</td>--}%

                %{--</tr>--}%
            %{--</g:each>--}%
            %{--</tbody>--}%
        %{--</table>--}%
    %{--</div>--}%
%{--информация о штате--}%
<div class="dialog" id="infSubDivision_div" >
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Наименование</th>
            <th>Тип подразделения</th>
            <th>Вместимость подразделения</th>
            <th>Свободно</th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${depList}" var = "dep">
            <tr class = "radius">
                <td>
                    ${dep.fullName}
                </td>
                <td>
                    ${dep.typeDep}
                </td>
                <td>
                    ${dep.capacity}
                </td>
                <td>
                    ${dep.free}
                </td>

            </tr>
        </g:each>
        </tbody>
    </table>
</div>

<div class="dialog" id="check_div" style="display: none;">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Дата проведения проверки</th>
            <th>Информация о результатах</th>
        </tr>
        </thead>
        <tbody>
    <g:each in="${checkList}" var = "check">
        <tr>
        <td>
            <g:formatDate date="${check?.dt?.toGregorianCalendar()?.getTime()}"/>
        </td>
        <td>
            ${check?.result}
        </td>
</tr>

</g:each>
</tbody>
        </table>
</div>
    %{--прочая информация--}%
    <div class="dialog" id="stat_div" style="display: none;">
    <span class="myfont" id="about">${orgInfBean.about}</span><br/>



    </div>
%{--меню с кнопками слева--}%
    %{--<td class="menu" width="25%" >--}%
    %{--<div class="nav2"><span class="menuButton"><a id="infOrgBut"> Об организации  </a></span></div>--}%
    %{--<div class="nav2"><span class="menuButton"><a id="infServiceBut"> Услуги </a></span></div>--}%
    %{--<div class="nav2"><span class="menuButton"><a id="infStafBut">Информация о штате </a></span></div>--}%
    %{--<div class="nav2"><span class="menuButton"><a id="statBut">Статистика</a></span></div>--}%
    %{--</td>--}%


    <g:javascript>
    $("#infOrgBut").click(function () {
        $("#limenu").find("li").removeClass("active");

        var  prev = $("#infOrgBut").parent();
        prev.addClass("active");
        $("#infSubDivision_div").hide();
        $("#infOrg_div").show();
        $("#infService_div").hide();
        $("#infStaf_div").hide();
        $("#stat_div").hide();
        $("#check_div").hide();
    });

    $("#infServiceBut").click(function () {
        $("#limenu").find("li").removeClass("active");
        var  prev = $("#infServiceBut").parent();
        prev.addClass("active");
        $("#infOrg_div").hide();
        $("#infService_div").show();
        $("#infStaf_div").hide();
        $("#stat_div").hide();
        $("#infSubDivision_div").hide();
        $("#check_div").hide();
    });




    $("#infSubDivisionBut").click(function () {
        $("#limenu").find("li").removeClass("active");
        var  prev = $("#infSubDivisionBut").parent();
        prev.addClass("active");
        $("#infSubDivision_div").show();
        $("#infOrg_div").hide();
        $("#infService_div").hide();
        $("#stat_div").hide();
        $("#check_div").hide();
    });

//
//    $("#infStafBut").click(function () {
//        $("#limenu").find("li").removeClass("active");
//        var  prev = $("#infStafBut").parent();
//        prev.addClass("active");
//        $("#infStaf_div").show();
//        $("#infOrg_div").hide();
//        $("#infService_div").hide();
//        $("#stat_div").hide();
//    });
//

    $("#statBut").click(function () {
        $("#limenu").find("li").removeClass("active");
        var  prev = $("#statBut").parent();
        prev.addClass("active");
        $("#stat_div").show();
        $("#infOrg_div").hide();
        $("#infSubDivision_div").hide();
        $("#infService_div").hide();
        $("#infStaf_div").hide();
        $("#check_div").hide();
    });


    $("#checkBut").click(function () {
        $("#limenu").find("li").removeClass("active");

        var  prev = $("#checkBut").parent();
        prev.addClass("active");
        $("#infSubDivision_div").hide();
        $("#infOrg_div").hide();

        $("#check_div").show();
        $("#infService_div").hide();
        $("#infStaf_div").hide();
        $("#stat_div").hide();
    });


</g:javascript>
</div>
</body>
</html>
