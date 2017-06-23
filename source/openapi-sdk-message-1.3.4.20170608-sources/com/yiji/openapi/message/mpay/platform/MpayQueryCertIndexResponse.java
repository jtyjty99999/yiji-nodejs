/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年2月4日 下午5:21:25 创建
 */
package com.yiji.openapi.message.mpay.platform;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年2月4日
 */
@OpenApiMessage(service = "mpayQueryCertIndex", type = ApiMessageType.Response)
public class MpayQueryCertIndexResponse extends ApiResponse {
	
	@Length(max = 18)
	@OpenApiField(desc = "身份证号", constraint = "Mask的身份证号", demo = "50022118710232310")
	private String certNo;
	
	@Length(max = 32)
	@OpenApiField(desc = "身份证md5值", constraint = "身份证号md5值", demo = "sdfsd435srf23434r2w3r")
	private String certIndex;
	
	public String getCertNo() {
		return this.certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCertIndex() {
		return this.certIndex;
	}
	
	public void setCertIndex(String certIndex) {
		this.certIndex = certIndex;
	}
	
}
