package com.ndfw.formwork_shop.entity.product;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Table(name = "T_PRODUCT")
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private int price;

    @Column(name = "QUANTITY")
    private int quantity;

    //게시 시작일
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime postSttDate;

    //게시 종료일
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime postEndDate;

    @Builder
    public Product(String name, int price, int quantity, LocalDateTime postSttDate, LocalDateTime postEndDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.postSttDate = postSttDate;
        this.postEndDate = postEndDate;
    }
}
