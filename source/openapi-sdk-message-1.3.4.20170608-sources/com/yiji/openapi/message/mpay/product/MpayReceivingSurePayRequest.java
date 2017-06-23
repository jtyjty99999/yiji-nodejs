/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-24 09:20 创建
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
 * @since 2016-05-24
 */
@OpenApiMessage(service = "mpayReceivingSurePay", type = ApiMessageType.Request)
public class MpayReceivingSurePayRequest extends ApiRequest {

    /**
     * 交易号
     */
    @NotNull
    @Length(max = 20, min = 1)
    @OpenApiField(desc = "交易号" , demo = "2015060512456321" , constraint = "")
    private String tradeNo;
    /**
     * 四要素验证token
     */
    @NotNull
    @Length(max = 32, min = 1)
    @OpenApiField(desc = "四要素验证token" , demo = "000q00m01fve9sim3400" , constraint = "")
    private String token;
    /**
     * 短信验证码
     */
    @NotNull
    @Length(max = 6, min = 6)
    @OpenApiField(desc = "短信验证码" , demo = "562389" , constraint = "")
    private String verifyCode;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

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
}
