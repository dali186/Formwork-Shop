package com.ndfw.formwork_shop.service;

import com.ndfw.formwork_shop.dto.ProductRegisterDto;
import com.ndfw.formwork_shop.repository.product.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional
    public Long registerProduct(ProductRegisterDto prdRegiDto) {

        return productRepository.save(prdRegiDto.toEntity()).getId();
    }
}
