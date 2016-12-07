package edu.elon.data;

import java.io.Serializable;

public class User implements Serializable {

    private String email;
    private String firstName;
    private String lastName;
    private String book;
    private String dueDate;

    public User() {
        email = "";
        firstName = "";
        lastName = "";
        book = "";
        dueDate = "";
    }

    public User(String firstName, String lastName, String email,String book,String dueDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.book = book; 
        this.dueDate = dueDate;
        
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
}