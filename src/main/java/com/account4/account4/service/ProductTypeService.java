package com.account4.account4.service;

import com.account4.account4.model.ProductType;
import com.account4.account4.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService {

    @Autowired
    private ProductTypeRepository productTypeRepository;

    public List<ProductType> findAll() {
        return productTypeRepository.findAll();
    }

    public ProductType save(ProductType productType) {
        return productTypeRepository.save(productType);
    }

    public ProductType findById(Long id) {
        return productTypeRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        productTypeRepository.deleteById(id);
    }
}
