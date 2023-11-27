package com.Ecm.SpringECommerce.entity;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
//automatically create getter and setter method using @data
@Data

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private ProductCatagory catagory;
    @Column(name = "sku")
    private  String sku;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private  String description;
    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "active")
    private boolean active;
    @Column(name = "units_in_stock")
    private int unitStock;
    @Column(name = "date_created")

    private Date dateCreated;
    @Column(name = "last_updated")
    @UpdateTimestamp
    private  Date lastUpdate;
}
