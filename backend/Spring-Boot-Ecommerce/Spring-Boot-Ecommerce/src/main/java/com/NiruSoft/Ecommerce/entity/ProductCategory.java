package com.NiruSoft.Ecommerce.entity;
 import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

 @Entity
 @Table(name="product_category")
 @Getter
 @Setter
public class ProductCategory {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
     private Long id;

     @Column(name="category_name")
     private String categoryName;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
     private set<Product> products;
}
