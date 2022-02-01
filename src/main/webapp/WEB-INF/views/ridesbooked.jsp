<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	

		<table style="with: 80%">
			<tr>
				<td>Source Booked</td>
				<td>Destination Booked</td>
			</tr>
		
			<c:forEach items="${rList}" var="rides">
			
				<tr>
					<td name="source" >${rides.source}</td>
					<td name="destination" >${rides.destination}</td>
					
				</tr>
			
				
			</c:forEach>
			
			<form action="routes" method="post">
					<td><input value="Return" type="submit" /></td>
			</form>

		</table>


</body>
</html>