/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月27日 下午6:21:14 创建
 */
package com.yiji.openapi.message.product.easyexchange;

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
@OpenApiMessage(service = "yhtLogisticInfoUpload", type = ApiMessageType.Request)
public class LogisticInfoUploadRequest extends ApiRequest {
	
	/** 物流机构 */
	@NotBlank
	@OpenApiField
	private String logisticsCompany;
	
	/** 运输单号 */
	@NotBlank
	@OpenApiField
	private String transportNumber;
	
	/** 外部订单号 */
	@NotBlank
	@OpenApiField
	private String outOrderNo;
	
	/** 收货人姓名 */
	@NotBlank
	@OpenApiField
	private String consigneeName;
	
	/** 收货人地址 */
	@NotBlank
	@OpenApiField
	private String consigneeAddress;
	
	/** 收货人联系方式 */
	@NotBlank
	@OpenApiField
	private String consigneeContact;
	
	public String getLogisticsCompany() {
		return this.logisticsCompany;
	}
	
	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}
	
	public String getTransportNumber() {
		return this.transportNumber;
	}
	
	public void setTransportNumber(String transportNumber) {
		this.transportNumber = transportNumber;
	}
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getConsigneeName() {
		return this.consigneeName;
	}
	
	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}
	
	public String getConsigneeAddress() {
		return this.consigneeAddress;
	}
	
	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}
	
	public String getConsigneeContact() {
		return this.consigneeContact;
	}
	
	public void setConsigneeContact(String consigneeContact) {
		this.consigneeContact = consigneeContact;
	}
	
}
