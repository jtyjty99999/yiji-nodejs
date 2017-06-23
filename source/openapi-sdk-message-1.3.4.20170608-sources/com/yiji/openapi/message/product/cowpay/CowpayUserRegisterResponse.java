/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-14 14:28 创建
 *
 */
package com.yiji.openapi.message.product.cowpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "cowpayUserRegister", type = ApiMessageType.Response)
public class CowpayUserRegisterResponse extends ApiResponse {
	
	@OpenApiField(desc = "外部用户ID")
	private String externalUserId;
	
	@OpenApiField(desc = "外部流水号")
	private String outOrderNo;
	
	@OpenApiField(desc = "gid")
	private String gid;
	
	public String getExternalUserId() {
		return externalUserId;
	}
	
	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}

}
