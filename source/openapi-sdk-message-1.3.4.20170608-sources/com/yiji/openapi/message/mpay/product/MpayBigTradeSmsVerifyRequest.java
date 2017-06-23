/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-23 15:29 创建
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
 * @since 2016-05-23
 */
@OpenApiMessage(service = "mpayBigTradeSmsVerify", type = ApiMessageType.Request)
public class MpayBigTradeSmsVerifyRequest extends ApiRequest {

    /**
     * 交易号
     */
    @NotNull
    @Length(max = 20, min = 1)
    @OpenApiField(desc = "交易号" , demo = "20150729020006847500" , constraint = "")
    private String tradeNo;
    /**
     * 内部会员号
     */
    @NotNull
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "内部会员号" , demo = "20150729020006847500" , constraint = "")
    private String userId;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
