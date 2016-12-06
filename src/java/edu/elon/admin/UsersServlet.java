package edu.elon.admin;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import murach.data.UserDB;
import org.apache.tomcat.jni.User;

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
            action = "nullness";  // default action
        }
        
        // perform action and set URL to appropriate page
        if (action.equals("display_users")) {            
            // get list of users
            ArrayList<User> users = UserDB.selectUsers();            
            request.setAttribute("users", users);
            url = "/manage.jsp";
        } 
        else if (action.equals("Checkout")) {
            String first = request.getParameter("fName");
            String last = request.getParameter("lName");
            String email = request.getParameter("email");
            String book = request.getParameter("book");
            
            GregorianCalendar cal = new GregorianCalendar();
			cal.add(Calendar.MINUTE, 20160);
			Date date = cal.getTime();
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			SimpleDateFormat sdf = new SimpleDateFormat(
							"MM-dd-yyyy");
			String formattedDate = sdf.format(sqlDate);
                        
            User user = new User();
            user.setFirstName(); 
        }
        else if (action.equals("update_user")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");

            // get and update user
            User user = (User) session.getAttribute("user");        
            user.setFirstName(firstName);
            user.setLastName(lastName);
            UserDB.update(user);

            // get and set updated users
            ArrayList<User> users = UserDB.selectUsers();            
            request.setAttribute("users", users);            
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