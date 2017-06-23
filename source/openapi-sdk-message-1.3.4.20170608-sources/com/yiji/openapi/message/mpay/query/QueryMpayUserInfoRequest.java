/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-19 14:56 创建
 *
 */
package com.yiji.openapi.message.mpay.query;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-19
 */
@OpenApiMessage(service = "queryMpayUserInfo", type = ApiMessageType.Request)
public class QueryMpayUserInfoRequest extends ApiRequest {

    /**
     * 会员号
     */
    @NotNull
    @Length(max = 64, min = 1)
    @OpenApiField(desc = "会员号" , demo = "20140709010000825596" , constraint = "")
    private String userId;
    /**
     * 会员类型
     */
    @NotBlank
    @OpenApiField(desc = "会员类型" , demo = "INNER" , constraint = "")
    private String userType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
