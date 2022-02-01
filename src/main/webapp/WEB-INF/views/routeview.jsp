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
				<td>Source</td>
				<td>Destination</td>
				<td>Duration</td>
			</tr>
		
			<c:forEach items="${rList}" var="route">
			
				<tr>
				<form action="rides" method="post">
					<input name="routeId" style="display:none" value="${route.routeId}">
					<input name="action" value="BookRide" style="display:none"/>
					<td name="source" >${route.source}</td>
					<td name="destination" >${route.destination}</td>
					<td name="duration">${route.duration}</td>
					<td><input value="Book" type="submit" /></td>
					</form>
				</tr>
			
				
			</c:forEach>
			
			<form action="rides" method="post">
			<input name="action" value="seeRidesBooked" style="display:none"/>
			<input type="submit" value="Rides Booked" />
			</form>

		</table>


</body>
</html>