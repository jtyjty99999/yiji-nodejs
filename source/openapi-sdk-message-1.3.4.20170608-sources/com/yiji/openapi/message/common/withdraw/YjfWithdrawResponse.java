/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2014-12-15 13:53 创建
 *
 */
package com.yiji.openapi.message.common.withdraw;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yjfWithdraw", type = ApiMessageType.Response)
public class YjfWithdrawResponse extends ApiResponse {
	
	@OpenApiField(desc = "会员ID", constraint = "提现的会员ID")
	private String userId;
	
	@OpenApiField(desc = "业务类型", constraint = "auto-自动提现 liberty-自主提现 audit-审核提现")
	private String type;
	
	@OpenApiField(desc = "请求时间", constraint = "格式为yyyyMMddHHmmss")
	private String requestTime;
	
	@OpenApiField(desc = "操作员ID")
	private String loginId;
	
	@OpenApiField(desc = "业务子产品编码")
	private String subBizCode;
	
	@OpenApiField(desc = "入口")
	private String inlet;
	
	@OpenApiField(desc = "资金卡号")
	private String merchantCardNo;
	
	@OpenApiField(desc = "资金帐号")
	private String merchantAccountNo;
	
	@OpenApiField(desc = "异步通知地址")
	private String notifyUrl;
	
	@OpenApiField(desc = "gid")
	private String gid;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getNotifyUrl() {
		return notifyUrl;
	}
	
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	
	public String getLoginId() {
		return loginId;
	}
	
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	public String getSubBizCode() {
		return subBizCode;
	}
	
	public void setSubBizCode(String subBizCode) {
		this.subBizCode = subBizCode;
	}
	
	public String getInlet() {
		return inlet;
	}
	
	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
	
	public String getMerchantCardNo() {
		return merchantCardNo;
	}
	
	public void setMerchantCardNo(String merchantCardNo) {
		this.merchantCardNo = merchantCardNo;
	}
	
	public String getMerchantAccountNo() {
		return merchantAccountNo;
	}
	
	public void setMerchantAccountNo(String merchantAccountNo) {
		this.merchantAccountNo = merchantAccountNo;
	}
	
	public String getRequestTime() {
		return requestTime;
	}
	
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
}
