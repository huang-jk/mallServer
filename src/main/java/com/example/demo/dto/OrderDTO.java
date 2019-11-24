package com.example.demo.dto;

import com.example.demo.ObjectData.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 数据传输对象
 * Created by Administrator on 2019/11/24.
 */
@Data
public class OrderDTO {
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
    private Integer orderStatus;

    /**支付状态，默认为0未支付*/
    private Integer payStatus;

    private Date createTime;

    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
