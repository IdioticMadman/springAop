package com.robert.aop.service;

import com.robert.aop.domain.Product;
import com.robert.aop.security.AdminOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    /**
     * 传统实现，需要侵入每个方法，如果每个方法都这么加代码的话，多很多复杂逻辑，不能统一处理
     */
    private final
    AuthService authService;

    @Autowired
    public ProductService(AuthService authService) {
        this.authService = authService;
    }

    @AdminOnly
    public void insert(Product product) {
//        authService.checkAccess();
        System.out.println("insert product");
    }

    @AdminOnly
    public void delete(Long id) {
//        authService.checkAccess();
        System.out.println("delete product");
    }

}
