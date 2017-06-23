package com.yiji.openapi.message.common.pact;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/3/1 11:00.
 */
@OpenApiMessage(service = "creditCardPactConfirm", type = ApiMessageType.Response)
public class CreditCardPactConfirmResponse extends ApiResponse {

    /**
     * 签约流水号
     */
    @OpenApiField(desc = "签约编号", demo = "235832186132")
    private String pactNo;

    /**
     * 签约状态
     */
    @OpenApiField(desc = "签约状态", demo = "PACT_APPLY")
    private String pactStatus;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getPactStatus() {
        return pactStatus;
    }

    public void setPactStatus(String pactStatus) {
        this.pactStatus = pactStatus;
    }
}
