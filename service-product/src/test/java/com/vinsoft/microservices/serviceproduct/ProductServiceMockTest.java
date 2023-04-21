package com.vinsoft.microservices.serviceproduct;

import com.vinsoft.microservices.serviceproduct.Repositories.ProductRepository;
import com.vinsoft.microservices.serviceproduct.Services.ProductService;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductServiceMockTest {
    @Mock
    private ProductRepository productRepository;


    private ProductService productService;
}
