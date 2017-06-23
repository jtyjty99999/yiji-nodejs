/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-22 17:47 创建
 *
 */
package com.yiji.openapi.message.common.pact;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-22
 */
@OpenApiMessage(service = "queryAsynVerifyCardThree", type = ApiMessageType.Response)
public class QueryAsynVerifyCardThreeResponse extends ApiResponse {

    @NotNull
    @OpenApiField(desc = "通用签约流状态" , demo = "6151421051514" , constraint = "流水号")
    private String verifyStatus;

    @OpenApiField(desc = "错误码code", demo = "cn00012452")
    private String code;

    @OpenApiField(desc = "状态详情",demo = "成功")
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
