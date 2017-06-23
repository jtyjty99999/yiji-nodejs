/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-27 18:14 创建
 *
 */
package com.yiji.openapi.message.product.ypayment.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-27
 */
public class ItemInfoApi {
    /** 业务名称 */
    @OpenApiField(desc = "业务名称" , demo = "气费" , constraint = "")
    private String name;

    /** 数量 */
    @OpenApiField(desc = "数量" , demo = "2588" , constraint = "")
    private String count;

    /** 金额 */
    @OpenApiField(desc = "金额" , demo = "25888" , constraint = "")
    private Money money;

    /** 滞纳金 */
    @OpenApiField(desc = "滞纳金" , demo = "25888" , constraint = "")
    private Money charge;

    /** 单价 */
    @OpenApiField(desc = "单价" , demo = "25888" , constraint = "")
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public Money getCharge() {
        return charge;
    }

    public void setCharge(Money charge) {
        this.charge = charge;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
