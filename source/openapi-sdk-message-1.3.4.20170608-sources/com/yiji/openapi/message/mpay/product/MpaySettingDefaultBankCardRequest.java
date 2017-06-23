/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-24 11:07 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-24
 */
@OpenApiMessage(service = "mpaySettingDefaultBankCard", type = ApiMessageType.Request)
public class MpaySettingDefaultBankCardRequest extends ApiRequest {

    /**
     * 内部会员号
     */
    @NotNull
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "内部会员号" , demo = "20151130010009440067" , constraint = "")
    private String userId;
    /**
     * 签约号
     */
    @NotNull
    @Length(max = 20, min = 1)
    @OpenApiField(desc = "签约号" , demo = "FrnuBRi400252z" , constraint = "")
    private String pactNo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }
}
