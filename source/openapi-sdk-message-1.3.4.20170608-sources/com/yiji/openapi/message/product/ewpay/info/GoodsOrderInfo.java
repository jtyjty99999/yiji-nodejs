/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-01 14:12 创建
 *
 */
package com.yiji.openapi.message.product.ewpay.info;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-01
 */
public class GoodsOrderInfo {

    /** 商品名称 */
    @Length(max = 256, min = 1)
    @OpenApiField(desc = "商品名称" , demo = "食品" , constraint = "")
    private String title;
    /** 商品编码 */
    @OpenApiField(desc = "商品编码" , demo = "1415612asda1d5a" , constraint = "")
    private String code;
    /** 商品描述 */
    @Length(max = 512)
    @OpenApiField(desc = "商品描述" , demo = "全麦食品" , constraint = "")
    private String description;
    /** 商品单价 */
    @OpenApiField(desc = "商品单价" , demo = "258" , constraint = "")
    private Money price;
    /** 商品数量 */
    @OpenApiField(desc = "商品数量" , demo = "3200" , constraint = "")
    private Long quantity;
    /** 商品单位 */
    @OpenApiField(desc = "商品单位" , demo = "熊本熊企业" , constraint = "")
    @Length(max = 8)
    private String unit;
    /** 其他费用 */
    @OpenApiField(desc = "其他费用" , demo = "2588" , constraint = "")
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

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
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

    public Money getChargeExtra() {
        return chargeExtra;
    }

    public void setChargeExtra(Money chargeExtra) {
        this.chargeExtra = chargeExtra;
    }
}
