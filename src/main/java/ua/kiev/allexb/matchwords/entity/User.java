package ua.kiev.allexb.matchwords.entity;

import ua.kiev.allexb.matchwords.entity.models.Model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author allexb
 * @version 1.0 14.12.2015
 */
@Entity
@Table(name = "users_tb")
public class User extends Model implements Serializable{

    private static final long serialVersionUID = 5542049006721984411L;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Size(min = 5, max = 50)
    @Column(name = "nick_name", length = 50)
    private String nickName;

    @NotNull
    @Column(name = "email_address")
    private String email;

    @NotNull
    @Column(name = "password", length = 50)
    private String password;

    @NotNull
    @Column(name = "registration_date")
    private Date registrationDate;

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
