/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-18 17:28 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/18
 */
@OpenApiMessage(service = "yzzBankCardBin", type = ApiMessageType.Response)
public class YzzBankCardBinResponse extends ApiResponse {
	
	@OpenApiField(desc = "银行编码", constraint = "银行编码", demo = "CCB")
	private String bankId;
	
	@OpenApiField(desc = "银行名称", constraint = "银行名称", demo = "建设银行")
	private String bankName;
	
	@OpenApiField(desc = "银行卡名字", constraint = "银行卡名字", demo = "龙卡储蓄卡")
	private String bankCardName;
	
	@OpenApiField(desc = "银行卡类型Code", constraint = "银行卡类型Code", demo = "DEBIT")
	private String bankCardTypeCode;
	
	@OpenApiField(desc = "银行卡类型名称", constraint = "银行卡类型名称", demo = "借记卡")
	private String bankCardTypeName;
	
	public String getBankId() {
		return bankId;
	}
	
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankCardName() {
		return bankCardName;
	}
	
	public void setBankCardName(String bankCardName) {
		this.bankCardName = bankCardName;
	}
	
	public String getBankCardTypeCode() {
		return bankCardTypeCode;
	}
	
	public void setBankCardTypeCode(String bankCardTypeCode) {
		this.bankCardTypeCode = bankCardTypeCode;
	}
	
	public String getBankCardTypeName() {
		return bankCardTypeName;
	}
	
	public void setBankCardTypeName(String bankCardTypeName) {
		this.bankCardTypeName = bankCardTypeName;
	}
}
