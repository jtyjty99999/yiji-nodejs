/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-02-18 14:07 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/2/18
 */
@OpenApiMessage(service = "smsCaptcha", type = ApiMessageType.Response)
public class SmsCaptchaResponse extends ApiResponse {
    @OpenApiField(desc="外部流水号",demo="202382323123")
    private String notifyTime;

    @OpenApiField(desc="返回消息",demo="返回消息")
    private String message;

    @OpenApiField(desc="验证码ID",demo="验证码ID")
    private String checkCodeUniqueId;

    public String getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(String notifyTime) {
        this.notifyTime = notifyTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCheckCodeUniqueId() {
        return checkCodeUniqueId;
    }

    public void setCheckCodeUniqueId(String checkCodeUniqueId) {
        this.checkCodeUniqueId = checkCodeUniqueId;
    }
}
