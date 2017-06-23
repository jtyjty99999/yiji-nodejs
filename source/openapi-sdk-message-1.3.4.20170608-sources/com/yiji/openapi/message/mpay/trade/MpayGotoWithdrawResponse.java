/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-28 17:08 创建
 *
 */
package com.yiji.openapi.message.mpay.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "mpayGotoWithdraw", type = ApiMessageType.Response)
public class MpayGotoWithdrawResponse extends ApiResponse {
	
	@OpenApiField(desc = "gid", constraint = "gid")
	private String gid;
	
	@OpenApiField(desc = "业务订单号", constraint = "业务订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "用户ID", constraint = "用户ID")
	private String userId;
	
	@OpenApiField(desc = "是否显示导航条", constraint = "1:显示，0:不显示")
	private String title;
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
