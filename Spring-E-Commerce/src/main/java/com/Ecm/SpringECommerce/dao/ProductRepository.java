package com.Ecm.SpringECommerce.dao;

import com.Ecm.SpringECommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200/")

public interface ProductRepository extends JpaRepository<Product,Long> {
}
