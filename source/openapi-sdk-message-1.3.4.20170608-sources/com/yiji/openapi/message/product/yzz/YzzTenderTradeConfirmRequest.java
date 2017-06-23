/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-22 14:14 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.product.yzz.info.ProfitOrder;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yzzTenderTradeConfirm", type = ApiMessageType.Request)
public class YzzTenderTradeConfirmRequest extends ApiRequest {
	
	@NotEmpty
	@OpenApiField(desc = "交易号")
	@Size(min = 20, max = 20)
	private String tradeNo;
	
	@OpenApiField(desc = "说明")
	private String memo;
	
	@Size(min = 0, max = 10)
	@OpenApiField(desc = "分润列表(可选)", constraint = "即时到帐时由于已经分润不需要传")
	private List<ProfitOrder> profits;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public List<ProfitOrder> getProfits() {
		return profits;
	}
	
	public void setProfits(List<ProfitOrder> profits) {
		this.profits = profits;
	}
}
