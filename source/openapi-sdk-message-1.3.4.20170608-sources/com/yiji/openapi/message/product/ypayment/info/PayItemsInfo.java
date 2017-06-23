/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-29 17:13 创建
 *
 */
package com.yiji.openapi.message.product.ypayment.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-29
 */
public class PayItemsInfo {

    /** 合同号 */
    @OpenApiField(desc = "资源方合同号" , demo = "188622")
    private String contractNumber;

    /** 业务名称 */
    @OpenApiField(desc = "业务名称" , demo = "水费")
    private String name;

    /** 数量 */
    @OpenApiField(desc = "数量" , demo = "22")
    private String count;

    /** 应付款 */
    @OpenApiField(desc = "应付款" , demo = "322")
    private Money payables;

    /** 滞纳金 */
    @OpenApiField(desc = "滞纳金" , demo = "12")
    private Money charge;

    /** 类型 */
    @OpenApiField(desc = "欠费类型" , demo = "WATER")
    private String paymentType;

    /** 年月 */
    @OpenApiField(desc = "年月" , demo = "201503")
    private String date;

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

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

    public Money getPayables() {
        return payables;
    }

    public void setPayables(Money payables) {
        this.payables = payables;
    }

    public Money getCharge() {
        return charge;
    }

    public void setCharge(Money charge) {
        this.charge = charge;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
