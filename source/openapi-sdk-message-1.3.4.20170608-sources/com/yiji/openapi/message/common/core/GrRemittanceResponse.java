/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-05 10:44 创建
 *
 */
package com.yiji.openapi.message.common.core;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "grRemittance", type = ApiMessageType.Response)
public class GrRemittanceResponse extends ApiResponse {
	
	@OpenApiField(desc = "订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "汇付申请时间")
	private Date applyTime;
	
	@OpenApiField(desc = "交易流水号")
	private String tradeNo;
	
	@OpenApiField(desc = "汇款帐户ID")
	private String userId;
	
	@OpenApiField(desc = "收款账户名")
	private String cardName;
	
	@OpenApiField(desc = "收款证件号码")
	private String certNo;
	
	@OpenApiField(desc = "收款银行帐户卡号")
	private String cardNo;
	
	@OpenApiField(desc = "银行名称")
	private String bankName;
	
	@OpenApiField(desc = "银行代码")
	private String bankCode;
	
	@OpenApiField(desc = "金额")
	private String remittanceAmount;
	
	@OpenApiField(desc = "手续费")
	private String charge;
	
	@OpenApiField(desc = "状态")
	private String status;
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public Date getApplyTime() {
		return applyTime;
	}
	
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCardName() {
		return cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
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
	
	public String getRemittanceAmount() {
		return remittanceAmount;
	}
	
	public void setRemittanceAmount(String remittanceAmount) {
		this.remittanceAmount = remittanceAmount;
	}
	
	public String getCharge() {
		return charge;
	}
	
	public void setCharge(String charge) {
		this.charge = charge;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
