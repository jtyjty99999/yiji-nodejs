package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/3/1 11:25.
 */
@OpenApiMessage(service = "creditCardResendMessage", type = ApiMessageType.Response)
public class CreditCardResendMessageResponse extends ApiResponse {

    @OpenApiField(desc = "签约编号", demo = "52196812654")
    private String pactNo;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }
}
