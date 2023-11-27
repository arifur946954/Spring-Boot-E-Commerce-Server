package com.Ecm.SpringECommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "product_category")
@Getter
@Setter

public class ProductCatagory {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "category_name")
    private String categoryName;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "catagory")
    private Set<Product> products;

}
