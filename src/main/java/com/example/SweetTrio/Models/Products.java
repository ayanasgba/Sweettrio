package com.example.SweetTrio.Models;

import com.example.SweetTrio.enums.TypesOfProducts;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor // empty
@AllArgsConstructor // al non-optional const
@Entity(name="products")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "nameOfProduct", nullable = false,length = 200)
    private String nameOfClient;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "composition", nullable = false)
    private String composition;

    @Enumerated(EnumType.STRING)
    private TypesOfProducts typesOfProducts;
}

