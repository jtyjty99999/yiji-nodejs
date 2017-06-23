/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-18 17:10 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/18
 */
@OpenApiMessage(service = "yzzAutoBidTrade", type = ApiMessageType.Request)
public class YzzAutoBidTradeRequest extends ApiRequest {

    @NotBlank
    @Length(min = 20,max = 20)
    @OpenApiField(desc = "支付用户ID",constraint = "支付用户ID",demo = "20130812020055285248")
    private String payerUserId;

    @NotBlank
    @Length(max = 32)
    @OpenApiField(desc = "交易号",constraint = "交易号",demo = "20160113034060029605")
    private String tradeNo;

    @NotBlank
    @Length(max = 32)
    @OpenApiField(desc = "交易金额",constraint = "交易金额",demo = "10500")
    private String tradeAmount;

    public String getPayerUserId() {
        return payerUserId;
    }

    public void setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId;
    }

    public String getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
