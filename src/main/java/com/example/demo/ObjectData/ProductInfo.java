package com.example.demo.ObjectData;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2019/11/17.
 */
@Data
public class ProductInfo {

    @Id
    private String productId;

    /* 名字 */
    private String productName;

    /* 单价 */
    private BigDecimal productPrice;

    /* 库存 */
    private Integer productStock;

    /* 描述 */
    private Integer productDescription;

    /* 小图 */
    private Integer productIcon;

    /* 状态  0是正常1下架*/
    private Integer productStatus;

    /* 类目编号*/
    private Integer categoryType;
}
