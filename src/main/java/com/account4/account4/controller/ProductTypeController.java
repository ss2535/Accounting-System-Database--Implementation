package com.account4.account4.controller;

import com.account4.account4.model.ProductType;
import com.account4.account4.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-types")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping
    public List<ProductType> getAllProductTypes() {
        return productTypeService.findAll();
    }

    @PostMapping
    public ProductType addProductType(@RequestBody ProductType productType) {
        return productTypeService.save(productType);
    }

    @GetMapping("/{id}")
    public ProductType getProductTypeById(@PathVariable Long id) {
        return productTypeService.findById(id);
    }

    @PutMapping("/{id}")
    public ProductType updateProductType(@PathVariable Long id, @RequestBody ProductType productType) {
        productType.setId(id);
        return productTypeService.save(productType);
    }

    @DeleteMapping("/{id}")
    public void deleteProductType(@PathVariable Long id) {
        productTypeService.delete(id);
    }
}