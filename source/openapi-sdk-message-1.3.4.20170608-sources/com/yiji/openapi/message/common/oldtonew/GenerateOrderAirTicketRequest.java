/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-02-15 11:29 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/2/15
 */
@OpenApiMessage(service = "generate_order_airticket", type = ApiMessageType.Request)
public class GenerateOrderAirTicketRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "用户ID",demo = "2012392139123123")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
