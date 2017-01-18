<%@ page import="socorgclient.SprService; grails.converters.JSON" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main">
    <title>Список организаций социального обслуживания</title>
</head>

<body>
<a href="#list-education" class="skip" tabindex="-1"><g:message code="default.link.skip.label"
                                                                default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
    <ul>
        %{--<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>--}%
        <li><g:link class="list" controller="command" action="orgList">Все организации</g:link></li>
    </ul>
</div>

%{--<div class="nav" role="navigation">--}%
%{--<ul>--}%
%{--<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>--}%
%{--<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>--}%
%{--</ul>--}%
%{--</div>--}%
<div id="list-education" class="content scaffold-list" role="main">
    <h1>Список организаций</h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <table>
        <thead>
        <tr>
            <th>
                <g:form>
                    <label for="searchText">Поиск по наименованию организации:</label><input type="text"
                                                                                             name="searchText"
                                                                                             id="searchText"/>
                    <g:actionSubmit value="искать" action="orgList"/>
                </g:form>
            </th>
            <th>
                <g:link controller="org" action="search">Поиск</g:link>
            </th>

            %{--<g:select name="serv" from="${SprService.list()}"  optionKey="id" value="${id}" class="many-to-one"/>--}%
            %{--<g:autocomplete--}%
            %{--id="test"--}%
            %{--name="test.id"--}%
            %{--domain='socorgclient.SprService'--}%
            %{--searchField='name'--}%
            %{--collectField='guid'--}%
            %{--value="${guid}"--}%
            %{--max="7"--}%
            %{--size="120"--}%
            %{--/>--}%

            %{--<g:autoCompletePrimary id="primarySearch1121" name="myCountryId"--}%
            %{--domain='socorgclient.SprService'--}%
            %{--searchField='name'--}%
            %{--collectField='guid'--}%
            %{--hidden='hidden2'--}%
            %{--setId="secondarySearch111"--}%
            %{--value=''/>--}%
            %{--<input type=hidden id="hidden2" name="hiddenField" value=""/>--}%


            %{--<g:select id="serv" name="serv.guid" from="${socorgclient.SprService.list()}" optionKey="id" value="${sprservice?.guid}" class="many-to-one" noSelection="['null': '']"/>--}%
        </tr>
        </thead>
        <tbody>
        <g:each in="${orgList}" status="i" var="orgInstance">
            <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                %{--<td><g:link action="showOrgInf" id="${orgInstance.getOuid()}" >${orgInstance.getOuid()} </g:link></td>--}%
                %{--<td><g:link action="showOrgInf" id="${orgInstance.getOuid()}" params="[bean: new JSON(orgInstance)]">${orgInstance.getFullName()}</g:link></td>--}%
                <td colspan="2"><g:link action="showOrgInf" id="${orgInstance.getOuid()}"
                                        params="[guid: orgInstance.guid]">${orgInstance.getFullName()}</g:link></td>
                %{--<td>${fieldValue(bean: educationInstance, field: "description")}</td>--}%
            </tr>
        </g:each>
        </tbody>
    </table>


    <div class="pagination">
        <g:paginate total="${orgInstanceCount}" action="orgList"/>
    </div>
</div>
</body>
</html>
