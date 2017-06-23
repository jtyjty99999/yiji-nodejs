/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * @author xinqing@yiji.com 下午3:45:08 创建
 */
package com.yiji.openapi.message.mpay.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * 
 * 
 * 
 * @author "senlin@yiji.com"
 * 
 */
@OpenApiMessage(service = "mpayDirectTransfer", type = ApiMessageType.Notify)
public class DirectTransferNotify extends ApiNotify {
	
	@OpenApiField(desc = "业务交易号", demo = "12345678")
	private String bizNo;
	
	@OpenApiField(desc = "业务状态", demo = "false")
	private boolean bizStatus;
	
	@OpenApiField(desc = "商户订单号", demo = "14556680575")
	private String merchantOrderNo;
	
	public String getBizNo() {
		return this.bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	public boolean isBizStatus() {
		return this.bizStatus;
	}
	
	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public void setBizStatus(boolean bizStatus) {
		this.bizStatus = bizStatus;
	}
	
}
