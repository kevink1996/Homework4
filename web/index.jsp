<%--Copyright Chris Gerencser and Kevin Kowalsky--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="includes/header.html" />

  <div class ="menu">
    <a href="library?action=startCheckout"><strong>Check out a book</strong></a>
    <br>
    <a href="library?action=display_users"><strong>Manage checked out books</strong></a>
  </div>
<br>
<c:import url="includes/footer.jsp" />

