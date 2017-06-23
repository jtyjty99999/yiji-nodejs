/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * dengwei@yiji.com 2015年9月8日 下午7:56:58 创建
 */

package com.yiji.openapi.message.mpay.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 支付台查询绑卡列表结果
 * 
 * @author dengwei@yiji.com
 * 
 */
@OpenApiMessage(service = "fsTradePayByFriend", type = ApiMessageType.Response)
public class TradePayFriendResponse extends ApiResponse {
	
	@OpenApiField(desc = "业务交易号", demo = "20160315000029186659")
	private String tradeNo;
	
	@OpenApiField(desc = "支付状态", demo = "success",constraint="{\"data\":[\"success:支付成功\",\"fail:支付失败\",\"processing:支付处理中\"],\"name\":\"支付结果\"}")
	private String tradeStatus;
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	
	public String getTradeStatus() {
		return this.tradeStatus;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
}
