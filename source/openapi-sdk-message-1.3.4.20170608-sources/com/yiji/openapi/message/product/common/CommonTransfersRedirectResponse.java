/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年9月8日 下午1:42:27 创建
 */
package com.yiji.openapi.message.product.common;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 *
 */
@OpenApiMessage(service = "commonTransfersRedirect", type = ApiMessageType.Response)
public class CommonTransfersRedirectResponse extends ApiResponse {
	
	/** 登录名称*/
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "登录名称", constraint = "会员登录名称")
	private String loginName;
	
	/** 请求目标*/
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "请求目标", constraint = "COMMON_TRANSFER 通用转账,COMMON_TRANSFER_BANK 通用汇付")
	private String requestTarget;

    /** 入口编码 */
    @OpenApiField(desc = "入口编码",constraint = "入口编码")
    private String inlet = "01";

	/** 商户卡号 */
	@OpenApiField(desc = "商户卡号", constraint = "商户卡号")
	private String merchantCardNo;

	/** 商户资金账号 */
	@OpenApiField(desc = "商户资金帐号", constraint = "商户资金帐号")
	private String merchantAccountNo;

	/** 商户会员号 */
	@OpenApiField(desc = "商户会员号", constraint = "商户会员号")
	private String merchantUserId;
	
	/** 场景策略 */
	@OpenApiField(desc = "场景策略", constraint = "场景策略")
	private String strategy;
	
	/** 请求时间 */
	@OpenApiField(desc = "请求时间 ", constraint = "请求时间")
	private String requestDate;

	/** 版本号*/
	@OpenApiField(desc = "版本号", constraint = "请求时间")
	private String group;
	
    @OpenApiField(desc = "gid")
    private String gid;
    
	/** 服务码*/
	@OpenApiField(desc = "服务码", constraint = "服务码")
	private String behavior;

	public String getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public String getBehavior() {
		return this.behavior;
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}

	public String getGid() {
		return this.gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getRequestTarget() {
		return this.requestTarget;
	}

	public void setRequestTarget(String requestTarget) {
		this.requestTarget = requestTarget;
	}

	public String getInlet() {
		return this.inlet;
	}

	public void setInlet(String inlet) {
		this.inlet = inlet;
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

	public String getMerchantUserId() {
		return this.merchantUserId;
	}

	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getStrategy() {
		return this.strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

}
