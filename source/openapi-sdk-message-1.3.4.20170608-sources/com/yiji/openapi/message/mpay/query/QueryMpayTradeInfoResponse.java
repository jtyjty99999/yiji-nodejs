/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-30 14:24 创建
 *
 */
package com.yiji.openapi.message.mpay.query;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-30
 */
@OpenApiMessage(service = "queryMpayTradeInfo", type = ApiMessageType.Response)
public class QueryMpayTradeInfoResponse extends ApiResponse {

    /**
     * 交易名称
     */
    @OpenApiField(desc = "交易名称" , demo = "食品交易" , constraint = "")
    private String tradeName;
    /**
     * 交易金额
     */
    @OpenApiField(desc = "交易金额" , demo = "2588888" , constraint = "")
    private Money tradeAmount;
    /**
     * 买家id
     */
    @OpenApiField(desc = "买家id" , demo = "20141105020002400177" , constraint = "")
    private String buyerId;
    /**
     * 卖家id
     */
    @OpenApiField(desc = "卖家id" , demo = "20141105020002400177" , constraint = "")
    private String sellerId;
    /**
     * 卖家名称
     */
    @OpenApiField(desc = "卖家名称" , demo = "重庆金行" , constraint = "")
    private String sellerName;
    /**
     * 交易状态
     */
    @OpenApiField(desc = "交易状态" , demo = "成功" , constraint = "")
    private String tradeStatus;
    /**
     * 交易号
     */
    @OpenApiField(desc = "交易号" , demo = "000g00501fwyelkz1w23" , constraint = "")
    private String tradeNo;
    /**
     * 订单号
     */
    @OpenApiField(desc = "订单号" , demo = "1605301458386955" , constraint = "")
    private String outOrderNo;

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

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

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
}
