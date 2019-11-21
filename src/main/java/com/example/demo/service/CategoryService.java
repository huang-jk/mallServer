package com.example.demo.service;

import com.example.demo.ObjectData.ProductCategory;

import java.util.List;

/**
 * Created by yl2258 on 2019/11/18.
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}