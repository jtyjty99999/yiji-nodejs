/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-02 10:36 创建
 *
 */
package com.yiji.openapi.message.product.ewpay;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-02
 */
@OpenApiMessage(service = "qftRefund", type = ApiMessageType.Response)
public class QftRefundResponse extends ApiResponse {

    /**
     * 原交易订单号
     */
    @OpenApiField(desc = "原交易订单号" , demo = "2016060115224126402791682" , constraint = "")
    private String merchOrderPno;

    /** 退款状态 */
    @OpenApiField(desc = "退款状态" , demo = "PROCESSING" , constraint = "")
    private String tradeStatus;

    /** 退款描述 */
    @OpenApiField(desc = "退款描述" , demo = "处理中" , constraint = "")
    private String tradeMessage;

    /** 退款成功时间*/
    @OpenApiField(desc = "退款成功时间" , demo = "2016-05-06" , constraint = "")
    private Date tradeTime;

    public String getMerchOrderPno() {
        return merchOrderPno;
    }

    public void setMerchOrderPno(String merchOrderPno) {
        this.merchOrderPno = merchOrderPno;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getTradeMessage() {
        return tradeMessage;
    }

    public void setTradeMessage(String tradeMessage) {
        this.tradeMessage = tradeMessage;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }
}
