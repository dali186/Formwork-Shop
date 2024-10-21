package com.ndfw.formwork_shop.dto;

import com.ndfw.formwork_shop.entity.product.Product;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductRegisterDto {
    private String name;
    private int price;
    private int quantity;
    private LocalDateTime postSttDate;
    private LocalDateTime postEndDate;

    public ProductRegisterDto(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.postSttDate = LocalDateTime.now();
        this.postEndDate = LocalDateTime.MAX;
    }

    public Product toEntity() {
        return Product.builder()
                .name(this.name)
                .price(this.price)
                .quantity(this.quantity)
                .postSttDate(this.postSttDate != null ? this.postSttDate : LocalDateTime.now())
                .postEndDate(this.postEndDate != null ? this.postEndDate : LocalDateTime.of(9999, 12, 31, 0, 0))
                .build();
    }
}
