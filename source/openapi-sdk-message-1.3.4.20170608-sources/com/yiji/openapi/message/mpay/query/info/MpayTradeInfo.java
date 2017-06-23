/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午2:26:11 创建
 */
package com.yiji.openapi.message.mpay.query.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class MpayTradeInfo {

    @OpenApiField(desc = "交易号",demo = "312456789132456")
    private String tradeNo;

    @OpenApiField(desc = "外部订单号",demo = "12365448945")
    private String outOrderNo;

    @OpenApiField(desc = "交易名称",demo = "充值")
    private String tradeName;

    @OpenApiField(desc = "交易金额",demo = "88.66")
    private Money tradeAmount;

    @OpenApiField(desc = "买家id",demo = "1235467890132456789")
    private String buyerId;

    @OpenApiField(desc = "买家真实姓名",demo = "易极付")
    private String buyerRealName;

    @OpenApiField(desc = "卖家id",demo = "32145698712356498")
    private String sellerId;

    @OpenApiField(desc = "交易状态",demo = "成功")
    private String tradeStatus;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerRealName() {
        return buyerRealName;
    }

    public void setBuyerRealName(String buyerRealName) {
        this.buyerRealName = buyerRealName;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }
}

    