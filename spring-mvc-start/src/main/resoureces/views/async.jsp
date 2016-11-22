<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html;charset=UTF-8">
    <title>async demo</title>
</head>
<body>

<script src="/assets/js/jquery.js"></script>
<script>
    deferred();

    function deferred() {
        $.get('defer',function (data) {
            console.log(data);
            deferred();
        });
    }
</script>
</body>
</html>