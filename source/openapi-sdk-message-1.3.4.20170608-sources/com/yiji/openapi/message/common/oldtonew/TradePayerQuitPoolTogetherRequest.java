/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-02-16 17:33 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/2/16
 */
@OpenApiMessage(service = "tradePayerQuitPoolTogether", type = ApiMessageType.Request)
public class TradePayerQuitPoolTogetherRequest extends ApiRequest {
	@NotBlank
	@OpenApiField(desc = "交易号", demo = "123123123")
	private String tradeNo;
	
	@Length(max = 1024)
	@OpenApiField(desc = "交易备注", demo = "明天发货")
	private String tradeMemo;
	
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "子交易号", demo = "123123123123")
	private String subTradeNo;
	
	@Length(max = 1024)
	@OpenApiField(desc = "子交易备注", demo = "明天发货")
	private String subTradeMemo;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getTradeMemo() {
		return tradeMemo;
	}
	
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}
	
	public String getSubTradeNo() {
		return subTradeNo;
	}
	
	public void setSubTradeNo(String subTradeNo) {
		this.subTradeNo = subTradeNo;
	}
	
	public String getSubTradeMemo() {
		return subTradeMemo;
	}
	
	public void setSubTradeMemo(String subTradeMemo) {
		this.subTradeMemo = subTradeMemo;
	}
}
