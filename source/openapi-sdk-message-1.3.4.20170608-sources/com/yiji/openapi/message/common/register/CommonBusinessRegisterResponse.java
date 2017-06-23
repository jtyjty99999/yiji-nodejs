/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-08-25 15:00 创建
 *
 */
package com.yiji.openapi.message.common.register;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "commonBusinessRegister", type = ApiMessageType.Response)
public class CommonBusinessRegisterResponse extends ApiResponse {

    /** 用户ID */
    @OpenApiField(desc = "用户ID",demo = "12345679801234657890")
    private String				userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
