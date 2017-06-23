/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-01 10:05 创建
 *
 */
package com.yiji.openapi.message.common.trade.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-01
 */
public class TradePaymentInfoApi {

    /** 交易流水号 */
    @OpenApiField(desc = "交易流水号" , demo = "P464742078516256741A53" , constraint = "")
    private String tradeNo;

    /** 付款总金额 */
    @OpenApiField(desc = "付款总金额" , demo = "20000" , constraint = "")
    private Money payAmount;

    /** 买家手续费 */
    @OpenApiField(desc = "买家手续费" , demo = "285222" , constraint = "")
    private Money buyerFee;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Money getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Money payAmount) {
        this.payAmount = payAmount;
    }

    public Money getBuyerFee() {
        return buyerFee;
    }

    public void setBuyerFee(Money buyerFee) {
        this.buyerFee = buyerFee;
    }
}
