<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html;charset=UTF-8">
    <title>sse demo</title>
</head>
<body>

<div id="msgFromPush"></div>
<script src="<c:url value="assets/js/jquery.js"/>"></script>
<script>
    if(!!window.EventSource){
        var source = new EventSource('push');
        s = "";
        source.addEventListener('message',function () {
            s += e.data + "<br/>";
            $('#msgFromPush').html(s);
        });
        
        source.addEventListener('open',function () {
            console.log("连接打开。");
        },false);

        source.addEventListener("error",function () {
            if(e.readyState == EventSource.CLOSED){
                console.log("连接关闭。");
            }else {
                console.log(e.readyState);
            }
        },false)
    }else{
        console.log("浏览器不支持SSE")
    }
</script>
</body>
</html>