/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午2:53:24 创建
*/

package com.yiji.openapi.message.common.oldtonew;

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
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "yzzAccountUnfreeze", type = ApiMessageType.Request)
public class YzzAccountUnfreezeRequest extends ApiRequest {

	@NotBlank
	@OpenApiField(desc = "易极付用户ID", demo = "20150519020005491913")
	private String userId;

	@NotNull
	@OpenApiField(desc = "冻结金额", demo = "1.11")
	private Money freezeAmount;

	@OpenApiField(desc = "冻结余额类型", constraint = "易八专用字段", demo = "YZZ_GUARANTEE_FREEZE")
	private String freezeType;

	@OpenApiField(desc = "外部订单号", demo = "20150519020005491913")
	private String outBizNo;

	@NotBlank
	@Length(max = 256)
	@OpenApiField(desc = "备注", demo = "备注")
	private String memo;

	@OpenApiField(desc = "账户号", demo = "20150519020005491913")
	private String accountNo;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Money getFreezeAmount() {
		return this.freezeAmount;
	}

	public void setFreezeAmount(Money freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getFreezeType() {
		return this.freezeType;
	}

	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

}
