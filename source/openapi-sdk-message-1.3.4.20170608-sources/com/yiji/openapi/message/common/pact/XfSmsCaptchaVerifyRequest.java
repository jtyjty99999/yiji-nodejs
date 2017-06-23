/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-09-26 09:15 创建
 *
 */
package com.yiji.openapi.message.common.pact;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "xfSmsCaptchaVerify", type = ApiMessageType.Request)
public class XfSmsCaptchaVerifyRequest extends ApiRequest {

    /** 签约流水号 */
    @NotBlank(message = "签约流水号不能为空")
    @OpenApiField(desc = "签约流水号",demo = "123645897123")
    private String pactNo;

    /** 短信验证码 */
    @NotBlank(message = "短信验证码不能为空")
    @OpenApiField(desc = "短信验证码",demo = "123456")
    private String phoneCode;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}
