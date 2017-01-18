<%@ page import="socorgclient.Area; socorgclient.ReasonNeed; socorgclient.Org; socorgclient.TypeUson" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <title>Поиск</title>
</head>

<body>
<div id="list-education" class="content scaffold-list" role="main">
    <g:render template="/layouts/searchMenu"/>
    <h1>Поиск организаций по формам обслуживания</h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
%{---	форма обслуживания--}%
%{---	вид нуждаемости--}%
%{---	категория--}%
%{---	местоположение--}%

    <div class="beautifulDiv">
        <g:form action="showOrgList">
            <label for="formObsl">Форма обслуживания:</label>
            <g:select from="${TypeUson.list()}" name="formObsl" class="xxx" /><br/>
            <label for="vid">Вид нуждаемости:</label>
            <g:select from="${ReasonNeed.list()}" name="vid" class="xxx"/><br/>
            <label for="cat">Категория:</label>
            <g:select from="${socorgclient.Category.list()}" name="cat" class="xxx"/><br/>
            <label for="area">Местоположение:</label>
            <g:select from="${Area.list()}" name="area" class="xxx"/><br/>

            <g:actionSubmit value="искать" action="showOrgList"/>
        </g:form>
    </div>


</div>

</body>
</html>