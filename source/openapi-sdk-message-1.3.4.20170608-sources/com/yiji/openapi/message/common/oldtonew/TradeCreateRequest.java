/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-19 14:48 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/19
 */
@OpenApiMessage(service = "tradeCreate", type = ApiMessageType.Request)
public class TradeCreateRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "交易金额",constraint = "交易金额",demo = "100")
    private String tradeAmount;

    @Length(max = 64)
    @OpenApiField(desc = "交易名称",constraint = "交易名称",demo = "购买机械设备")
    private String tradeName;

    @OpenApiField(desc = "交易时间",constraint = "交易时间",demo = "2015-12-12 17:12:31")
	private Date tradeTime;

    @OpenApiField(desc = "业务产品编号",constraint = "业务产品编号",demo = "BA-123")
	private String tradeBizProductCode;

    @NotBlank
    @Length(min = 20,max = 20)
    @OpenApiField(desc = "卖家UserID",constraint = "卖家UserID",demo = "20130812020055285248")
	private String sellerUserId;

    @NotBlank
    @Length(min = 20,max = 20)
    @OpenApiField(desc = "买家UserID",constraint = "买家UserID",demo = "20130812020055285248")
	private String buyerUserId;

    @OpenApiField(desc = "通知编码",constraint = "通知编码",demo = "UTF-8")
	private String inputCharset;

    public String getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeBizProductCode() {
        return tradeBizProductCode;
    }

    public void setTradeBizProductCode(String tradeBizProductCode) {
        this.tradeBizProductCode = tradeBizProductCode;
    }

    public String getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getInputCharset() {
        return inputCharset;
    }

    public void setInputCharset(String inputCharset) {
        this.inputCharset = inputCharset;
    }

}
