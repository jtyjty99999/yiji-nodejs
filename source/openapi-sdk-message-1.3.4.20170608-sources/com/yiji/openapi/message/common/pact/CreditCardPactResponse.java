package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/28 16:20.
 */
@OpenApiMessage(service = "creditCardPact", type = ApiMessageType.Response)
public class CreditCardPactResponse extends ApiResponse {

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

    /**
     * 短信倒计时剩余时间
     */
    @OpenApiField(desc = "短信有效时间", demo = "60")
    private String countdown;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getCountdown() {
        return countdown;
    }

    public void setCountdown(String countdown) {
        this.countdown = countdown;
    }

    public String getPactStatus() {
        return pactStatus;
    }

    public void setPactStatus(String pactStatus) {
        this.pactStatus = pactStatus;
    }
}
