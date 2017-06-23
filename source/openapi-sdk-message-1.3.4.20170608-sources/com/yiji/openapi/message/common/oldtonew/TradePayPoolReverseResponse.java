/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-25 14:06 创建
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
 * @version 2016/1/25
 */
@OpenApiMessage(service = "tradePayPoolReverse", type = ApiMessageType.Response)
public class TradePayPoolReverseResponse extends ApiResponse {
	
	@OpenApiField(desc = "外部交易号", demo = "2134123412341234")
	private String tradeOutBizNo;
	
	@OpenApiField(desc = "子交易号", demo = "2134123412341234")
	private String subTradeNo;
	
	@OpenApiField(desc = "交易信息", demo = "XXX")
	private List<TradeSimpleApiInfo> info;
	
	@OpenApiField(desc = "交易号", demo = "2134123412341234")
	private String tradeNo;
	
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
	
	public List<TradeSimpleApiInfo> getInfo() {
		return info;
	}
	
	public void setInfo(List<TradeSimpleApiInfo> info) {
		this.info = info;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
}
