package com.webservice.dto.product;

import com.webservice.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDto(Product entity);

    List<Product> toEntity(List<ProductDTO> dtos);

    List<ProductDTO> toDto(List<Product> entities);

    Product toEntity(ProductDTO dto);

}
