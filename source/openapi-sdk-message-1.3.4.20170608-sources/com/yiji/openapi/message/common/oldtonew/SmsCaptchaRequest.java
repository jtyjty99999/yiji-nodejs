/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-02-18 14:06 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/2/18
 */
@OpenApiMessage(service = "smsCaptcha", type = ApiMessageType.Request)
public class SmsCaptchaRequest extends ApiRequest {
    @OpenApiField(desc="用户ID",demo="2012371293123123")
    private String userId;
    @OpenApiField(desc="手机号",demo="13883812744|15829129341")
    private String mobile;
    @OpenApiField(desc="短信内容",demo="短信内容")
    private String smsContext;
    @OpenApiField(desc="后缀",demo="易极付")
    private String suffix;

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSmsContext() {
        return smsContext;
    }

    public void setSmsContext(String smsContext) {
        this.smsContext = smsContext;
    }
}
