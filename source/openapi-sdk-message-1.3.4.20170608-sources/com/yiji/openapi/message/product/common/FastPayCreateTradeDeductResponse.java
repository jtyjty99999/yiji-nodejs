/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-23 10:09 创建
 *
 */
package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-23
 */
@OpenApiMessage(service = "fastPayCreateTradeDeduct", type = ApiMessageType.Response)
public class FastPayCreateTradeDeductResponse extends ApiResponse {

    /**
     * 支付流水号
     */
    @OpenApiField(desc = "支付流水号" , demo = "201500515252525625" , constraint = "")
    private String tradeNo;

    /**
     * 付款总金额
     */
    @OpenApiField(desc = "付款总金额" , demo = "258888" , constraint = "")
    private Money payAmount;

    /**
     * 买家手续费
     */
    @OpenApiField(desc = "买家手续费" , demo = "258888" , constraint = "")
    private Money buyerFee;

    /**
     * 业务状态
     */
    @OpenApiField(desc = "业务状态" , demo = "SUCCESS" , constraint = "")
    private String fastPayStatus;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Money getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Money payAmount) {
        this.payAmount = payAmount;
    }

    public Money getBuyerFee() {
        return buyerFee;
    }

    public void setBuyerFee(Money buyerFee) {
        this.buyerFee = buyerFee;
    }

    public String getFastPayStatus() {
        return fastPayStatus;
    }

    public void setFastPayStatus(String fastPayStatus) {
        this.fastPayStatus = fastPayStatus;
    }
}
