/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-27 14:39 创建
 *
 */
package com.yiji.openapi.message.common.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-27
 */
@OpenApiMessage(service = "fastPayCreateTrade", type = ApiMessageType.Notify)
public class FastPayCreateTradeNotify extends ApiNotify {

    /**
     * 业务流水号
     */
    @OpenApiField(desc = "业务流水号" , demo = "565e6df6-95c0-4dee-bbfb-9c18f2" , constraint = "")
    private String tradeNo;

    @OpenApiField(desc = "交易金额" , demo = "58888" , constraint = "")
    private Money tradeAmount;

    @OpenApiField(desc = "卖家实收金额",demo = "58880")
    private Money tradeAmountIn;

    @OpenApiField(desc = "交易状态",constraint = "trade_finish/trade_close",demo = "FINSH")
    private String fastPayStatus;

    public Money getTradeAmountIn() {
        return tradeAmountIn;
    }

    public void setTradeAmountIn(Money tradeAmountIn) {
        this.tradeAmountIn = tradeAmountIn;
    }

    public String getFastPayStatus() {
        return fastPayStatus;
    }

    public void setFastPayStatus(String fastPayStatus) {
        this.fastPayStatus = fastPayStatus;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }
}
