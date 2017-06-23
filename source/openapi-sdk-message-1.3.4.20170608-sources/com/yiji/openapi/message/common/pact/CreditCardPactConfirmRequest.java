package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/3/1 10:59.
 */
@OpenApiMessage(service = "creditCardPactConfirm", type = ApiMessageType.Request)
public class CreditCardPactConfirmRequest extends ApiRequest {

    /**
     * 签约流水号
     */
    @NotBlank(message = "签约编号不能为空")
    @OpenApiField(desc = "签约编号", demo = "52196812654")
    private String pactNo;

    /**
     * 短信验证码
     */
    @NotBlank(message = "短信验证码不能为空")
    @OpenApiField(desc = "短信验证码", demo = "314354")
    private String verifyCode;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}
