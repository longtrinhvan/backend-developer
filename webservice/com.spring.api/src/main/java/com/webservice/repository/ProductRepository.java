package com.webservice.repository;

import com.webservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("SELECT u FROM Product u WHERE u.id = :id")
    Product getOne(@Param("id") Integer id);

}
