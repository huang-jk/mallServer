package com.example.demo.repository;

import com.example.demo.ObjectData.ProductCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2019/11/17.
 */
public interface ProductCategoryRepository extends MongoRepository<ProductCategory, String> {
}
