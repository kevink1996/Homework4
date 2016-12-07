<%--Copyright Chris Gerencser and Kevin Kowalsky--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="includes/header.html" />

<div class ="menu">
    <p>
        Thank you for your patronage of the Belk Library. You've successfully 
    checked out the book, ${user.book}. Please note that this book is due
    back on ${user.dueDate}. A friendly reminder will be sent to you if your 
    book becomes overdue.
    </p>
</div>
<br>
<c:import url="includes/footer.jsp" />
