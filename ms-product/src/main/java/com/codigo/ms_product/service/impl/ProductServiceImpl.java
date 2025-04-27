package com.codigo.ms_product.service.impl;

import com.codigo.ms_product.agregates.dto.ProductRequest;
import com.codigo.ms_product.agregates.dto.ProductResponse;
import com.codigo.ms_product.model.Product;
import com.codigo.ms_product.repository.ProductRepository;
import com.codigo.ms_product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);
    private final ProductRepository productRepository;

    @Override
    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .imageUrl(productRequest.getImageUrl())
                .available(productRequest.getAvailable())
                .stock(productRequest.getStock())
                .build();

        productRepository.save(product);
        log.info("Product created: {}", product);

    }

    @Override
    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(product -> ProductResponse.builder()
                        .id(product.getId())
                        .name(product.getName())
                        .description(product.getDescription())
                        .price(product.getPrice())
                        .imageUrl(product.getImageUrl())
                        .available(product.getAvailable())
                        .stock(product.getStock())
                        .build())
                .toList();
    }
}
