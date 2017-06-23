/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-08-26 14:02 创建
 *
 */
package com.yiji.openapi.message.product.invest;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "investEntry", type = ApiMessageType.Response)
public class InvestEntryResponse extends ApiResponse {
	
	@OpenApiField(desc = "平台标识", constraint = "平台名称的拼音(理财平台定义)")
	private String platformType;
	
	@OpenApiField(desc = "购买类型")
	private String buyType;
	
	@OpenApiField(desc = "用户ID", constraint = "易极付登陆ID")
	private String userId;
	
	@OpenApiField(desc = "操作员ID")
	private String operatorId;
	
	@OpenApiField(desc = "入口编码")
	private String inlet;
	
	@OpenApiField(desc = "系统时间")
	private String systemTime;
	
	@OpenApiField(desc = "gid")
	private String gid;
	
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
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getOperatorId() {
		return operatorId;
	}
	
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
	public String getInlet() {
		return inlet;
	}
	
	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
	
	public String getSystemTime() {
		return systemTime;
	}
	
	public void setSystemTime(String systemTime) {
		this.systemTime = systemTime;
	}
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getDeviceType() {
		return this.deviceType;
	}
	
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	

}
