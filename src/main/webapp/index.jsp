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
                <form id="fromItem" method="post">
                    <div class="form-group"> <label>请输入长网址</label> <input type="text" class="form-control" name="longUrl"> <small class="form-text text-muted"></small> </div>
                    <div class="form-group"> <label>请选择你的短网址的前缀</label><br/><input type="radio" name="shortPrefix" id="preFix1" value="goo.cn" checked="checked" />goo.cn
                        <input type="radio" name="shortPrefix" id="preFix2" value="sj.cn" />sj.cn<br />
                        <button id="btn3" type="button" class="btn btn-primary">Submit</button></div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    $(document).ready(function() {
        $("#btn3").click(function() {
            $.ajax({
                type:"post",
                dataType: "text",
                url:"${pageContext.request.contextPath}/getShortUrl.action",
                data:$('#fromItem').serialize(),
                contentType:"application/x-www-form-urlencoded;charset=UTF-8",
                success:function(data,statue){
                    alert('短链为:'+data.toString());
                },
                error:function(statue1,s){
                    alert("失败了:"+s)
                }
            });
        })
    })
</script>

</html>