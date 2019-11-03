package com.example.demo.service;

import com.example.demo.ObjectData.ProductCategoryController;
import com.example.demo.repository.ProductCategory;

import java.util.List;

/**
 * Created by Administrator on 2019/11/3.
 */
public interface categoryService {
    ProductCategory byId(Integer categoryId);
}
