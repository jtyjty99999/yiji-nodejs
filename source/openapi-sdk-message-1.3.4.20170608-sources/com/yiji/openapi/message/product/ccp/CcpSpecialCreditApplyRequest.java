/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年3月23日 下午1:57:28 创建
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
@OpenApiMessage(service = "ccpSpecialCreditApply", type = ApiMessageType.Request)
public class CcpSpecialCreditApplyRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "20160323022055094794")
	private String outOrderNo;
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "融资订单号", constraint = "融资订单号", demo = "20160323022055094794")
	private String bizNo;
	
	@NotBlank
	@Length(max = 256)
	@OpenApiField(desc = "特批申明", constraint = "特批申明", demo = "该单子经过调查复核放款条件，一切风险由我方承担，请予以批准。")
	private String statement;
	
	@NotBlank
	@OpenApiField(desc = "发送时间", constraint = "发送时间", demo = "2016-03-14 16:03:22")
	private String sendTime;
	
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
	
	public String getStatement() {
		return this.statement;
	}
	
	public void setStatement(String statement) {
		this.statement = statement;
	}
	
	public String getSendTime() {
		return this.sendTime;
	}
	
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
}
