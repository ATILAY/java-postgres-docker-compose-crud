package com.javamercury.mercury.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;
    

    @Column(name= "name")
    private String name;

    @Column(name="email")
    private String email;

    //getter and setters
    public Long getId(){
        return Id;
    }
    public void  setId(Long Id){
        this.Id = Id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
