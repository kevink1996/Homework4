package edu.elon.data;

import java.io.Serializable;

public class User implements Serializable {

    private String email;
    private String firstName;
    private String lastName;
    private String book;

    public User() {
        email = "";
        firstName = "";
        lastName = "";
        book = "";
    }

    public User(String firstName, String lastName, String email,String book) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.book = book; 
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
}