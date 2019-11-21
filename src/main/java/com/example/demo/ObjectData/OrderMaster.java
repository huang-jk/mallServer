package com.example.demo.ObjectData;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

/**
 * Created by yl2258 on 2019/11/12.
 */
@Data
public class OrderMaster {
    /** 订单ID */
    @Id
    private String orderId;

    /** 买家名字 */
    @Field("buyerName")
    private  String buyerName;

    /** 买家手机号*/
    @Field("buyerPhone")
    private String buyerPhone;

    /** 买家地址 */
    @Field("buyerAddress")
    private String buyerAddress;

    /** 买家微信openid */
    @Field("buyerOpenid")
    private String buyerOpenid;

    /**订单总金额*/
    @Field("orderAmount")
    private BigDecimal orderAmount;

    /**订单状态，默认为新下单*/
    @Field("orderStatus")
    private Integer orderStatus = 0;
}
