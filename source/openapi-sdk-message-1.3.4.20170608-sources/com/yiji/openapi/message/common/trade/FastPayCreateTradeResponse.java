/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-26 10:55 创建
 *
 */
package com.yiji.openapi.message.common.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-26
 */
@OpenApiMessage(service = "fastPayCreateTrade", type = ApiMessageType.Response)
public class FastPayCreateTradeResponse extends ApiResponse {

    /**
     * 业务流水号
     */
    @OpenApiField(desc = "业务流水号" , demo = "565e6df6-95c0-4dee-bbfb-9c18f2" , constraint = "")
    private String tradeNo;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
