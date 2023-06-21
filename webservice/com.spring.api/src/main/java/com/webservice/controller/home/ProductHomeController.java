package com.webservice.controller.home;

import com.webservice.dto.product.ProductDTO;
import com.webservice.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Lazy
@RequestMapping("/home/products")
public class ProductHomeController {

    @Autowired
    private IProductService iproductService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getOne(@PathVariable("id") int productID) {
        HttpStatus httpStatus = HttpStatus.OK;
        ProductDTO result = null;
        try {
            result = iproductService.getOne(productID);
        } catch (Throwable e) {
            e.printStackTrace();
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(result, httpStatus);
    }

    @GetMapping("/findalls")
    public ResponseEntity<List<ProductDTO>> findAlls() {
        HttpStatus httpStatus = HttpStatus.OK;
        List<ProductDTO> result = null;
        try {
            result = iproductService.findAll();
        } catch (Throwable e) {
            e.printStackTrace();
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(result, httpStatus);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<ProductDTO> createUser(@RequestBody ProductDTO product) {
        HttpStatus httpStatus = HttpStatus.CREATED;
        ProductDTO result = null;
        try {
            result = iproductService.save(product);
        } catch (Throwable e) {
            e.printStackTrace();
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(result, httpStatus);
    }

}
