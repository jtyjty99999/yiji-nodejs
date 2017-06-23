/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-05 10:25 创建
 *
 */
package com.yiji.openapi.message.common.core;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "grRemittance", type = ApiMessageType.Request)
public class GrRemittanceRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 32, min = 1)
	@OpenApiField(desc = "商户订单号")
	private String outOrderNo;
	
	@NotBlank
	@OpenApiField(desc = "产品编码")
	private String productCode;
	
	@NotBlank
	@OpenApiField(desc = "子产品编码")
	private String subProductCode;
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "用户ID")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "汇付绑卡ID")
	private String cardId;
	
	@NotNull
	@OpenApiField(desc = "汇付金额")
	private Money remittanceAmount;
	
	@NotNull
	@OpenApiField(desc = "到账时间")
	private String arriveTime;
	
	@OpenApiField(desc = "到账是否通知")
	private Boolean notice = Boolean.FALSE;
	
	@OpenApiField(desc = "通知手机号")
	private String mobile;
	
	@Length(max = 30)
	@OpenApiField(desc = "备注")
	private String note;
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getProductCode() {
		return productCode;
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public String getSubProductCode() {
		return subProductCode;
	}
	
	public void setSubProductCode(String subProductCode) {
		this.subProductCode = subProductCode;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCardId() {
		return cardId;
	}
	
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	
	public Money getRemittanceAmount() {
		return remittanceAmount;
	}
	
	public void setRemittanceAmount(Money remittanceAmount) {
		this.remittanceAmount = remittanceAmount;
	}
	
	public String getArriveTime() {
		return arriveTime;
	}
	
	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}
	
	public Boolean getNotice() {
		return notice;
	}
	
	public void setNotice(Boolean notice) {
		this.notice = notice;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
}
