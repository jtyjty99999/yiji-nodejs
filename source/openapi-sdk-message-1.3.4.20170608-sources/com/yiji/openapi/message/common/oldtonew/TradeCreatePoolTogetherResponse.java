/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 上午11:28:16 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.HashMap;
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
@Deprecated
@OpenApiMessage(service = "tradeCreatePoolTogether", type = ApiMessageType.Response)
public class TradeCreatePoolTogetherResponse extends ApiResponse {

	@OpenApiField(desc = "交易号KEY", demo = "20160125000046400410")
	private String tradeNo;

	@OpenApiField(desc = "外部业务号", demo = "20160125000046400410")
	private String tradeOutBizNo;

	@OpenApiField(desc = "子交易号", demo = "20160125000046400410")
	private String subTradeNo;

	@OpenApiField(desc = "交易简单信息", demo = "")
	private List<TradeSimpleApiInfo> info;

	@OpenApiField(desc = "特殊返回数据集", demo = "")
	private Map<String, Object> resultData = new HashMap<String, Object>();

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

	public List<TradeSimpleApiInfo> getInfo() {
		return this.info;
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

	public Map<String, Object> getResultData() {
		return this.resultData;
	}

	public void setResultData(Map<String, Object> resultData) {
		this.resultData = resultData;
	}

}
