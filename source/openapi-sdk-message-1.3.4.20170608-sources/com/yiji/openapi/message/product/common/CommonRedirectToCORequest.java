/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-10 15:00 创建
 *
 */
package com.yiji.openapi.message.product.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "commonRedirectToCO", type = ApiMessageType.Request)
public class CommonRedirectToCORequest extends ApiRequest {

    /** 登陆名 */
    @NotBlank
    @OpenApiField(desc = "登录帐号",constraint = "用户登陆易极付帐号",demo = "20140821010000051558")
    private String loginId;

    @NotBlank
    @OpenApiField(desc = "外部订单号",constraint = "商户业务产生的订单号",demo = "12345647896123")
    private String merchantOrderBizNo;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getMerchantOrderBizNo() {
        return merchantOrderBizNo;
    }

    public void setMerchantOrderBizNo(String merchantOrderBizNo) {
        this.merchantOrderBizNo = merchantOrderBizNo;
    }
}
