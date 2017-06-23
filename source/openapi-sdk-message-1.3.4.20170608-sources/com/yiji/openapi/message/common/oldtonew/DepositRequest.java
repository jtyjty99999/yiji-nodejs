/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-25 10:54 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/25
 */
@OpenApiMessage(service = "deposit", type = ApiMessageType.Request)
public class DepositRequest extends ApiRequest {
    @NotBlank
    @Length(min=20,max=20)
    @OpenApiField(desc="用户ID",demo = "20150701000006873776")
    private String userId;

    @OpenApiField(desc = "付费方",demo="P")
    private String payMode;

    @OpenApiField(desc = "对公标签",demo="B2B")
    private String publicOptionTag;

    @OpenApiField(desc = "充值产品Code",demo="ABC")
    private String tradeBizProductCode;

    @OpenApiField(desc = "交易商户ID",demo="2012389123123213")
    private String tradeMerchantId;

    @OpenApiField(desc = "充值金额",demo="2000")
    private Money depositAmount;

    @OpenApiField(desc="业务来源",demo = "空")
    private String rechargeFrom;

    @OpenApiField(desc="交易参与者",demo = "2012301239123123")
    private String tradePartnerId;

    public String getRechargeFrom() {
        return rechargeFrom;
    }

    public void setRechargeFrom(String rechargeFrom) {
        this.rechargeFrom = rechargeFrom;
    }

    public String getTradeBizProductCode() {
        return tradeBizProductCode;
    }

    public void setTradeBizProductCode(String tradeBizProductCode) {
        this.tradeBizProductCode = tradeBizProductCode;
    }

    public String getTradeMerchantId() {
        return tradeMerchantId;
    }

    public void setTradeMerchantId(String tradeMerchantId) {
        this.tradeMerchantId = tradeMerchantId;
    }

    public Money getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Money depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getPublicOptionTag() {
        return publicOptionTag;
    }

    public void setPublicOptionTag(String publicOptionTag) {
        this.publicOptionTag = publicOptionTag;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTradePartnerId() {
        return tradePartnerId;
    }

    public void setTradePartnerId(String tradePartnerId) {
        this.tradePartnerId = tradePartnerId;
    }
}
