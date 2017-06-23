/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2014-12-15 11:16 创建
 *
 */
package com.yiji.openapi.message.common.withdraw;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yjfWithdraw", type = ApiMessageType.Request)
public class YjfWithdrawRequest extends ApiRequest {
	
	@Length(max = 20, min = 20)
	@NotBlank
	@OpenApiField(desc = "会员ID", constraint = "提现的会员ID",demo = "20140809010000051239")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号",demo = "2345612654")
	private String outOrderNo;
	
	@OpenApiField(desc = "业务类型", constraint = "auto-自动提现 liberty-自主提现 audit-审核提现",demo = "auto")
	private String type = "auto";
	
	@OpenApiField(desc = "请求时间", constraint = "格式为yyyyMMddHHmmss",demo = "19721212151515")
	private String requestTime;
	
	@NotBlank
	@OpenApiField(desc = "登录名",demo = "yijifu")
	private String loginId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getRequestTime() {
		return requestTime;
	}
	
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}
	
	public String getLoginId() {
		return loginId;
	}
	
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
}
