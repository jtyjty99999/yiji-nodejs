/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-04 14:09 创建
 *
 */
package com.yiji.openapi.message.common.core;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "queryGrCards", type = ApiMessageType.Request)
public class QueryGrCardsRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户ID")
	private String userId;
	
	@OpenApiField(desc = "卡号")
	private String cardNo;
	
	@NotBlank
	@OpenApiField(desc = "产品编码")
	private String productCode;
	
	@NotBlank
	@OpenApiField(desc = "子产品编码")
	private String subProductCode;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
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
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
}
