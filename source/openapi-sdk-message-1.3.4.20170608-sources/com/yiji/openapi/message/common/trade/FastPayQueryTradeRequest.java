/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-26 17:12 创建
 *
 */
package com.yiji.openapi.message.common.trade;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-26
 */
@OpenApiMessage(service = "fastPayQueryTrade", type = ApiMessageType.Request)
public class FastPayQueryTradeRequest extends ApiRequest {
    /**
     * 流水号
     */
    @Length(min = 20, max = 20)
    @OpenApiField(desc = "流水号" , demo = "2016052630793904" , constraint = "")
    private String tradeNo;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
