/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月8日 下午2:08:37 创建
 */
package com.yiji.openapi.message.product.common;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2015年12月8日
 */
@OpenApiMessage(service = "commonRedirectToWithdrawal", type = ApiMessageType.Request)
public class CommonRedirectToWithdrawalRequest extends ApiRequest {
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "20140821010000051558")
	private String outOrderNo;
	
	@OpenApiField(desc = "登陆名", constraint = "loginName和userid至少传一个，如果两个都传，则以userid为准", demo = "admin")
	private String loginName;
	
	@Length(max = 20)
	@OpenApiField(desc = "会员ID", constraint = "loginName和userid至少传一个，如果两个都传，则以userid为准", demo = "20140821010000051558")
	private String userId;
	
	@OpenApiField(desc = "定向用户银行卡号", constraint = "如需要指定提现卡号，则需要填写", demo = "6210322214872574")
	private String bankNo;
	
	@OpenApiField(desc = "定向用户银行编号", constraint = "如需要指定提现卡号，则需要填写", demo = "ABC")
	private String bankCode;
	
	@OpenApiField(desc = "自定义收费扩展字段", constraint = "如果需要自定义特殊收费，则需要传入此参数", demo = "1")
	private String changeExtends;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBankNo() {
		return this.bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getChangeExtends() {
		return this.changeExtends;
	}

	public void setChangeExtends(String changeExtends) {
		this.changeExtends = changeExtends;
	}
}
