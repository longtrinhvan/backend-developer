package com.webservice.service.product;

import com.webservice.dto.product.ProductDTO;

import java.util.List;

public interface IProductService {

    ProductDTO save(ProductDTO product);

    ProductDTO getOne(int userID);

    List<ProductDTO> findAll();

}
