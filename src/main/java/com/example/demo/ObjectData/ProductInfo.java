package com.example.demo.ObjectData;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2019/11/17.
 */
@Data
@Document(collection = "product_info")
public class ProductInfo {

    @Id
    private String productId;

    /* 名字 */
    @Field("productName")
    private String productName;

    /* 单价 */
    @Field("productPrice")
    private BigDecimal productPrice;

    /* 库存 */
    @Field("productStock")
    private Integer productStock;

    /* 描述 */
    @Field("productDescription")
    private String productDescription;

    /* 小图 */
    @Field("productIcon")
    private String productIcon;

    /* 状态  0是正常1下架*/
    @Field("productStatus")
    private Integer productStatus;

    /* 类目编号*/
    @Field("categoryType")
    private Integer categoryType;
}
