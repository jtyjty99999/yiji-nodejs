/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 上午10:18:58 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.Map;

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
@OpenApiMessage(service = "drawback", type = ApiMessageType.Response)
public class DrawbackResponse extends ApiResponse {

	@OpenApiField(desc = "子交易流水号", demo = "20160121000043234313")
	private String subTradeNo;

	@OpenApiField(desc = "返回数据集", demo = "XXX")
	private Map<String, Object> resultData;

	@OpenApiField(desc = "退款号", demo = "20160121000043234313")
	private String refundNo;

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

	public String getRefundNo() {
		return this.refundNo;
	}

	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}

}
