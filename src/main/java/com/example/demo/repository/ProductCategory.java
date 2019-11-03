package com.example.demo.repository;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by Administrator on 2019/11/3.
 */
@Document(collection = "product_category")
@Data
public class ProductCategory {
    @Id
    private Integer categoryId;

    @Field("categoryName")
    private  String categoryName;
}
