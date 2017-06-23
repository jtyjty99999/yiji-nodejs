/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-15 09:43 创建
 *
 */
package com.yiji.openapi.message.common.installment;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "installmentChangeBankCard", type = ApiMessageType.Request)
public class InstallmentChangeBankCardRequest extends ApiRequest {
	
	/**
	 * 签约合同号
	 */
	@NotEmpty
	@OpenApiField(desc = "签约合同号")
	private String contractNo;
	
	/**
	 * 银行编码
	 */
	@OpenApiField(desc = "银行编码")
	private String bankCode;
	
	/**
	 * 银行卡类型
	 */
	@OpenApiField(desc = "银行卡类型")
	private String bankCardType;
	
	/**
	 * 银行卡号
	 */
	@OpenApiField(desc = "银行卡号")
	private String bankCardNo;
	
	/**
	 * 银行卡照片
	 */
	@OpenApiField(desc = "银行卡照片地址")
	private String bankCardImageUrl;
	
	/**
	 * 操作类型
	 */
	@NotBlank
	@OpenApiField(desc = "操作类型")
	private String operateType;
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankCardType() {
		return bankCardType;
	}
	
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}
	
	public String getBankCardNo() {
		return bankCardNo;
	}
	
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	
	public String getBankCardImageUrl() {
		return bankCardImageUrl;
	}
	
	public void setBankCardImageUrl(String bankCardImageUrl) {
		this.bankCardImageUrl = bankCardImageUrl;
	}
	
	public String getOperateType() {
		return operateType;
	}
	
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
}
