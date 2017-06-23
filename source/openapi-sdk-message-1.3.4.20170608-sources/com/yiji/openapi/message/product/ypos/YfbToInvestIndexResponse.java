/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-05-29 11:32 创建
 *
 */
package com.yiji.openapi.message.product.ypos;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "yfbToInvestIndex", type = ApiMessageType.Response)
public class YfbToInvestIndexResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户ID", constraint = "用户登录易极付ID")
	private String userId;
	
	@OpenApiField(desc = "操作员ID", constraint = "易极付操作员ID")
	private String operatorId;
	
	@OpenApiField(desc = "平台标识", constraint = "平台名称的拼音")
	private String platformType;
	
	@OpenApiField(desc = "商户卡号", constraint = "商户卡号")
	private String merchantCardNo;
	
	@OpenApiField(desc = "商户资金账户", constraint = "大数据商户资金账户")
	private String merchantAccNo;
	
	@OpenApiField(desc = "入口编码", constraint = "系统入口编码")
	private String inlet;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getOperatorId() {
		return operatorId;
	}
	
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
	public String getPlatformType() {
		return platformType;
	}
	
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}
	
	public String getMerchantCardNo() {
		return merchantCardNo;
	}
	
	public void setMerchantCardNo(String merchantCardNo) {
		this.merchantCardNo = merchantCardNo;
	}
	
	public String getMerchantAccNo() {
		return merchantAccNo;
	}
	
	public void setMerchantAccNo(String merchantAccNo) {
		this.merchantAccNo = merchantAccNo;
	}
	
	public String getInlet() {
		return inlet;
	}
	
	public void setInlet(String inlet) {
		this.inlet = inlet;
	}

}
