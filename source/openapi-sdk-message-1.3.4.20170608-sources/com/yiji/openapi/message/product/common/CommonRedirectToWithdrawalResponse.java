/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月8日 下午2:09:03 创建
 */
package com.yiji.openapi.message.product.common;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月8日
 */
@OpenApiMessage(service = "commonRedirectToWithdrawal", type = ApiMessageType.Response)
public class CommonRedirectToWithdrawalResponse extends ApiResponse{

	@OpenApiField(desc = "gid", constraint = "gid", demo = "H0000000507852015120813010343900000")
	private String gid;
	
	@OpenApiField(desc = "登陆名", constraint = "登陆名", demo = "admin")
	private String loginName;
	
	@Length(max = 20)
	@OpenApiField(desc = "会员ID", constraint = "会员ID", demo = "20140821010000051558")
	private String userId;

	@OpenApiField(desc = "定向用户银行卡号", constraint = "如需要指定提现卡号，则需要填写", demo = "6210322214872574")
	private String bankNo;
	
	@OpenApiField(desc = "定向用户银行编号", constraint = "如需要指定提现卡号，则需要填写", demo = "ABC")
	private String bankCode;
	
	@OpenApiField(desc = "自定义收费扩展字段", constraint = "如果需要自定义特殊收费，则需要传入此参数", demo = "1")
	private String changeExtends;
	
	@OpenApiField(desc = "商户卡号", constraint = "商户卡号", demo = "20141229020000062199")
	private String merchantUserId;
	
	@OpenApiField(desc = "商户用户号", constraint = "商户用户号", demo = "20141229020000062199")
	private String merchantCardNo;
	
	@OpenApiField(desc = "商户资金账号", constraint = "商户资金账号", demo = "1")
	private String merchantAccountNo;
	
	@OpenApiField(desc = "入口", constraint = "入口", demo = "01")
	private String inlet = "01";
	
	@OpenApiField(desc = "策略", constraint = "策略", demo = "6210322214872574")
	private String strategy;
	
	@OpenApiField(desc = "行为", constraint = "行为", demo = "commonRedirectToWithdrawal")
	private String behavior;
	
	@OpenApiField(desc = "group", constraint = "group", demo = "ABC")
	private String group;
	
	@OpenApiField(desc = "请求对象", constraint = "请求对象", demo = "COMMON_WITHDRAW")
	private String requestTarget = "COMMON_WITHDRAW";
	
	@OpenApiField(desc = "请求时间", constraint = "请求时间(yyyyMMddHHmmss)", demo = "20151208162122")
	private String requestDate;
	
	public String getRequestTarget() {
		return this.requestTarget;
	}

	public void setRequestTarget(String requestTarget) {
		this.requestTarget = requestTarget;
	}

	public String getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public String getGid() {
		return this.gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
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

	public String getMerchantUserId() {
		return this.merchantUserId;
	}

	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getMerchantCardNo() {
		return this.merchantCardNo;
	}

	public void setMerchantCardNo(String merchantCardNo) {
		this.merchantCardNo = merchantCardNo;
	}

	public String getMerchantAccountNo() {
		return this.merchantAccountNo;
	}

	public void setMerchantAccountNo(String merchantAccountNo) {
		this.merchantAccountNo = merchantAccountNo;
	}

	public String getInlet() {
		return this.inlet;
	}

	public void setInlet(String inlet) {
		this.inlet = inlet;
	}

	public String getStrategy() {
		return this.strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public String getBehavior() {
		return this.behavior;
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
}

    