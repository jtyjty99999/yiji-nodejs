/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-02-16 17:33 创建
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
@OpenApiMessage(service = "tradePayerQuitPoolTogether", type = ApiMessageType.Response)
public class TradePayerQuitPoolTogetherResponse extends ApiResponse {
    @OpenApiField(desc = "交易号",demo="123412341234")
    private String tradeNo;

    @OpenApiField(desc = "子交易号",demo="123412341234")
	private String subTradeNo;

    @OpenApiField(desc = "交易信息",demo="交易信息")
	private List<TradeSimpleStringInfo> info;

    @OpenApiField(desc = "返回数据",demo="12341234")
    private Map<String,Object> resultData;
	
	public List<TradeSimpleStringInfo> getInfo() {
		return info;
	}
	
	public void setInfo(List<TradeSimpleStringInfo> info) {
		this.info = info;
	}

    public String getSubTradeNo() {
        return subTradeNo;
    }

    public void setSubTradeNo(String subTradeNo) {
        this.subTradeNo = subTradeNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Map<String, Object> getResultData() {
        return resultData;
    }

    public void setResultData(Map<String, Object> resultData) {
        this.resultData = resultData;
    }
}
