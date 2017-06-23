/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-30 14:23 创建
 *
 */
package com.yiji.openapi.message.mpay.query;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-30
 */
@OpenApiMessage(service = "queryMpayTradeInfo", type = ApiMessageType.Request)
public class QueryMpayTradeInfoRequest extends ApiRequest {

    /**
     * 交易号
     */
    @NotBlank
    @Length(max = 35, min = 20)
    @OpenApiField(desc = "交易号" , demo = "20160215325254121" , constraint = "")
    private String tradeNo;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
