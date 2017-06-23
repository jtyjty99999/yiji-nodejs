/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年8月26日 下午5:17:05 创建
 */
package com.yiji.openapi.message.product.ccp;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author mayansen
 * @date 20140826
 *
 */
@OpenApiMessage(service = "ccpConsumeFinanceApply", type = ApiMessageType.Response)
public class CcpConsumeFinanceApplyResponse extends ApiResponse {
	
	@Length(max = 20)
	@OpenApiField(desc = "融资订单号")
	private String bizNo;
	
	/**
	 * 
	 */
	public CcpConsumeFinanceApplyResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param bizNo
	 */
	public CcpConsumeFinanceApplyResponse(String bizNo) {
		super();
		this.bizNo = bizNo;
	}
	
	/**
	 * @return the bizNo
	 */
	public String getBizNo() {
		return bizNo;
	}
	
	/**
	 * @param bizNo the bizNo to set
	 */
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
}
