/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-27 15:49 创建
 *
 */
package com.yiji.openapi.message.product.ypayment.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-27
 */
public class PaymentItemInfo {

    /**
     * 缴费金额
     */
    @NotNull
    @OpenApiField(desc = "缴费金额" , demo = "25888" , constraint = "")
    private Money amount;

    /**
     * 缴费子订单号
     */
    @NotBlank
    @OpenApiField(desc = "缴费子订单号" , demo = "2015001510250098856" , constraint = "")
    private String paymentOrderNo;

    /**
     * 缴费类型
     */
    @NotNull
    @OpenApiField(desc = "缴费类型" , demo = "WATER" , constraint = "")
    private String paymentType;

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    public void setPaymentOrderNo(String paymentOrderNo) {
        this.paymentOrderNo = paymentOrderNo;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
