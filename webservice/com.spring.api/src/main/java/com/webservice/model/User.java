package com.webservice.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Table(name = "users")
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid")
    private int useId;

    @Column(name = "name")
    private String name;

    @Column(name = "creationdate")
    private LocalDate creationDate;

    @Column(name = "lastlogindate")
    private LocalDate lastLoginDate;

    @Column(name = "isactived")
    private int isActived;

    @Column(name = "isdeleted")
    private int isDeleted;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    private String email;

    @Column(name = "status")
    private Integer status;

    @Column(name = "password")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usersroles", joinColumns = @JoinColumn(name = "userid"), inverseJoinColumns = @JoinColumn(name = "roleid"))
    private Collection<Role> roles;

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append("User{")
                .append("userId=").append(useId)
                .append(", name='").append(name)
                .append(", creationDate=").append(creationDate)
                .append(", lastLoginDate=").append(lastLoginDate)
                .append(", isActive=").append(isActived)
                .append(", isDeleted=").append(isDeleted)
                .append(", age=").append(age)
                .append(", email='").append(email)
                .append(", status=").append(status)
                .append(", password='").append(password)
                .append(", usersroles='").append(roles.toString())
                .append('}');
        return builder.toString();
    }

}