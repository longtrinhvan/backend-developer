package com.webservice.service.product;

import com.webservice.dto.product.ProductDTO;
import com.webservice.dto.product.ProductMapper;
import com.webservice.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService implements IProductService {

    private final ProductMapper productMapper;
    private final IProductRepository productRepository;

    @Autowired
    public ProductService(ProductMapper productMapper, IProductRepository productRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    @Override
    public ProductDTO save(ProductDTO product) {
        if (product == null) {
            return null;
        }
        var productEntity = productMapper.toEntity(product);
        var savedProduct = productRepository.save(productEntity);
        return productMapper.toDto(savedProduct);
    }

    @Override
    public ProductDTO getOne(int productId) {
        if (productId <= 0) {
            return null;
        }
        var productEntity = productRepository.findById(productId).orElse(null);
        return productMapper.toDto(productEntity);
    }

    @Override
    public List<ProductDTO> findAll() {
        var productList = productRepository.findAll();
        return productList.stream()
                .map(productMapper::toDto)
                .collect(Collectors.toList());
    }
}
