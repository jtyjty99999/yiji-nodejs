/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-29 12:17 创建
 *
 */
package com.yiji.openapi.message.product.ypayment;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-29
 */
@OpenApiMessage(service = "paymentUndoOrder", type = ApiMessageType.Request)
public class PaymentUndoOrderRequest extends ApiRequest {

    /**
     * 返销订单号
     */
    @NotBlank
    @Length(max = 40)
    @OpenApiField(desc = "返销订单号" , demo = "20141225010000062065" , constraint = "")
    private String undoPaymentNo;

    /**
     * 缴费订单号
     */
    @NotBlank
    @Length(max = 40)
    @OpenApiField(desc = "缴费订单号" , demo = "20141225010000062065" , constraint = "")
    private String paymentOrderNo;

    /**
     * 易极付用户（必填）
     */
    @NotBlank
    @Length(max = 32)
    @OpenApiField(desc = "易极付用户" , demo = "20141225010000062065" , constraint = "")
    private String userId;

    /**
     * 平台类型
     */
    @NotBlank
    @Length(max = 48)
    @OpenApiField(desc = "平台类型" , demo = "YiPinHui" , constraint = "")
    private String platformType;

    /** 返销途径 */
    @NotNull
    @OpenApiField(desc = "返销类型" , demo = "MANUAL" , constraint = "")
    private String undoApproach;

    public String getUndoPaymentNo() {
        return undoPaymentNo;
    }

    public void setUndoPaymentNo(String undoPaymentNo) {
        this.undoPaymentNo = undoPaymentNo;
    }

    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    public void setPaymentOrderNo(String paymentOrderNo) {
        this.paymentOrderNo = paymentOrderNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getUndoApproach() {
        return undoApproach;
    }

    public void setUndoApproach(String undoApproach) {
        this.undoApproach = undoApproach;
    }
}
