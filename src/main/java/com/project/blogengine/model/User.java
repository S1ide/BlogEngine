package com.project.blogengine.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    @Column(name = "is_moderator")
    private boolean isModerator;
    @NonNull
    @Column(name = "reg_time")
    private Date registrationDate;
    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    private String password;
    private String code;
    private String photo;

    protected User(){}

    public User(boolean isModerator, @NonNull String name, @NonNull String email, @NonNull String password) {
        this.isModerator = isModerator;
        this.name = name;
        this.email = email;
        this.password = password;
        this.registrationDate = new Date();
    }

    public long getId() {
        return id;
    }

    public boolean isModerator() {
        return isModerator;
    }

    @NonNull
    public Date getRegistrationDate() {
        return registrationDate;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public String getCode() {
        return code;
    }

    public String getPhoto() {
        return photo;
    }
}
