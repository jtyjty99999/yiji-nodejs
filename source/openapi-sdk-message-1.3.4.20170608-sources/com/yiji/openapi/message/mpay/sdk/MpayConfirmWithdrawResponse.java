/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-07-08 17:06 创建
 *
 */
package com.yiji.openapi.message.mpay.sdk;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author zhike@yiji.com
 */
@OpenApiMessage(service = "mpayConfirmWithdraw", type = ApiMessageType.Response)
public class MpayConfirmWithdrawResponse extends ApiResponse {
	
	@OpenApiField(desc = "申请提现金额", constraint = "申请提现金额", demo = "66.66")
	private Money applyAmount;
	
	@OpenApiField(desc = "手续费", constraint = "手续费", demo = "6.66")
	private Money charge;
	
	@OpenApiField(desc = "实际到帐金额", constraint = "实际到帐金额", demo = "66.66")
	private Money realAmount;
	
	@Length(max = 20)
	@OpenApiField(desc = "银行名称", constraint = "银行名称", demo = "中信银行")
	private String bankName;
	
	@OpenApiField(desc = "银行卡卡号", constraint = "银行卡卡号", demo = "6215700019872541")
	private String cardNo;
	
	@NotBlank
	@OpenApiField(desc = "提提现处理状态",
			constraint = "{\"data\":[\"fail:失败\",\"processing:处理中\",\"success:成功\"],\"name\":\"提现处理状态\"}",
			demo = "success")
	private String bizStatus;
	
	@Length(max = 128)
	@OpenApiField(desc = "备注", constraint = "备注", demo = "success")
	private String bizMemo;
	
	@Length(max = 20)
	@OpenApiField(desc = "预计到帐时间", constraint = "预计到帐时间", demo = "2016年6月15日 22点 ")
	private String expectTime;
	
	public Money getApplyAmount() {
		return applyAmount;
	}
	
	public void setApplyAmount(Money applyAmount) {
		this.applyAmount = applyAmount;
	}
	
	public Money getCharge() {
		return charge;
	}
	
	public void setCharge(Money charge) {
		this.charge = charge;
	}
	
	public Money getRealAmount() {
		return realAmount;
	}
	
	public void setRealAmount(Money realAmount) {
		this.realAmount = realAmount;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getBizStatus() {
		return bizStatus;
	}
	
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}
	
	public String getBizMemo() {
		return bizMemo;
	}
	
	public void setBizMemo(String bizMemo) {
		this.bizMemo = bizMemo;
	}
	
	public String getBankName() {
		return this.bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getExpectTime() {
		return this.expectTime;
	}
	
	public void setExpectTime(String expectTime) {
		this.expectTime = expectTime;
	}
	
}
