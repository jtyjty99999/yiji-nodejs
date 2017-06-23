/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-02-16 17:07 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import java.util.List;
import java.util.Map;

import com.yiji.openapi.message.common.oldtonew.info.TradeSimpleStringInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/2/16
 */
@OpenApiMessage(service = "tradePayerApplyPoolTogether", type = ApiMessageType.Response)
public class TradePayerApplyPoolTogetherResponse extends ApiResponse {

    @OpenApiField(desc = "商户交易号",demo = "54867213564123")
    private String tradeOutBizNo;

    @OpenApiField(desc = "子交易订单号",demo = "25434562154")
    private String subTradeNo;

    @OpenApiField(desc = "其他交易信息")
    private Map<String,Object> resultData;

    @OpenApiField(desc = "交易订单信息")
    private List<TradeSimpleStringInfo> info;

    @OpenApiField(desc = "交易号",demo = "6356413654")
    private String tradeNo;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeOutBizNo() {
        return tradeOutBizNo;
    }

    public void setTradeOutBizNo(String tradeOutBizNo) {
        this.tradeOutBizNo = tradeOutBizNo;
    }

    public String getSubTradeNo() {
        return subTradeNo;
    }

    public void setSubTradeNo(String subTradeNo) {
        this.subTradeNo = subTradeNo;
    }

    public Map<String, Object> getResultData() {
        return resultData;
    }

    public void setResultData(Map<String, Object> resultData) {
        this.resultData = resultData;
    }

    public List<TradeSimpleStringInfo> getInfo() {
        return info;
    }

    public void setInfo(List<TradeSimpleStringInfo> info) {
        this.info = info;
    }
}
