package com.example.demo.ObjectData;

import com.example.demo.enums.OrderStatusEnum;
import com.example.demo.enums.PayStatusEnum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 买家订单
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /**支付状态，默认为0未支付*/
    @Field("payStatus")
    private Integer payStatus = PayStatusEnum.SUCCESS.getCode();

    @Field("createTime")
    private Date createTime;

    @Field("updateTime")
    private Date updateTime;
}
