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

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-29
 */
@OpenApiMessage(service = "paymentUndoOrder", type = ApiMessageType.Response)
public class PaymentUndoOrderResponse extends ApiResponse {

    @OpenApiField(desc = "返销状态" , demo = "INIT" , constraint = "")
    private String undoOrderStatus;

    public String getUndoOrderStatus() {
        return undoOrderStatus;
    }

    public void setUndoOrderStatus(String undoOrderStatus) {
        this.undoOrderStatus = undoOrderStatus;
    }
}
