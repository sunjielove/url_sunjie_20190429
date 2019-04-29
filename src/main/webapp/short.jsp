<%--
  Created by IntelliJ IDEA.
  User: sunjie
  Date: 2019/4/29
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false"%>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/theme.css" type="text/css">
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.js"></script>
</head>

<body>
<div class="py-5">
    <div class="container">
        <div class="row">
            <div>
                <button type="button" class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/index.jsp'"  >生成短链</button></div>&nbsp;&nbsp;
            <button type="button" class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/short.jsp'" >通过短链跳转</button></div>
    </div>
    <div class="col-md-12">
        <form id="fromItem" method="post" action="${pageContext.request.contextPath}/redirectUrl.action">
            <div class="form-group"> <label>请输入短网址</label> <input type="text" class="form-control" name="shortUrl"> <small class="form-text text-muted"></small> </div>

                <button id="btn3" type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</div>
</div>
</div>
</body>
<script type="text/javascript">
    // $(document).ready(function() {
    //     $("#btn3").click(function() {
    //         $.ajax({
    //             type:"get",
    //             dataType: "text",
    //             url:"",
    //             data:$('#fromItem').serialize(),
    //             contentType:"application/x-www-form-urlencoded;charset=UTF-8",
    //             success:function(data,statue){
    //                 alert('成功了:'+data.toString());
    //             },
    //             error:function(statue1,s){
    //                 alert("失败了:"+s)
    //             }
    //         });
    //     })
    // })
</script>

</html>
