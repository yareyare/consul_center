package com.ivy.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : zhangyan 2018/9/21
 */
@Data
public class Product implements Serializable {

    private Integer id;
    /**
     * 商品名称
     */
    private String name;

    /**
     * 价格，以分为单位
     */
    private Integer price;

    /**
     * 库存
     */
    private Integer store;

}
