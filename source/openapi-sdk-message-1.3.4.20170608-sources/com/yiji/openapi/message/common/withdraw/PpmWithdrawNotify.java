/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月11日 下午3:19:34 创建
 */
package com.yiji.openapi.message.common.withdraw;

import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 
 * 
 * @authorMAYANSEN
 * 
 */
@OpenApiMessage(service = "ppmNewWithdraw", type = ApiMessageType.Notify)
public class PpmWithdrawNotify extends ApiNotify {
	
	@Size(max = 20)
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@Size(max = 20)
	@OpenApiField(desc = "消息状态")
	private String status;
	
	@Size(max = 20)
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@OpenApiField(desc = "申请提现金额")
	private Money amount;
	
	@Size(max = 20)
	@OpenApiField(desc = "实际到账金额")
	private Money amountIn;
	
	@Size(max = 20)
	@OpenApiField(desc = "银行卡号")
	private String bankCardNo;
	
	@Size(max = 20)
	@OpenApiField(desc = "银行名称")
	private String bankName;
	
	/**
	 * @return the outOrderNo
	 */
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	/**
	 * @param outOrderNo the outOrderNo to set
	 */
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * @return the amount
	 */
	public Money getAmount() {
		return amount;
	}
	
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	/**
	 * @return the bankCardNo
	 */
	public String getBankCardNo() {
		return bankCardNo;
	}
	
	/**
	 * @param bankCardNo the bankCardNo to set
	 */
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	/**
	 * @return the amountIn
	 */
	public Money getAmountIn() {
		return amountIn;
	}
	
	/**
	 * @param amountIn the amountIn to set
	 */
	public void setAmountIn(Money amountIn) {
		this.amountIn = amountIn;
	}
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
}
