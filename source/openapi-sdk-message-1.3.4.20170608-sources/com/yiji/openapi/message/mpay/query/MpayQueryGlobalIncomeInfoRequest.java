/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-07-20 19:50 创建
 *
 */
package com.yiji.openapi.message.mpay.query;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author zhike@yiji.com
 */
@OpenApiMessage(service = "mpayQueryGlobalIncomeInfo", type = ApiMessageType.Request)
public class MpayQueryGlobalIncomeInfoRequest extends ApiRequest {

    @Length(max = 20)
    @OpenApiField(desc = "用户ID", demo = "20150619010000072320", constraint = "用户ID")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
