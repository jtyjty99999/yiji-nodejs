/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-04 16:49 创建
 *
 */
package com.yiji.openapi.message.common.core;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "grBindCard", type = ApiMessageType.Request)
public class GrBindCardRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "用户ID")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "产品编码")
	private String productCode;
	
	@NotBlank
	@OpenApiField(desc = "子产品编码")
	private String subProductCode;
	
	@NotBlank
	@OpenApiField(desc = "合同扫描件地址")
	private String contractURL;
	
	@NotBlank
	@OpenApiField(desc = "银行名称")
	private String bankName;
	
	@NotBlank
	@OpenApiField(desc = "银行代码")
	private String bankCode;
	
	@NotBlank
	@OpenApiField(desc = "银行所在省")
	private String bankProvince;
	
	@NotBlank
	@OpenApiField(desc = "银行所在市")
	private String bankCity;
	
	@OpenApiField(desc = "支行")
	private String bankBranch;
	
	@NotBlank
	@OpenApiField(desc = "卡号")
	private String cardNo;
	
	@NotNull
	@OpenApiField(desc = "账户类型(对公/对私")
	private String cardType;
	
	@NotBlank
	@OpenApiField(desc = "证件号")
	private String certNo;
	
	@NotBlank
	@OpenApiField(desc = "证件姓名")
	private String cardName;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getProductCode() {
		return productCode;
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public String getSubProductCode() {
		return subProductCode;
	}
	
	public void setSubProductCode(String subProductCode) {
		this.subProductCode = subProductCode;
	}
	
	public String getContractURL() {
		return contractURL;
	}
	
	public void setContractURL(String contractURL) {
		this.contractURL = contractURL;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankProvince() {
		return bankProvince;
	}
	
	public void setBankProvince(String bankProvince) {
		this.bankProvince = bankProvince;
	}
	
	public String getBankCity() {
		return bankCity;
	}
	
	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}
	
	public String getBankBranch() {
		return bankBranch;
	}
	
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCardName() {
		return cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
}
