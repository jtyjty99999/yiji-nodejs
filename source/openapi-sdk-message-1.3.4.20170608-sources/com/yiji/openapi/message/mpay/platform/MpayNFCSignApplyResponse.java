/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年2月4日 下午2:45:16 创建
 */
package com.yiji.openapi.message.mpay.platform;

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
 * @data 2016年2月4日
 */
@OpenApiMessage(service = "mpayNFCSignApply", type = ApiMessageType.Response)
public class MpayNFCSignApplyResponse extends ApiResponse {
	@NotBlank
	@Length(max = 35)
	@OpenApiField(desc = "签约号", constraint = "银行卡签约号", demo = "Fby3boja002529")
	private String pactNo;
	
	public String getPactNo() {
		return this.pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	
}
