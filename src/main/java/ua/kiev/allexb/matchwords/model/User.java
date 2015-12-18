package ua.kiev.allexb.matchwords.model;

import ua.kiev.allexb.matchwords.entity.UserEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author allexb
 * @version 1.0 14.12.2015
 */
public class User implements Serializable {

    private static final long serialVersionUID = 5857204436494167259L;

    private Long id;
    private String name;
    private String lastName;
    private String nickName;
    private String email;
    private String password;
    private Date registrationDate;

    public User() {
    }

    public User(UserEntity userEntity) {
        this.id = userEntity.getId();
        this.name = userEntity.getName();
        this.lastName = userEntity.getLastName();
        this.nickName = userEntity.getNickName();
        this.email = userEntity.getEmail();
        this.password = userEntity.getPassword();
        this.registrationDate = userEntity.getRegistrationDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

}


