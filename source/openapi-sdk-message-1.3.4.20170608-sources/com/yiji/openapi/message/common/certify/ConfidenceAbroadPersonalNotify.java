/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年12月5日 上午11:04:54 创建
 */
package com.yiji.openapi.message.common.certify;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author xiyang
 *
 */
@Deprecated
@OpenApiMessage(service = "confidenceAbroadPersonal", type = ApiMessageType.Notify)
public class ConfidenceAbroadPersonalNotify extends ApiNotify {
	
	@OpenApiField(desc = "消息")
	private String message;
	
	@OpenApiField(desc = "到期时间")
	private String validityTime;
	
	@OpenApiField(desc = "证件正面图片")
	private String certFrontPath;
	
	@OpenApiField(desc = "证件背面图片")
	private String certBackPath;
	
	@OpenApiField(desc = "状态")
	private String status;
	
	@OpenApiField(desc = "用户ID")
	private String userId;
	
	@OpenApiField(desc = "证件号")
	private String certNo;
	
	@OpenApiField(desc = "真实姓名")
	private String realName;
	
	@OpenApiField(desc = "所属地")
	private String attribution;
	
	@OpenApiField(desc = "用户类型")
	private String userType;
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getValidityTime() {
		return this.validityTime;
	}
	
	public void setValidityTime(String validityTime) {
		this.validityTime = validityTime;
	}
	
	public String getCertFrontPath() {
		return this.certFrontPath;
	}
	
	public void setCertFrontPath(String certFrontPath) {
		this.certFrontPath = certFrontPath;
	}
	
	public String getCertBackPath() {
		return this.certBackPath;
	}
	
	public void setCertBackPath(String certBackPath) {
		this.certBackPath = certBackPath;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCertNo() {
		return this.certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getRealName() {
		return this.realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getAttribution() {
		return this.attribution;
	}
	
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}
	
	public String getUserType() {
		return this.userType;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
