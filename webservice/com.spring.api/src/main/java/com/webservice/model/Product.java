package com.webservice.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "products")
@Data
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid")
    private int productId;

    @Column(name = "productname")
    private String productName;

    @Column(name = "categoryid")
    private int categoryId;

    @Column(name = "manufacturerid")
    private int manufacturerId;

    @Column(name = "isactived")
    private int isActived;

    @Column(name = "isdeleted")
    private int isDeleted;

    @Column(name = "createddate")
    private Date createdDate;

    @Column(name = "activateddate")
    private Date activatedDate;

    @Column(name = "createduser")
    private String createdUser;

    @Column(name = "updateddate")
    private Date updatedDate;

    @Column(name = "updateduser")
    private String updatedUser;

    @Column(name = "deleteddate")
    private Date deletedDate;

    @Column(name = "deleteduser")
    private String deletedUser;

    @Column(name = "price")
    private double price;

    @Column(name = "description")
    private String description;

    @Column(name = "keyword")
    private String keyword;

    @Column(name = "url")
    private String url;

}
