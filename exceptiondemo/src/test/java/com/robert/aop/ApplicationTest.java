package com.robert.aop;

import com.robert.aop.security.CurrentUserHolder;
import com.robert.aop.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    ProductService productService;

    @Test(expected = Exception.class)
    public void annoInsertTest() {
        CurrentUserHolder.set("Tom");
        productService.delete(1L);
    }

    @Test
    public void adminInsert() {
        CurrentUserHolder.set("admin");
        productService.delete(1L);
    }

}