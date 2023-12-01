<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback Form</title>
</head>
<body>
<form action ="<%=request.getContextPath()%>/FeedbackFormDataCollection" method ="POST">

Name : <br>
<input type="text" name="name"> <br>     

Contact Number : <br>
<input type="text" name="contactno"> <br>

Feedback: <br>
<textarea name ="feedback" rows="5" cols="100"></textarea> 

<br>
<input type ="submit" name ="submit" value ="submit"> <br> 

</form>
</body>
</html>