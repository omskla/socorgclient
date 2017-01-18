<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <title>Поиск</title>
</head>

<body>
<div id="list-education" class="content scaffold-list" role="main">
    <g:render template="/layouts/searchMenu" />
    <h1>Поиск организаций</h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>


    <g:form action="showOrgList">
        <label for="serv">Наименование услуги:</label>
        <g:autoCompletePrimary id="serv" name="serv"
                               domain='socorgclient.SprService'
                               searchField='name'
                               collectField='guid'
                               hidden='hiddenServGuid'
                               value=''/>
        <input type=hidden id="hiddenServGuid" name="hiddenServGuidName" value=""/>
        <g:actionSubmit value="искать" action="showOrgList"/>
    </g:form>
</div>

</body>
</html>