/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午2:06:58 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.List;
import java.util.Map;

import com.yiji.openapi.message.common.oldtonew.info.TradeSimpleApiInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "zbjTradeTransfer", type = ApiMessageType.Response)
public class ZbjTradeTransferResponse extends ApiResponse {

	@OpenApiField(desc = "交易号", demo = "123456798")
	private String tradeNo;

	@OpenApiField(desc = "订单号", demo = "123456798")
	private String tradeOutBizNo;

	@OpenApiField(desc = "子交易号", demo = "123456798")
	private String subTradeNo;

	@OpenApiField(desc = "特殊返回数据集", demo = "")
	private Map<String, Object> resultData;

	@OpenApiField(desc = "交易信息", demo = "")
	private List<TradeSimpleApiInfo> info;

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeOutBizNo() {
		return this.tradeOutBizNo;
	}

	public void setTradeOutBizNo(String tradeOutBizNo) {
		this.tradeOutBizNo = tradeOutBizNo;
	}

	public String getSubTradeNo() {
		return this.subTradeNo;
	}

	public void setSubTradeNo(String subTradeNo) {
		this.subTradeNo = subTradeNo;
	}

	public Map<String, Object> getResultData() {
		return this.resultData;
	}

	public void setResultData(Map<String, Object> resultData) {
		this.resultData = resultData;
	}

	public List<TradeSimpleApiInfo> getInfo() {
		return this.info;
	}

	public void setInfo(List<TradeSimpleApiInfo> info) {
		this.info = info;
	}

}
