<%--Copyright Chris Gerencser and Kevin Kowalsky--%>
<%@page import="java.util.GregorianCalendar, java.util.Calendar" %>
<% 
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
%>
    <footer class="footer">
      <p> &copy; <%= currentYear %>, Chris Gerencser and Kevin Kowalsky</p>
    </footer>
  </body>
</html>
