/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-06 10:43 创建
 *
 */
package com.yiji.openapi.message.product.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-06
 */
@OpenApiMessage(service = "commonCheckFileDownLoad", type = ApiMessageType.Request)
public class CommonCheckFileDownLoadRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "会员id" , demo = "201606210000584145812" , constraint = "")
    private String userId;

    @NotBlank
    @OpenApiField(desc = "账期" , demo = "20150623" , constraint = "yyyyMMdd")
    private String accountDay;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountDay() {
        return accountDay;
    }

    public void setAccountDay(String accountDay) {
        this.accountDay = accountDay;
    }

}
