//Copyright Chris Gerencser and Kevin Kowalsky
package edu.elon.admin;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import edu.elon.users.UserDB;
import edu.elon.data.User;
import javax.websocket.Session;


public class UsersServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();

        String url = "/index.jsp";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
        System.out.println(action);
        if(action.equals("join")){
            url = "/index.jsp";
        }
        // perform action and set URL to appropriate page
        if (action.equals("display_users")) {            
            // get list of users
            ArrayList<User> users = UserDB.selectUsers();            
            request.setAttribute("users", users);
            url = "/Manage.jsp";
        }
        else if (action.equals("startCheckout")){
            url = "/CheckoutBook.jsp";
            
        }
        else if (action.equals("Checkout")) {
            String first = request.getParameter("firstName");
            String last = request.getParameter("lastName");
            String email = request.getParameter("email");
            String book = request.getParameter("book");
            
            GregorianCalendar cal = new GregorianCalendar();
	    cal.add(Calendar.MINUTE, 20160);
	    Date date = cal.getTime();
	    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
	    SimpleDateFormat simple = new SimpleDateFormat("MM-dd-yyyy");
	    String finalDate = simple.format(sqlDate);
            User user = new User(first, last, email, book, finalDate,cal);
//            user.setFirstName(first); 
//            user.setLastName(last);
//            user.setBook(book);
//            user.setEmail(email);
//            user.setDueDate(finalDate);
            UserDB.insert(user);
            session.setAttribute("user", user);
            url = "/thanksPage.jsp";
        }
        else if (action.equals("delete_user")) {
            // get the user
            String email = request.getParameter("email");
            User user = UserDB.selectUser(email);
            
            // delte the user
            UserDB.delete(user);
            
            // get and set updated users
            ArrayList<User> users = UserDB.selectUsers();            
            request.setAttribute("users", users); 
            url = "/Manage.jsp";
        }
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }    
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
}