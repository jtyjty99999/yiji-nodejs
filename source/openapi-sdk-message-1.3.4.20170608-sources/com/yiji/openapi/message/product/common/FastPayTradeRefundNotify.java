/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-28 16:06 创建
 *
 */
package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-28
 */
@OpenApiMessage(service = "fastPayTradeRefund", type = ApiMessageType.Notify)
public class FastPayTradeRefundNotify extends ApiNotify {

    /**
     * 支付流水号
     */
    @OpenApiField(desc = "支付流水号", demo = "201500515252525625", constraint = "")
    private String tradeNo;

    @OpenApiField(desc = "退款完成时间", demo = "20150312120214", constraint = "")
    private String refundFinishTime;

    @OpenApiField(desc = "退款金额", demo = "25888", constraint = "")
    private Money refundAmount;

    @OpenApiField(desc = "退款状态", demo = "SUCCESS", constraint = "")
    private String refundStatus;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getRefundFinishTime() {
        return refundFinishTime;
    }

    public void setRefundFinishTime(String refundFinishTime) {
        this.refundFinishTime = refundFinishTime;
    }

    public Money getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Money refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }
}
