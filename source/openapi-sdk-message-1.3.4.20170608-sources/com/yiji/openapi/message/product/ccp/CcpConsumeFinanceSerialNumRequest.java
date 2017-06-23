/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年8月25日 下午4:31:38 创建
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
@OpenApiMessage(service = "ccpConsumeFinanceSerialNum", type = ApiMessageType.Request)
public class CcpConsumeFinanceSerialNumRequest extends ApiRequest {

	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "订单号", constraint = "融资订单号")
	private String bizNo;

	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "商品串号", constraint = "商品串号")
	private String serialNum;

	@NotBlank
	@OpenApiField(desc = "交接类型", constraint = "物流交接类型")
	private String deliverType;

	@Length(max = 128)
	@OpenApiField(desc = "物流单号", constraint = "物流单号")
	private String logisticsNum;

	@Length(max = 64)
	@OpenApiField(desc = "物流公司名称", constraint = "物流公司名称")
	private String logisticsCompanyName;

	@Length(max = 32)
	@OpenApiField(desc = "接收人姓名", constraint = "接收人姓名")
	private String reciverName;

	@Length(max = 32)
	@OpenApiField(desc = "接收人联系电话", constraint = "接收人联系电话")
	private String reciverTel;

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

	public String getSerialNum() {
		return this.serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getDeliverType() {
		return this.deliverType;
	}

	public void setDeliverType(String deliverType) {
		this.deliverType = deliverType;
	}

	public String getLogisticsNum() {
		return this.logisticsNum;
	}

	public void setLogisticsNum(String logisticsNum) {
		this.logisticsNum = logisticsNum;
	}

	public String getLogisticsCompanyName() {
		return this.logisticsCompanyName;
	}

	public void setLogisticsCompanyName(String logisticsCompanyName) {
		this.logisticsCompanyName = logisticsCompanyName;
	}

	public String getReciverName() {
		return this.reciverName;
	}

	public void setReciverName(String reciverName) {
		this.reciverName = reciverName;
	}

	public String getReciverTel() {
		return this.reciverTel;
	}

	public void setReciverTel(String reciverTel) {
		this.reciverTel = reciverTel;
	}

	public List<AttachmentInfoDto> getAtts() {
		return this.atts;
	}

	public void setAtts(List<AttachmentInfoDto> atts) {
		this.atts = atts;
	}

}
