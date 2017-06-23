/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-25 10:54 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/25
 */
@OpenApiMessage(service = "deposit", type = ApiMessageType.Response)
public class DepositResponse extends ApiResponse {
    @OpenApiField(desc="GID",demo="23492389sdfjsdk239s")
    private String gid;
    @OpenApiField(desc="渠道ID",demo="ba9123ks")
    private String channelId;
    @OpenApiField(desc="交易商户ID",demo="23012398123123")
    private String tradeMerchantId;
    @OpenApiField(desc="交易商户CodeNo",demo="239237823842344")
    private String tradePartnerId;
    @OpenApiField(desc="商户CardNo",demo="2012838234923434")
    private String merchantCardNo;
    @OpenApiField(desc="商户AccNo",demo="2012838234923434")
    private String merchantAccNo;
    @OpenApiField(desc="入口",demo="01")
    private String inlet;
    @OpenApiField(desc="充值产品Code",demo="BA")
    private String tradeBizProductCode;
    @OpenApiField(desc="充值金额",demo="3.1")
    private Money amount;
    @OpenApiField(desc="收费参数",demo="无")
    private String chargeRolesKey;
    @OpenApiField(desc="来源",demo="无")
    private String rechargeFrom;
    @OpenApiField(desc="业务号",demo="439349-ba")
    private String businessNo;
    @OpenApiField(desc="对公标签",demo="B2B")
    private String publicOptionTag;

    @OpenApiField(desc = "用户ID")
    private String userId;

    @OpenApiField(desc = "notifyUrl")
    private String notifyUrl;

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo;
    }

    public String getTradeMerchantId() {
        return tradeMerchantId;
    }

    public void setTradeMerchantId(String tradeMerchantId) {
        this.tradeMerchantId = tradeMerchantId;
    }

    public String getTradePartnerId() {
        return tradePartnerId;
    }

    public void setTradePartnerId(String tradePartnerId) {
        this.tradePartnerId = tradePartnerId;
    }

    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo;
    }

    public String getInlet() {
        return inlet;
    }

    public void setInlet(String inlet) {
        this.inlet = inlet;
    }

    public String getTradeBizProductCode() {
        return tradeBizProductCode;
    }

    public void setTradeBizProductCode(String tradeBizProductCode) {
        this.tradeBizProductCode = tradeBizProductCode;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getChargeRolesKey() {
        return chargeRolesKey;
    }

    public void setChargeRolesKey(String chargeRolesKey) {
        this.chargeRolesKey = chargeRolesKey;
    }

    public String getRechargeFrom() {
        return rechargeFrom;
    }

    public void setRechargeFrom(String rechargeFrom) {
        this.rechargeFrom = rechargeFrom;
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getPublicOptionTag() {
        return publicOptionTag;
    }

    public void setPublicOptionTag(String publicOptionTag) {
        this.publicOptionTag = publicOptionTag;
    }
}
