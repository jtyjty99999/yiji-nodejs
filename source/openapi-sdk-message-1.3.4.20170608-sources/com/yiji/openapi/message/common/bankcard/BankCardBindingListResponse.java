/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * husheng@yiji.com 2014年8月5日 上午10:34:31创建
 */
package com.yiji.openapi.message.common.bankcard;

import java.util.List;

import com.yiji.openapi.message.common.bankcard.vo.BankCard;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 
 * 
 * @author husheng@yiji.com
 * 
 */
@OpenApiMessage(service = "bankCardBindingList", type = ApiMessageType.Response)
public class BankCardBindingListResponse extends ApiResponse {
	
	@OpenApiField(desc = "总数量", constraint = "绑定银行卡的数量",demo = "1")
	private Integer totalCount;
	
	@OpenApiField(desc = "银行卡列表", constraint = "绑定银行卡的列表")
	private List<BankCard> bankCards;
	
	public List<BankCard> getBankCards() {
		return this.bankCards;
	}
	
	public void setBankCards(List<BankCard> bankCards) {
		this.bankCards = bankCards;
	}
	
	public Integer getTotalCount() {
		return this.totalCount;
	}
	
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	
}
