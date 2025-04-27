package com.codigo.ms_product.service;

import com.codigo.ms_product.agregates.dto.ProductRequest;
import com.codigo.ms_product.agregates.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProducts();
}
