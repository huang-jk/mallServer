package com.example.demo.enums;

import lombok.Getter;

/**
 * Created by yl2258 on 2019/11/27.
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(10, "商品不存在"),
    PRODUCT_STOCK_ERROR(11, "商品不正确"),
    ;

    private  Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
