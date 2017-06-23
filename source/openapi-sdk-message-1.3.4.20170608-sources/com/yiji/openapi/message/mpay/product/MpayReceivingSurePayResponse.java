/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-24 09:20 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-24
 */
@OpenApiMessage(service = "mpayReceivingSurePay", type = ApiMessageType.Response)
public class MpayReceivingSurePayResponse extends ApiResponse {

    /**
     * 交易号
     */
    @OpenApiField(desc = "交易号" , demo = "2016052330408796" , constraint = "")
    private String tradeNo;

    /**
     * 交易状态
     */
    @OpenApiField(desc = "交易状态" , demo = "SUCCESS" , constraint = "")
    private String tradeStatus;

    /**
     * 交易金额
     */
    @OpenApiField(desc = "交易金额" , demo = "258888" , constraint = "")
    private Money tradeAmount;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }
}
