package com.ndfw.formwork_shop.repository.product;

import com.ndfw.formwork_shop.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
