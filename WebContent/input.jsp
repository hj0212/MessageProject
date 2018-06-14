<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="input.do" method="post">
        <table border="1">
            <th colspan="2">메시지 보내기</th>
            <tr>
                <td>
                    <input type="text" name="name" placeholder="아이디를 입력하세요.">
                </td>
                <td>
                    <input type="text" name="message" placeholder="메시지 내용을 입력하세요.">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="전송">
                    <button id="canbtn">취소</button>
                </td>
            </tr>
        </table>
    </form>
    <script>
        document.getElementById("canbtn").onclick = function() {
            location.href = "index.html"
        }
    </script>
</body>
</html>