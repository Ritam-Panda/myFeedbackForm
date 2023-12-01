<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="<%=request.getContextPath()%>/SearchFeedbackDataCollection" method ="POST">
Contact Number : <br>
<input type="text" name="contactno"> <br>
<br>
<input type ="submit" name ="submit"> <br>
</form>
</body>
</html>