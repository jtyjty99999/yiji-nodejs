/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-19 11:18 创建
 *
 */
package com.yiji.openapi.message.product.ewpay.info;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-19
 */
public class GoodsList {

    @NotBlank
    @OpenApiField(desc = "商品名称",demo = "基金")
    private String title;

    @OpenApiField(desc = "商品编码",demo = "344355")
    private String code;

    @OpenApiField(desc = "商品描述",demo = "描述")
    private String description;

    @OpenApiField(desc = "商品数量",demo = "50")
    private Long quantity;

    @OpenApiField(desc = "商品单位",demo = "8")
    private String unit;

    @OpenApiField(desc = "商品单价",demo = "10.00")
    private Money price;

    @OpenApiField(desc = "其他费用",demo = "500.00")
    private Money chargeExtra;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public Money getChargeExtra() {
        return chargeExtra;
    }

    public void setChargeExtra(Money chargeExtra) {
        this.chargeExtra = chargeExtra;
    }
}
