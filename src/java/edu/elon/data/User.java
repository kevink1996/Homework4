package edu.elon.data;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class User implements Serializable {

    private String email;
    private String firstName;
    private String lastName;
    private String book;
    private String dueDate;
    private String overDue;
    private GregorianCalendar cal;

    public User() {
        email = "";
        firstName = "";
        lastName = "";
        book = "";
        dueDate = "";
    }

    public User(String firstName, String lastName, String email,String book,String dueDate,GregorianCalendar cal) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.book = book; 
        this.dueDate = dueDate;
        this.cal = cal;
        
    }
    public GregorianCalendar getCal(){
        return cal;
    }
    public void setCal(){
        this.cal = cal;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getBook(){
        return book;
    }
    public void setBook(String book){
        this.book = book;
    }
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }
    public String getDueDate(){
        return dueDate;
    }
    public void setOverDue(String overDue){
        this.overDue = overDue;
    }
    public String getOverDue(){
        String finalDue = " ";
            Calendar now = new GregorianCalendar();
            if(now.compareTo(cal) ==0){
                finalDue = "overdue";
            }
		overDue= finalDue;
		return finalDue;
    }
}