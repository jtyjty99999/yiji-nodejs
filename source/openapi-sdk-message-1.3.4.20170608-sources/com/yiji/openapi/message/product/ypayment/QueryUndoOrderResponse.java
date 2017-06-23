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

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-29
 */
@OpenApiMessage(service = "queryUndoOrder", type = ApiMessageType.Response)
public class QueryUndoOrderResponse extends ApiResponse {

    @OpenApiField(desc = "返销状态" , demo = "INIT" , constraint = "")
    private String undoOrderStatus;

    /**
     * 返销金额
     */
    @OpenApiField(desc = "返销金额" , demo = "25888" , constraint = "")
    private Money undoAmount;

    public String getUndoOrderStatus() {
        return undoOrderStatus;
    }

    public void setUndoOrderStatus(String undoOrderStatus) {
        this.undoOrderStatus = undoOrderStatus;
    }

    public Money getUndoAmount() {
        return undoAmount;
    }

    public void setUndoAmount(Money undoAmount) {
        this.undoAmount = undoAmount;
    }
}
