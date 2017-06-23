/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-07 11:32 创建
 *
 */
package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "signmanybank", type = ApiMessageType.Response)
public class SignmanybankResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户ID")
	private String userId;
	
	@OpenApiField(desc = "真实姓名")
	private String realName;
	
	@OpenApiField(desc = "身份证号")
	private String certNo;
	
	@OpenApiField(desc = "gid")
	private String gid;
	
	@OpenApiField(desc = "用户ID")
	private String purpose = "DEDUCT";
	
	@OpenApiField(desc = "银行编号")
	private String bankCode;
	
	@OpenApiField(desc = "银行卡号")
	private String cardNo;
	
	@OpenApiField(desc = "入口编码")
	private String inlet = "01";
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getPurpose() {
		return purpose;
	}
	
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getInlet() {
		return inlet;
	}
	
	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
}
