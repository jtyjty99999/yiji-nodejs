/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-08-26 14:01 创建
 *
 */
package com.yiji.openapi.message.product.invest;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "investEntry", type = ApiMessageType.Request)
public class InvestEntryRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "平台标识", constraint = "平台名称的拼音(理财平台定义)", demo = "YiJieHui")
	private String platformType;
	
	@NotBlank
	@OpenApiField(desc = "购买类型", constraint = "{\"data\":[\"FUND:升财宝基金\",\"P2P:理财平台\"],\"name\":\"购买类型\"}",
			demo = "FUND")
	private String buyType;
	
	@NotBlank
	@OpenApiField(desc = "用户ID", constraint = "易极付登陆ID", demo = "20151225300119724479")
	private String userId;
	
	@OpenApiField(desc = "操作员ID", constraint = "操作员ID", demo = "20151225300119724479")
	private String operatorId;
	
	@Length(max = 35)
	@OpenApiField(desc = "设备类型", constraint = "{\"data\":[\"MOBILE:移动端\",\"PC:PC端\"],\"name\":\"设备类型\"}",
			demo = "MOBILE")
	private String deviceType;
	
	public String getPlatformType() {
		return platformType;
	}
	
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}
	
	public String getBuyType() {
		return buyType;
	}
	
	public void setBuyType(String buyType) {
		this.buyType = buyType;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getOperatorId() {
		return operatorId;
	}
	
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getDeviceType() {
		return this.deviceType;
	}
	
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
}
