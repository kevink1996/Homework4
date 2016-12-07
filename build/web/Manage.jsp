<%--Copyright Chris Gerencser and Kevin Kowalsky--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="includes/header.html" />

<div class ="menu">
  <h2>Currently checked out books</h2>
  <table>
    <tr>
      <th>Patron Name</th>
      <th>Email Address</th>
      <th>Book Title</th>
      <th>Due Date</th>
      <th>Overdue</th>
      <th></th>
    </tr>
      <c:forEach var="user" items="${users}">
	<tr>
          <td>${user.firstName} ${user.lastName}</td>
          <td>${user.email}</td>
	  <td>${user.book}</td>
	  <td>${user.dueDate}</td> 
          <td>${user.overDue}</td>
	  <td><a class="check" href="library?action=delete_user&amp;email=${user.email}">Check in</a></td>
	</tr>
      </c:forEach>
	</table>
	<a href="index.jsp">Return to front page</a>
</div>
<br>
<c:import url="includes/footer.jsp" />

