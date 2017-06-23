/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-07-08 17:05 创建
 *
 */
package com.yiji.openapi.message.mpay.sdk;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author zhike@yiji.com
 */
@OpenApiMessage(service = "mpayConfirmWithdraw", type = ApiMessageType.Request)
public class MpayConfirmWithdrawRequest extends ApiRequest {

    @NotBlank
    @Length(max = 32)
    @OpenApiField(desc = "提现申请流水号", constraint = "提现申请流水号", demo = "20151208000010595418")
    private String token;

    @NotBlank
    @Length(max = 256)
    @OpenApiField(desc = "支付密码", constraint = "支付密码", demo = "12345678", security = true)
    private String payPassword;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }
}
