package com.account4.account4.controller.frontend;

import com.account4.account4.model.Product;
import com.account4.account4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController2 {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/add")
    public String showAddProductForm(Model model) {

        model.addAttribute("product", new Product());
        return "add-product-form"; // نام صفحه HTML برای فرم افزودن کالا
    }

    @PostMapping("/products/add")
    public String addProduct(@ModelAttribute Product product) {

        productService.save(product);
        return "redirect:/products";
    }
}