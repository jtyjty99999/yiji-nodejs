/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-23 16:33 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-23
 */
@OpenApiMessage(service = "mpaySureFindbackPayPwd", type = ApiMessageType.Request)
public class MpaySureFindbackPayPwdRequest extends ApiRequest {

    /**
     * 找回支付密码token
     */
    @NotNull
    @Length(max = 32, min = 1)
    @OpenApiField(desc = "找回支付密码token" , demo = "000q00m01fve9sim3400" , constraint = "")
    private String token;
    /**
     * 短信验证码
     */
    @NotNull
    @Length(max = 6, min = 6, message = "")
    @OpenApiField(desc = "短信验证码" , demo = "568923" , constraint = "")
    private String verifyCode;
    /**
     * 新支付密码
     */
    @NotNull
    @Length(max = 256)
    @OpenApiField(desc = "新支付密码" , demo = "326598" , constraint = "" , security = true)
    private String payPassword;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
