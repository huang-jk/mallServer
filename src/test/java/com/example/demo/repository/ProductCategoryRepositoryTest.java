package com.example.demo.repository;

import com.example.demo.ObjectData.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/11/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository  repository;

    @Test
    public void save() {
        ProductCategory productCategory = new  ProductCategory();
        repository.findById(productCategory);
    }
}