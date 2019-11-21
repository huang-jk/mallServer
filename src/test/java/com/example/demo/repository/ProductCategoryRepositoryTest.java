package com.example.demo.repository;

import com.example.demo.ObjectData.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

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
        productCategory.setCategoryId(new Integer(4545));
        productCategory.setCategoryName("毛巾");
        productCategory.setCategoryType(new Integer(666));
        repository.save(productCategory);
    }
    @Test
    public void queryCategory() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(666));
        repository.findByCategoryTypeIn(list);
    }
}