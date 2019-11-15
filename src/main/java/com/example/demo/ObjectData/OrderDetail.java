package com.example.demo.ObjectData;

import lombok.Data;
import org.bson.codecs.BigDecimalCodec;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

/**
 * Created by yl2258 on 2019/11/14.
 */
@Data
public class OrderDetail {
    @Id
    private  String detailId;

    /** 订单id */
    private  String orderId;

    /** 商品id*/
    private  String productId;

    /** 商品名称 */
    private String productName;

    /** 商品单价 */
    private BigDecimal productPrice;

    /** 商品数量 */
    private Integer productQuantity;

    /** 商品小图*/
    private  String productIcon;

}
