/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-29 10:12 创建
 *
 */
package com.yiji.openapi.message.product.ypayment;

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
@OpenApiMessage(service = "queryUndoOrder", type = ApiMessageType.Request)
public class QueryUndoOrderRequest extends ApiRequest {

    /**
     * 返销订单号
     */
    @NotBlank
    @Length(max = 40)
    @OpenApiField(desc = "返销订单号" , demo = "20141225010000062065" , constraint = "")
    private String undoPaymentNo;

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

    public String getUndoPaymentNo() {
        return undoPaymentNo;
    }

    public void setUndoPaymentNo(String undoPaymentNo) {
        this.undoPaymentNo = undoPaymentNo;
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
}
