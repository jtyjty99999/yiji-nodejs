package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/1/4 10:24.
 */
@OpenApiMessage(service = "commonOfflineRecharge", type = ApiMessageType.Notify)
public class CommonOfflineRechargeNotify extends ApiNotify {
    @OpenApiField(desc = "付款总金额",demo = "88.66",constraint = "包含手续费")
    private Money totalAmount;

    @OpenApiField(desc = "易极付用户ID", demo = "20165284596325148")
    private String userId;

    public Money getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Money totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
