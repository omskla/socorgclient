<%@ page import="socorgclient.TypeUson; socorgclient.Area; socorgclient.ReasonNeed" contentType="text/html;charset=UTF-8" %>
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


    <div class="beautifulDiv">

        <g:form action="showOrgList">
            <label for="serv">Наименование услуги:</label>
            <g:autoCompletePrimary id="serv" name="serv"
                                   domain='socorgclient.SprService'
                                   searchField='name'
                                   collectField='guid'
                                   hidden='hiddenServGuid'
                                   value=''
            class="xxx"
            />
            <input type=hidden id="hiddenServGuid" name="hiddenServGuidName" value=""/>
            %{--<g:actionSubmit value="искать" action="showOrgList"/><br/>--}%


        %{--- форма обслуживания (те указать формы, где эта услуга есть)- не показывать стационарные - (обязательно)--}%
        %{---  район области (округ г. Омска) - (не обязательно)--}%
        %{---	вид нуждаемости - (не обязательно)--}%
        %{---	категория- (не обязательно)--}%
        %{----}%

            <label for="formObsl">Форма обслуживания:</label>
            <g:select from="${TypeUson.list()}" name="formObsl" class="xxx"/><br/>
            <label for="area">Район области:</label>
            <g:select from="${Area.list()}" name="area" class="xxx"/><br/>
            <label for="vid">Вид нуждаемости:</label>
            <g:select from="${ReasonNeed.list()}" name="vid" class="xxx"/><br/>
            <label for="cat">Категория:</label>
            <g:select from="${socorgclient.Category.list()}" name="cat" class="xxx"/><br/>

            <g:actionSubmit value="искать" action="showOrgList"/>
        </g:form>

    </div>
</div>

</body>
</html>