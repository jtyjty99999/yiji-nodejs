/*
        * www.yiji.com Inc.
        * Copyright (c) 2014 All Rights Reserved.
        */

/*
* 修订记录：
* wkeduo 下午6:36:39 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "ccpEasySpeedLoanCancel", type = ApiMessageType.Request)
public class CcpEasySpeedLoanCancelRequest extends ApiRequest {

	/** 融资订单CODE */
	@Size(max = 20, message = "融资订单编号长度不能超过20位")
	@OpenApiField(desc = "融资订单CODE", demo = "20150519020005491913")
	private String bizNo;

	/** 调用系统平台ID */
	@NotBlank(message = "调用系统平台ID不能为空")
	@OpenApiField(desc = "调用系统平台ID", demo = "20150519020005491913")
	private String platformId;

	/** 外部流水 */
	@NotBlank(message = "外部流水不能为空")
	@Size(max = 128, message = "外部流水长度不能超过128位")
	@OpenApiField(desc = "外部流水号", demo = "2016012715561007")
	private String outBizNo;

	public String getBizNo() {
		return this.bizNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getPlatformId() {
		return this.platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
