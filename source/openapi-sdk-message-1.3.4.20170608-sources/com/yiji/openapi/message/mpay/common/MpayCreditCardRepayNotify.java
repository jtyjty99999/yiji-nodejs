package com.yiji.openapi.message.mpay.common;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/20 14:08.
 */
@OpenApiMessage(service = "mpayCreditCardRepay", type = ApiMessageType.Notify)
public class MpayCreditCardRepayNotify extends ApiNotify {

    @OpenApiField(desc = "还款金额",demo = "88.66")
    private String amount;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
