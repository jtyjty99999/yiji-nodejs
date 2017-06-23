/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月8日 上午11:05:35 创建
 */
package com.yiji.openapi.message.product.easyexchange;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "applyCrossRemittrance", type = ApiMessageType.Notify)
public class ApplyCrossRemittranceNotify extends ApiNotify {
	@OpenApiField(desc = "易极付订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "汇款状态", constraint = "processing:汇款中,success:汇款成功,fail:汇款失败")
	private String status;
	
	@OpenApiField(desc = "汇款说明信息")
	private String message;
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
}
