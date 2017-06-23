/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年8月25日 下午3:24:53 创建
 */
package com.yiji.openapi.message.product.ccp;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.ccp.info.AttachmentInfoDto;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "ccpConsumeFinanceAgreement", type = ApiMessageType.Request)
public class CcpConsumeFinanceAgreementRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "订单号", constraint = "融资订单号")
	private String bizNo;
	
	@NotBlank
	@Length(max = 10)
	@OpenApiField(desc = "合同生效日期", constraint = "日期格式为yyyy-MM-dd")
	private String startDate;
	
	@NotNull
	@OpenApiField(desc = "附件信息", constraint = "详见AttachmentInfo结构定义”。")
	@Valid
	private List<AttachmentInfoDto> atts;
	
	public String getBizNo() {
		return this.bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	public String getStartDate() {
		return this.startDate;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public List<AttachmentInfoDto> getAtts() {
		return this.atts;
	}
	
	public void setAtts(List<AttachmentInfoDto> atts) {
		this.atts = atts;
	}
	
}
