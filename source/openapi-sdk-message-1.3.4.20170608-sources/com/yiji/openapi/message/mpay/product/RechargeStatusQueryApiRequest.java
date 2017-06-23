/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年10月31日 下午2:00:01 创建
 */
package com.yiji.openapi.message.mpay.product;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author lvchen@yiji.com
 *
 */
@OpenApiMessage(service = "rechargeStatusQuery", type = ApiMessageType.Request)
public class RechargeStatusQueryApiRequest extends ApiRequest {
	
	@NotBlank(message = "话费充值外部流水号不能为空")
	@OpenApiField(desc = "话费充值外部流水号", constraint = "调用话费充值服务时传入的外部流水号",demo = "12345678901234567890")
	@Size(min = 16, max = 40)
	private String outOrderNo;
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
}
