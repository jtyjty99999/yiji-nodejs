/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-09-08 10:21 创建
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
@OpenApiMessage(service = "commonThreeStepRegister", type = ApiMessageType.Response)
public class CommonThreeStepRegisterResponse extends ApiResponse {

    @OpenApiField(desc = "用户ID",demo = "12346578901234567980")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
