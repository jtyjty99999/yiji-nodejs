/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-29 13:45 创建
 *
 */
package com.yiji.openapi.message.product.ypayment;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-29
 */
@OpenApiMessage(service = "paymentUndoOrder", type = ApiMessageType.Notify)
public class PaymentUndoOrderNotify extends ApiNotify {

    /**
     * 返销订单号
     */
    @NotBlank
    @Length(max = 40)
    @OpenApiField(desc = "返销订单号" , demo = "20141225010000062065" , constraint = "")
    private String undoPaymentNo;

    @OpenApiField(desc = "返销状态" , demo = "INIT" , constraint = "")
    private String undoOrderStatus;

    /**
     * 缴费订单号
     */
    @NotBlank
    @Length(max = 40)
    @OpenApiField(desc = "缴费订单号" , demo = "20141225010000062065" , constraint = "")
    private String paymentOrderNo;

    public String getUndoPaymentNo() {
        return undoPaymentNo;
    }

    public void setUndoPaymentNo(String undoPaymentNo) {
        this.undoPaymentNo = undoPaymentNo;
    }

    public String getUndoOrderStatus() {
        return undoOrderStatus;
    }

    public void setUndoOrderStatus(String undoOrderStatus) {
        this.undoOrderStatus = undoOrderStatus;
    }

    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    public void setPaymentOrderNo(String paymentOrderNo) {
        this.paymentOrderNo = paymentOrderNo;
    }
}
