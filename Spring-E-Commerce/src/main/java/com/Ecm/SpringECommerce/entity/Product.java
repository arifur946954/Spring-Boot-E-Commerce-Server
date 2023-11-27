package com.Ecm.SpringECommerce.entity;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
//automatically create getter and setter method using @data
@Data

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String SKu;
    private String name;
    private  String description;
    private BigDecimal unitPrice;
    private String imageUrl;
    private boolean active;
    private int unitStock;
    private Date dateCreated;
    private  Date lastUpdate;
}
