package com.example.demo.repository;

import com.example.demo.ObjectData.ProductCategory;
import com.example.demo.ObjectData.ProductInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by yl2258 on 2019/11/19.
 */
public interface ProductInfoRepository extends MongoRepository<ProductInfo, String> {
    List<ProductInfo> findByProductStatusIn(Integer productStatus);
}
