package com.trium.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "USER_TABLE")
public class User {


    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    @Column(name = "name")
    private  String name;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "user_name")
   private String userName;

    @Column(name = "email")
    private String email;


    public User() {
    }

    public User(Integer id, String name, String firstName ,String userName,String email) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
       this.userName = userName;
        this.email = email;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
               ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
