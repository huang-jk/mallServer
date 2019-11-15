package com.example.demo.ObjectData;

import java.math.BigDecimal;

/**
 * Created by yl2258 on 2019/11/12.
 */
public class OrderMaster {
    /** 订单ID */
    private String orderId;

    /** 买家名字 */
    private  String buyerName;

    /** 买家手机号*/
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /** 买家微信openid */
    private String buyerOpenid;

    /**订单总金额*/
    private BigDecimal orderAmount;

    /**订单状态，默认为新下单*/
    private Integer orderStatus = 0;
}
