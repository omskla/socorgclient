<style type="text/css" media="screen">
.status1 {
    background-color: #eee;
    border: .2em solid #fff;
    margin: 0em 1em 0em;
    padding: 1em;
    width: 10em;
    height: 9em;
    float: none;
    -moz-box-shadow: 0px 0px 1.25em #ccc;
    -webkit-box-shadow: 0px 0px 1.25em #ccc;
    box-shadow: 0px 0px 1.25em #ccc;
    -moz-border-radius: 0.6em;
    -webkit-border-radius: 0.6em;
    border-radius: 0.6em;
    text-align: left;

}

</style>


<div id="header">
    <div class="nav" role="navigation">


        <ul class="stat">


            <li >
                <g:link controller="command" action="orgList">
                    <img src="${resource(dir: 'images/ico', file: 'work.ico')}" alt="Grails"/>
                    <br/>
                    &nbsp;&nbsp;Список Организаций
                </g:link>
            </li>


            <li>
                <div class="status1" role="complementary">
                    <ul>
                        <li><a href="${createLink(controller: "support")}">Поддержка</a></li>

                    %{--<sec:ifAnyGranted roles="ROLE_USER, ROLE_ADMIN"> <li><a onclick="${remoteFunction(--}%
                            %{--controller: "org",--}%
                            %{--action: 'ohvatYear',--}%
                            %{--onLoading: 'showSpinner(\'png\')',--}%
                            %{--onSuccess:  "updateTd(data,\'png\')",--}%
%{--//                            params: '\'year=\'+document.getElementById(\'year\').value'--}%

                    %{--)}" >Что не хватает<span id ="png"></span></a></li>                 </sec:ifAnyGranted>--}%
                        <li><a href="${createLink(uri: "/")}">На главную </a></li>
                        <li><a href="${createLink(controller: "logout", action: "index")}">Выйти</a></li>

                    </ul>

                </div>

            </li>
         </ul>
    </div>
</div>
