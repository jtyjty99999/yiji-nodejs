/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 上午10:11:54 创建
 */
package com.yiji.openapi.message.product.yzz.info;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class PaymentResult implements Serializable{
	 private static final long serialVersionUID = 1L;

	/**
     * 付款子订单号
     */
    @NotEmpty
    @Size(min = 20, max = 40)
    private String subOrderNo;

    /**
     * 付款子交易号
     */
    @NotEmpty
    @Size(min = 20, max = 20)
    private String subTradeNo;

    /**
     * 付款方UserId
     */
    @NotEmpty
    @Size(min = 20, max = 20)
    private String payerUserId;

    /**
     * 收款方UserId
     */
    @NotEmpty
    @Size(min = 20, max = 20)
    private String payeeUserId;

    /**
     * 付款金额
     */
    @NotNull
    private Money amount;

    /**
     * 付款状态
     */
    @NotBlank
    private String paymentStatus;

    /**
     * 说明
     */
    @Size(min = 0, max = 128)
    private String memo;

    /**
     * 下级付款列表
     */
    private List<PaymentResult> paymentResults;

    public String getSubOrderNo() {
        return subOrderNo;
    }

    public void setSubOrderNo(String subOrderNo) {
        this.subOrderNo = subOrderNo;
    }

    public String getSubTradeNo() {
        return subTradeNo;
    }

    public void setSubTradeNo(String subTradeNo) {
        this.subTradeNo = subTradeNo;
    }

    public String getPayerUserId() {
        return payerUserId;
    }

    public void setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId;
    }

    public String getPayeeUserId() {
        return payeeUserId;
    }

    public void setPayeeUserId(String payeeUserId) {
        this.payeeUserId = payeeUserId;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public List<PaymentResult> getPaymentResults() {
        return paymentResults;
    }

    public void setPaymentResults(List<PaymentResult> paymentResults) {
        this.paymentResults = paymentResults;
    }
}

    