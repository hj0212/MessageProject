<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <table border="1">
		<tr>
			<th colspan="3">메시지 출력</th>
        </tr>
        <tr>
            <th>번호</th>
            <th>이름</th>
            <th>메시지</th>
        </tr>
		<c:forEach items="${msgList}" var="msg">
			<td>${msg.message_id}</td>		
			<td>${msg.name}</td>		
			<td>${msg.message}</td>		
		</c:forEach>
		<tr>
			<td colspan="3" style="text-align: center;"><input type="button" value="돌아가기"></td>
		</tr>
	</table>
</body>
</html>