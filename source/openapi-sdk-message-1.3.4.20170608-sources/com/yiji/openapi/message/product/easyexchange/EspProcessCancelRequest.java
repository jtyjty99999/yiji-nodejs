/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-14 15:41 创建
 *
 */
package com.yiji.openapi.message.product.easyexchange;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "espProcessCancel", type = ApiMessageType.Request)
public class EspProcessCancelRequest extends ApiRequest {
	
	/** 订单号 */
	@NotBlank
	@OpenApiField(desc = "订单号", constraint = "订单号")
	private String outOrderNo;
	
	/** 撤销原因 */
	@NotBlank
	@OpenApiField(desc = "撤销原因", constraint = "撤销原因")
	private String cancelReason;
	
	/** 操作员id */
	@OpenApiField(desc = "操作员ID", constraint = "操作员ID")
	private String operatorId;
	
	/** 操作员名字 */
	@OpenApiField(desc = "操作员姓名", constraint = "操作员姓名")
	private String operatorName;
	
	/** 产品编码 **/
	@OpenApiField(desc = "产品编码", constraint = "产品编码")
	private String productCode;
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getCancelReason() {
		return cancelReason;
	}
	
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}
	
	public String getOperatorId() {
		return operatorId;
	}
	
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
	public String getOperatorName() {
		return operatorName;
	}
	
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	
	public String getProductCode() {
		return productCode;
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
}
