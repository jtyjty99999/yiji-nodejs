/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * dengwei@yiji.com 2015年9月8日 下午7:56:58 创建
 */

package com.yiji.openapi.message.mpay.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 支付台查询绑卡列表结果
 * 
 * @author dengwei@yiji.com
 * 
 */
@OpenApiMessage(service = "mpayDirectTransfer", type = ApiMessageType.Response)
public class DirectTransferResponse extends ApiResponse {
	
	@OpenApiField(desc = "业务交易号", demo = "12345678")
	private String bizNo;
	
	@OpenApiField(desc = "业务状态", demo = "false",constraint="{\"data\":[\"true:成功\",\"false:根据resultCode判断处理中或处理失败\"],\"name\":\"业务处理状态\"}")
	private boolean bizStatus;
	
	public String getBizNo() {
		return this.bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	public boolean isBizStatus() {
		return this.bizStatus;
	}
	
	public void setBizStatus(boolean bizStatus) {
		this.bizStatus = bizStatus;
	}
	
}
