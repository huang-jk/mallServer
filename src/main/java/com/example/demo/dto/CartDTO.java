package com.example.demo.dto;

import lombok.Data;

/**
 * Created by yl2258 on 2019/11/27.
 */
@Data
public class CartDTO {
    // 商品ID
    private String productId;

    // 数量
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
