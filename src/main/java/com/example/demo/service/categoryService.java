package com.example.demo.service;

import com.example.demo.ObjectData.ProductCategory;

import java.util.List;

/**
 * Created by Administrator on 2019/11/3.
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
