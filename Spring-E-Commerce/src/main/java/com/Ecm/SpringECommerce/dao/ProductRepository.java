package com.Ecm.SpringECommerce.dao;

import com.Ecm.SpringECommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
