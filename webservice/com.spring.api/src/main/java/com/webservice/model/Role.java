package com.webservice.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "roles")
@Data
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "isactived")
    private int isActived;

    @Column(name = "isdeleted")
    private int isDeleted;

    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append("Role{")
                .append("id=").append(id)
                .append(", name='").append(name)
                .append(", isActived=").append(isActived)
                .append(", isDeleted=").append(isDeleted)
                .append('}');
        return builder.toString();
    }

}