/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * husheng@yiji.com 2014年8月8日 上午10:22:36创建
 */
package com.yiji.openapi.message.common.certify;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 
 * 
 * @author husheng@yiji.com
 * 
 */
@Deprecated
@OpenApiMessage(service = "queryRealNameStatusByNameAndID", type = ApiMessageType.Request)
public class QueryRealNameStatusByNameAndIDRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "真实姓名", constraint = "真实姓名",demo = "易极付")
	private String realName;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "身份证号", constraint = "身份证号",demo = "123465978012345678")
	private String certNo;
	
	public String getRealName() {
		return this.realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getCertNo() {
		return this.certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
}
