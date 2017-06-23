/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午6:31:59 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.oldtonew.info.TradePoolSubTansferInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "tradePayPoolTogether", type = ApiMessageType.Request)
public class TradePayPoolTogetherRequest extends ApiRequest {

	@NotBlank
	@OpenApiField(desc = "交易号", demo = "20160127000048120823")
	private String tradeNo;

	@Length(max = 1024)
	@OpenApiField(desc = "交易备注", demo = "交易备注")
	private String tradeMemo;

	@OpenApiField(desc = "外部业务号", demo = "20160125000046400410")
	private String tradeOutBizNo;

	@Valid
	@Size(max = 200)
	@OpenApiField(desc = "子转账指令", demo = "XXX")
	private List<TradePoolSubTansferInfo> tradePoolSubTansferOrders;

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeMemo() {
		return this.tradeMemo;
	}

	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}

	public List<TradePoolSubTansferInfo> getTradePoolSubTansferOrders() {
		return this.tradePoolSubTansferOrders;
	}

	public void setTradePoolSubTansferOrders(List<TradePoolSubTansferInfo> tradePoolSubTansferOrders) {
		this.tradePoolSubTansferOrders = tradePoolSubTansferOrders;
	}

	public String getTradeOutBizNo() {
		return this.tradeOutBizNo;
	}

	public void setTradeOutBizNo(String tradeOutBizNo) {
		this.tradeOutBizNo = tradeOutBizNo;
	}

}
