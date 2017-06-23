/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-02-16 17:06 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/2/16
 */
@OpenApiMessage(service = "tradePayerApplyPoolTogether", type = ApiMessageType.Request)
public class TradePayerApplyPoolTogetherRequest extends ApiRequest {
    @NotBlank
    @OpenApiField(desc = "交易号",demo = "153243.2016123685")
    private String tradeNo;

    @OpenApiField(desc = "交易备注",demo = "交易")
    private String tradeMemo;

    @OpenApiField(desc = "交易名称",demo = "交易")
    private String tradeName;

    @NotBlank
    @OpenApiField(desc = "借出人ID",demo = "1234562156845")
    private String payerUserId;

    @NotNull
    @OpenApiField(desc = "交易金额",demo = "88.66")
    private Money tradeAmount;

    @OpenApiField(desc = "商户交易号",demo = "54867213564123")
    private String tradeOutBizNo;

    public String getTradeOutBizNo() {
        return tradeOutBizNo;
    }

    public void setTradeOutBizNo(String tradeOutBizNo) {
        this.tradeOutBizNo = tradeOutBizNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeMemo() {
        return tradeMemo;
    }

    public void setTradeMemo(String tradeMemo) {
        this.tradeMemo = tradeMemo;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getPayerUserId() {
        return payerUserId;
    }

    public void setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }
}
