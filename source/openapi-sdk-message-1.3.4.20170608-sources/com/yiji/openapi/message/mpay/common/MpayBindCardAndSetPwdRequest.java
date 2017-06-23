/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-20 15:12 创建
 *
 */
package com.yiji.openapi.message.mpay.common;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-20
 */
@OpenApiMessage(service = "mpayBindCardAndSetPwd", type = ApiMessageType.Request)
public class MpayBindCardAndSetPwdRequest extends ApiRequest {

    /**
     * 签约号
     */
    @NotNull
    @Length(max = 20, min = 1)
    @OpenApiField(desc = "签约号" , demo = "F1Zb3XDG00251r" , constraint = "")
    private String pactNo;
    /**
     * 短信验证码
     */
    @NotNull
    @Length(max = 6, min = 6)
    @OpenApiField(desc = "短信验证码" , demo = "051654" , constraint = "")
    private String verifyCode;
    /**
     * 支付密码，首次绑卡需要设置
     */
    @Length(max = 256)
    @OpenApiField(desc = "支付密码" , demo = "yjf9545614" , constraint = "支付密码，首次绑卡需要设置" , security = true)
    private String payPassword;

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

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }
}
