<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="includes/header.html" />
<div class ="menu">
    <h2>Checkout a book</h2>
    <br>
    <form action="library" method="post">
    <input type="hidden" name="action" value="Checkout">   
    <label>First Name:</label>
    <input type="text" name="firstName" required>
    <br>
    <label>Last Name:</label>
    <input type="text" name="lastName" required>
    <br>
    <label>Email Address:</label>
    <input type="email" name="email" required>
    <br>
    <label>Book Title:</label>
    <input type="text" name="book" id="book" required>
    <br>
    <label></label>
    <input class="button" type="submit" value="Checkout">
  </form>
</div>
<br>

<c:import url="includes/footer.jsp" />
