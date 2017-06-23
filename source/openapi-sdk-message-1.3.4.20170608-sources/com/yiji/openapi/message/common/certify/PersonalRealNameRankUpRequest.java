/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-09 10:31 创建
 *
 */
package com.yiji.openapi.message.common.certify;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "personalRealNameRankUp", type = ApiMessageType.Request)
public class PersonalRealNameRankUpRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户ID",demo = "12345679801236457980")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "本人持证头部照片",demo = "http://www.yiji.com/1.jpg")
	private String holdCertPic;
	
	@OpenApiField(desc = "本人上半身照片",demo = "http://www.yiji.com/1.jpg")
	private String halfBodyPic;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getHoldCertPic() {
		return holdCertPic;
	}
	
	public void setHoldCertPic(String holdCertPic) {
		this.holdCertPic = holdCertPic;
	}
	
	public String getHalfBodyPic() {
		return halfBodyPic;
	}
	
	public void setHalfBodyPic(String halfBodyPic) {
		this.halfBodyPic = halfBodyPic;
	}
}
