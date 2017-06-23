/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月20日 上午9:24:16 创建
 */
package com.yiji.openapi.message.product.cowpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "queryAccountInfoByUserId", type = ApiMessageType.Response)
public class QueryAccountInfoByUserIdResponse extends ApiResponse {
	
	@OpenApiField(desc = "总金额")
	private String allAmount;
	
	@OpenApiField(desc = "冻结金额")
	private String frozenAmount;
	
	@OpenApiField(desc = "可用金额")
	private String availableAmount;
	
	@OpenApiField(desc = "总的理财金额")
	private String allInvestAmount;
	
	@OpenApiField(desc = "总的投资历史收益")
	private String pastInvestAmount;
	
	@OpenApiField(desc = "总的投资在途收益")
	private String futureInvestAmount;
	
	@OpenApiField(desc = "申购理财中资产")
	private String sumInvestInTransitAmount;
	
	@OpenApiField(desc = "未匹配理财资产")
	private String unmatchAmount;
	
	@OpenApiField(desc = "已匹配理财资产")
	private String investAmount;
	
	public String getAllAmount() {
		return this.allAmount;
	}
	
	public void setAllAmount(String allAmount) {
		this.allAmount = allAmount;
	}
	
	public String getFrozenAmount() {
		return this.frozenAmount;
	}
	
	public void setFrozenAmount(String frozenAmount) {
		this.frozenAmount = frozenAmount;
	}
	
	public String getAvailableAmount() {
		return this.availableAmount;
	}
	
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	
	public String getAllInvestAmount() {
		return this.allInvestAmount;
	}
	
	public void setAllInvestAmount(String allInvestAmount) {
		this.allInvestAmount = allInvestAmount;
	}
	
	public String getPastInvestAmount() {
		return this.pastInvestAmount;
	}
	
	public void setPastInvestAmount(String pastInvestAmount) {
		this.pastInvestAmount = pastInvestAmount;
	}
	
	public String getFutureInvestAmount() {
		return this.futureInvestAmount;
	}
	
	public void setFutureInvestAmount(String futureInvestAmount) {
		this.futureInvestAmount = futureInvestAmount;
	}
	
	public String getSumInvestInTransitAmount() {
		return this.sumInvestInTransitAmount;
	}
	
	public void setSumInvestInTransitAmount(String sumInvestInTransitAmount) {
		this.sumInvestInTransitAmount = sumInvestInTransitAmount;
	}
	
	public String getUnmatchAmount() {
		return this.unmatchAmount;
	}
	
	public void setUnmatchAmount(String unmatchAmount) {
		this.unmatchAmount = unmatchAmount;
	}
	
	public String getInvestAmount() {
		return this.investAmount;
	}
	
	public void setInvestAmount(String investAmount) {
		this.investAmount = investAmount;
	}
	
}
