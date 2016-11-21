<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html;charset=UTF-8">
    <title>converter page</title>
</head>
<body>

<div id="resp"></div>
    <input type="button" onclick="reg();" value="请求">


<script src="assets/js/jquery.js" type="text/javascript"></script>
<script>
    $.ajax({
        url:"convert",
        data:"1-wangyuefei",
        type:"POST",
        contentType:"application/x-wisely",
        success:function (data) {
            $("#resp").html(data);
        }
    })
</script>
</body>
</html>