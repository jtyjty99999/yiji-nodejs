/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-02-01 14:43 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import com.yiji.openapi.message.common.oldtonew.info.TradeSimpleApiInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/2/1
 */
@Deprecated
@OpenApiMessage(service = "tradeCreatePoolReverse", type = ApiMessageType.Response)
public class TradeCreatePoolReverseResponse extends ApiResponse {

    @OpenApiField(desc="外部流水号",demo="202382323123")
    private String tradeOutBizNo;

    @OpenApiField(desc="交易号",demo="202382323123")
    private String tradeNo;

    @OpenApiField(desc="子交易号",demo="202382323123")
    private String subTradeNo;

    @OpenApiField(desc="交易明细",demo="[交易1，交易2]")
    private List<TradeSimpleApiInfo> info;

    public String getTradeOutBizNo() {
        return tradeOutBizNo;
    }

    public void setTradeOutBizNo(String tradeOutBizNo) {
        this.tradeOutBizNo = tradeOutBizNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getSubTradeNo() {
        return subTradeNo;
    }

    public void setSubTradeNo(String subTradeNo) {
        this.subTradeNo = subTradeNo;
    }

    public List<TradeSimpleApiInfo> getInfo() {
        return info;
    }

    public void setInfo(List<TradeSimpleApiInfo> info) {
        this.info = info;
    }
}
