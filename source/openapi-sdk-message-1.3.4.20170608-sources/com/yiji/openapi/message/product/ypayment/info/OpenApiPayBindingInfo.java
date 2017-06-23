/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年4月29日 下午2:37:57 创建
 */
package com.yiji.openapi.message.product.ypayment.info;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年4月29日
 */
public class OpenApiPayBindingInfo {
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "易极付用户ID", constraint = "易极付用户ID", demo = "20130310bj5815689758")
	private String userId;
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "缴费签约号", constraint = "缴费签约号", demo = "20130310bj5815689758")
	private String contractNo;
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "资源代码", constraint = "资源代码", demo = "SOKD32")
	private String resourceCode;
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "资源名称", constraint = "资源名称", demo = "水电费")
	private String resourceName;
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "用户卡号", constraint = "用户卡号", demo = "wewr3")
	private String userCode;
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "用户名", constraint = "用户名", demo = "张三")
	private String userName;
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "缴费类型", constraint = "缴费类型", demo = "WATER")
	private String paymentType;
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "缴费来源", constraint = "缴费来源", demo = "a323e")
	private String payFrom;
	
	@Length(max = 35)
	@OpenApiField(desc = "备注", constraint = "备注", demo = "水电气卡")
	private String memo;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getContractNo() {
		return this.contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getResourceCode() {
		return this.resourceCode;
	}
	
	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
	}
	
	public String getResourceName() {
		return this.resourceName;
	}
	
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
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
	
	public String getPaymentType() {
		return this.paymentType;
	}
	
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	public String getPayFrom() {
		return this.payFrom;
	}
	
	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
