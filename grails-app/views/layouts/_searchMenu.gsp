<%--
  Created by IntelliJ IDEA.
  User: la
  Date: 10-Nov-16
  Time: 04:31 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<div class="nav" role="navigation">
    <ul>
        %{--<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>--}%
        <li><g:link class="list" controller="command" action="orgList">Все организации</g:link></li>
        <li><g:link class="list" controller="org" action="searchByForm">Поиск по формам обслуживания</g:link></li>
        <li><g:link class="list" controller="org" action="searchByServ">Поиск по конкретной услуге</g:link></li>
    </ul>
</div>
</body>
</html>