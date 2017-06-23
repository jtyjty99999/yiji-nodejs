/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-02 10:36 创建
 *
 */
package com.yiji.openapi.message.product.ewpay;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-02
 */
@OpenApiMessage(service = "qftRefund", type = ApiMessageType.Request)
public class QftRefundRequest extends ApiRequest {

    /**
     * 原始外部订单号
     */
    @NotNull
    @OpenApiField(desc = "原始外部订单号" , demo = "2016060115224126402791682" , constraint = "")
    private String merchOrderPno;

    /**
     * 退款金额（总金额）
     */
    @NotNull
    @OpenApiField(desc = "退款金额" , demo = "258888" , constraint = "")
    private Money money;

    /**
     * 补偿金额（平台商的手续费）
     */
    @NotNull
    @OpenApiField(desc = "补偿金额" , demo = "258888" , constraint = "")
    private Money moneyGift;

    public String getMerchOrderPno() {
        return merchOrderPno;
    }

    public void setMerchOrderPno(String merchOrderPno) {
        this.merchOrderPno = merchOrderPno;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public Money getMoneyGift() {
        return moneyGift;
    }

    public void setMoneyGift(Money moneyGift) {
        this.moneyGift = moneyGift;
    }
}
