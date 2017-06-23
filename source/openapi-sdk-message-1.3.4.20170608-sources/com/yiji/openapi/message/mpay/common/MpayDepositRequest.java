/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年11月27日 上午10:56:00 创建
 */
package com.yiji.openapi.message.mpay.common;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "mpayDeposit", type = ApiMessageType.Request)
public class MpayDepositRequest extends ApiRequest {
	
	@Length(max = 20)
	@NotBlank
	@OpenApiField(desc = "用户名",constraint="用户名",demo="20150619010000072320")
	private String userId;
	
	@Length(max = 32)
	@NotBlank
	@OpenApiField(desc = "签约编号",constraint="签约编号",demo="00000000000000007440")
	private String pactNo;
	
	@NotNull
	@OpenApiField(desc = "金额，单位元,支持两位小数",constraint="金额，单位元,支持两位小数",demo="66.66")
	private Money amount;
	
	@Length(max = 32)
	@NotBlank
	@OpenApiField(desc = "支付密码", security = true,constraint="支付密码",demo="123124")
	private String password;
	
	@OpenApiField(desc = "是否冻结",constraint="是否冻结",demo="false")
	private boolean isFreeze;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPactNo() {
		return this.pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	
	public boolean isFreeze() {
		return isFreeze;
	}
	
	public void setFreeze(boolean isFreeze) {
		this.isFreeze = isFreeze;
	}
	
	/**
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MpayDepositRequest [userId=" + userId + ", pactNo=" + pactNo + ", amount=" + amount + ", password="
				+ password + "]";
	}
}
