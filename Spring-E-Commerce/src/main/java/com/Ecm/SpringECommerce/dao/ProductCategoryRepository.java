package com.Ecm.SpringECommerce.dao;

import com.Ecm.SpringECommerce.entity.ProductCatagory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(collectionResourceRel = "productCategory",path = "product-category")

public interface ProductCategoryRepository extends JpaRepository<ProductCatagory,Long> {
}
