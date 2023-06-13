package com.webservice.dto.product;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ProductDTO implements Serializable {

    public int productId;

    public String productName;

    public int categoryId;

    public int manufacturerId;

    public int isActive;

    public Date createdDate;

    public Date activatedDate;

    public String createdUser;

    public Date updatedDate;

    public String updatedUser;

    public int isDeleted;

    public Date deletedDate;

    public String deletedUser;

    public double price;

    public String description;

    public String keyword;

    public String url;

    public String mImage;

    public String sImage;
}
