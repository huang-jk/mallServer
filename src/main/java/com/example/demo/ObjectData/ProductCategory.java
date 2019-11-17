package com.example.demo.ObjectData;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by Administrator on 2019/11/17.
 */
@Document(collection = "product_category")
@Data
public class ProductCategory {

    /**项目id */
    @Id
    private Integer categoryId;

    /**类目名字 */
    @Field("categoryName")
    private String categoryName;

    /**类目编号 */
    @Field("categoryType")
    private Integer categoryType;

}
