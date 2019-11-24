package com.example.demo.enums;

import lombok.Getter;

/**
 * Created by Administrator on 2019/11/23.
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
