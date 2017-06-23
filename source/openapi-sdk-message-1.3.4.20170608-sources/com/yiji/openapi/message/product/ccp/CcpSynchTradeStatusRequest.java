/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年3月23日 下午3:36:32 创建
 */
package com.yiji.openapi.message.product.ccp;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年3月23日
 */
@OpenApiMessage(service = "ccpSynchTradeStatus", type = ApiMessageType.Request)
public class CcpSynchTradeStatusRequest extends ApiRequest {
	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "20160323022055094794")
	private String outOrderNo;
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "融资订单号", constraint = "融资订单号", demo = "20160323022055094794")
	private String bizNo;
	
	@NotBlank
	@OpenApiField(desc = "状态编码", constraint = "状态编码", demo = "234dsdf")
	private String statusCode;
	
	@NotBlank
	@OpenApiField(desc = "状态描述", constraint = "状态描述", demo = "交易状态")
	private String statusDesc;
	
	@OpenApiField(desc = "处理时间", constraint = "处理时间", demo = "交易状态")
	private String processTime;
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getBizNo() {
		return this.bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	public String getStatusCode() {
		return this.statusCode;
	}
	
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
	public String getStatusDesc() {
		return this.statusDesc;
	}
	
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	
	public String getProcessTime() {
		return this.processTime;
	}
	
	public void setProcessTime(String processTime) {
		this.processTime = processTime;
	}
}
