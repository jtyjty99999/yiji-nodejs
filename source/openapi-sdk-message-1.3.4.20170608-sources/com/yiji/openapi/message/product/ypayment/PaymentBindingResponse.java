/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年4月29日 下午5:02:13 创建
 */
package com.yiji.openapi.message.product.ypayment;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年4月29日
 */
@OpenApiMessage(service = "paymentBinding", type = ApiMessageType.Response)
public class PaymentBindingResponse extends ApiResponse {
	@NotBlank
	@OpenApiField(desc = "绑卡签约号", constraint = "绑卡签约号", demo = "234234234")
	private String contractNo;
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "易极付用户ID", constraint = "易极付用户ID", demo = "20130310bj5815689758")
	private String userId;
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "用户卡号", constraint = "用户卡号", demo = "20130310bj5815689758")
	private String userCode;
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "用户名", constraint = "用户名", demo = "admin")
	private String userName;
	
	@NotBlank
	@OpenApiField(desc = "状态", constraint = "状态", demo = "VALID")
	private String bindingStatus;
	
	public String getContractNo() {
		return this.contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserCode() {
		return this.userCode;
	}
	
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getBindingStatus() {
		return this.bindingStatus;
	}
	
	public void setBindingStatus(String bindingStatus) {
		this.bindingStatus = bindingStatus;
	}
}
