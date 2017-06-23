/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-29 16:35 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-29
 */
@OpenApiMessage(service = "mpaySetPay", type = ApiMessageType.Request)
public class MpaySetPayRequest extends ApiRequest {


    /**
     * 易极付用户（必填）
     */
    @NotBlank
    @Length(max = 32)
    @OpenApiField(desc = "会员Id" , demo = "20141225010000062065" , constraint = "")
    private String userId;

    @NotBlank
    @OpenApiField(desc = "会员类型" , demo = "MEMBER_TYPE_PATERN" , constraint = "1，商户会员：MEMBER_TYPE_PATERN，2，易极付会员：MEMBER_TYPE_YIJI")
    private String memberType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
}
