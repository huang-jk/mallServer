package com.example.demo.VO;

import lombok.Data;

/**
 * http请求返回对象
 * Created by Administrator on 2019/11/23.
 */
@Data
public class ResultVO<T> {

    private String code;

    private String message;

    private T data;
}
