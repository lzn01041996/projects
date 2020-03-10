<%@ page contentType="text/html" pageEncoding="UTF-8" session = "false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="pageTitle" value="Duke足球联赛: 添加新联赛" />

<html>
    <head>
        <title>${pageTitle}</title>
        <script src="https://cdn.jsdelivr.net/npm/vue@2.5.21/dist/vue.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
        <script>
            function yearfun() {
                $.post({
                    url: "${pageContext.request.contextPath}/confirms",
                    data: {"year":$("#year").val()},
                    success:function (data) {
                        console.log(data)
                        if (data=="ok"){
                            $("#yearInfo").css("color","green")
                        }
                        $("#yearInfo").css("color","red")
                        $("#yearInfo").html(data)

                    }
                })


            }
            function titlefun() {
                $.post({
                    url: "${pageContext.request.contextPath}/confirm",
                    data: {"title":$("#title").val()},
                    success:function (data) {
                        if (data=="ok"){
                            $("#titleInfo").css("color","green")
                        }
                        $("#titleInfo").css("color","red")
                        $("#titleInfo").html(data)

                    }
                })


            }
            function formFun() {
                var year = $("#year").val()
                var title = $("#title").val()
                if(year=="" || year==null){
                    alert("日期不能为空！")
                    return false;
                }
                if(title=="" || title==null){
                    alert("标题不能为空！")
                    return false;
                }



            }
        </script>
    </head>
    <body>

        <!-- Page Heading -->
        <table border='1' cellpadding='5' cellspacing='0' width='400'>
            <tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>
                <td><h3>${pageTitle}</h3></td>
            </tr>
        </table>
            
        <p>本页面用于创建新联赛</p>
            
        <form action='/admin/addleague' method='POST' onsubmit="formFun()">
                                  年 份：<input type='text' name='year' id="year" onblur="yearfun()" ><span id="yearInfo">${msg}</span> <br/><br/>
                              季 节：<select name='season'>
                <option value='Spring'>Spring</option>
                <option value='Summer'>Summer</option>
                <option value='Fall'>Fall</option>
                <option value='Winter'>Winter</option>
            </select> <br/><br/>
                              标 题：<input type='text' name='title' id="title" onblur="titlefun()"><span id="titleInfo">${msg}</span> <br/><br/>
            <input type='submit' value='添加联赛' />
        </form>
         
    </body>
</html>

