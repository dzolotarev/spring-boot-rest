package ru.dzolotarev.msproductsapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @GetMapping
    public List<String> getProducts() {
        return List.of("T-Shirt", "Jeans", "Shorts", "Coat");
    }

}
