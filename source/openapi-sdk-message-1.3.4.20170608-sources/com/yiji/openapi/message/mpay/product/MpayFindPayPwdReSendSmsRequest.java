/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-23 17:14 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-23
 */
@OpenApiMessage(service = "mpayFindPayPwdReSendSms", type = ApiMessageType.Request)
public class MpayFindPayPwdReSendSmsRequest extends ApiRequest {
    /**
     * 找回支付密码token
     */
    @NotBlank
    @OpenApiField(desc = "找回支付密码token" , demo = "000q00m01fve9sim3400" , constraint = "")
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
