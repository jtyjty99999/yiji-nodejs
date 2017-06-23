/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-02-15 11:30 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/2/15
 */
@OpenApiMessage(service = "generate_order_airticket", type = ApiMessageType.Response)
public class GenerateOrderAirTicketResponse extends ApiResponse {

    @OpenApiField(desc = "用户ID",demo="290129239123123")
    private String userId;

    @OpenApiField(desc = "订单code",demo="xxx")
    private String orderCode;

    @OpenApiField(desc = "操作员ID",demo="234923499234234")
    private String operatorId;

    @OpenApiField(desc = "商家ID",demo="201239123812393")
    private String  shopUserId;

    @OpenApiField(desc = "易生活外部订单号",demo="123123121231")
    private String easyLifeOutOrderNo;

    @OpenApiField(desc = "交易金额",demo="80")
    private String tradeAmount;

    @OpenApiField(desc = "折扣金额",demo="20")
    private String shopRebateAmount;

    @OpenApiField(desc = "通知地址",demo="http://abc.xyz/return")
    private String notityUrl;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getShopUserId() {
        return shopUserId;
    }

    public void setShopUserId(String shopUserId) {
        this.shopUserId = shopUserId;
    }

    public String getEasyLifeOutOrderNo() {
        return easyLifeOutOrderNo;
    }

    public void setEasyLifeOutOrderNo(String easyLifeOutOrderNo) {
        this.easyLifeOutOrderNo = easyLifeOutOrderNo;
    }

    public String getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getShopRebateAmount() {
        return shopRebateAmount;
    }

    public void setShopRebateAmount(String shopRebateAmount) {
        this.shopRebateAmount = shopRebateAmount;
    }

    public String getNotityUrl() {
        return notityUrl;
    }

    public void setNotityUrl(String notityUrl) {
        this.notityUrl = notityUrl;
    }
}
