package com.webservice.model;

import lombok.Data;

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
    public int productId;

    @Column(name = "productname")
    public String productName;

    @Column(name = "categoryid")
    public int categoryId;

    @Column(name = "manufacturerid")
    public int manufacturerId;

    @Column(name = "isactive")
    public int isActive;

    @Column(name = "createddate")
    public Date createdDate;

    @Column(name = "activateddate")
    public Date activatedDate;

    @Column(name = "createduser")
    public String createdUser;

    @Column(name = "updateddate")
    public Date updatedDate;

    @Column(name = "updateduser")
    public String updatedUser;

    @Column(name = "isdeleted")
    public int isDeleted;

    @Column(name = "deleteddate")
    public Date deletedDate;

    @Column(name = "deleteduser")
    public String deletedUser;

    @Column(name = "price")
    public double price;

    @Column(name = "description")
    public String description;

    @Column(name = "keyword")
    public String keyword;

    @Column(name = "url")
    public String url;

    @Column(name = "mimage")
    public String mImage;

    @Column(name = "simage")
    public String sImage;
}
