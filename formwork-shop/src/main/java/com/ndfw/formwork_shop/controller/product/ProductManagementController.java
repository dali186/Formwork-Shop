package com.ndfw.formwork_shop.controller.product;

import com.ndfw.formwork_shop.dto.ProductRegisterDto;
import com.ndfw.formwork_shop.service.ProductService;
import com.ndfw.formwork_shop.util.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/management/product")
@RequiredArgsConstructor
public class ProductManagementController {

    private final ProductService productService;

    @RequestMapping("/register")
    public ApiResponse<?> registerProduct(@RequestBody ProductRegisterDto prdRegiDto) {

        return ApiResponse.returnSuccessAll(productService.registerProduct(prdRegiDto), ProductManagementMessage.PRODUCT_REGI_SUC);
    }
}
