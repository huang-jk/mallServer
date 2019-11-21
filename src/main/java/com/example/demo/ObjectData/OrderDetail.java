package com.example.demo.ObjectData;

import lombok.Data;
import org.bson.codecs.BigDecimalCodec;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

/**
 * Created by yl2258 on 2019/11/14.
 */
@Data
public class OrderDetail {
    @Id
    private  String detailId;

    /** 订单id */
    @Field("orderId")
    private  String orderId;

    /** 商品id*/
    @Field("productId")
    private  String productId;

    /** 商品名称 */
    @Field("productName")
    private String productName;

    /** 商品单价 */
    @Field("productPrice")
    private BigDecimal productPrice;

    /** 商品数量 */
    @Field("productQuantity")
    private Integer productQuantity;

    /** 商品小图*/
    @Field("productIcon")
    private  String productIcon;

}
