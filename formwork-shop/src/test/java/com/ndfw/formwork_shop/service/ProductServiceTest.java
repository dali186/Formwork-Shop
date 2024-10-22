package com.ndfw.formwork_shop.service;

import com.ndfw.formwork_shop.dto.ProductRegisterDto;
import com.ndfw.formwork_shop.entity.product.Product;
import com.ndfw.formwork_shop.repository.product.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @Test
    @DisplayName("상품 등록 테스트")
    public void registerProductTest() {
        //given
        ProductRegisterDto registerDto = new ProductRegisterDto("TestProduct3", 25000, 15);
        Product product = registerDto.toEntity();
        //stub
        /* Service - Repository 의존관계를 맺고 있으나, 가져오지 않고 가짜객체 Mock이 willReturn 요 값을 리턴할 것이라는 것을 명시 */
        BDDMockito.given(productRepository.save(any(Product.class))).willReturn(registerDto.toEntity());
        //when
        Long resultId = productService.registerProduct(registerDto);
        //then
        Assertions.assertThat(product.getId()).isEqualTo(resultId);
    }
}
