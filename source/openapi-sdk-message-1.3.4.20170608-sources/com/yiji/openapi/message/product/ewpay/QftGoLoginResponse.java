/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * @author xinqing@yiji.com 下午6:54:41 创建
 */
package com.yiji.openapi.message.product.ewpay;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "qftGoLogin", type = ApiMessageType.Response)
public class QftGoLoginResponse extends ApiResponse {
	@OpenApiField(desc = "用户ID", demo = "xyx03399")
	private String partnerShopId;
	
	@OpenApiField(desc = "客户端类型", demo = "PC")
	private String clientType;
	
	@OpenApiField(desc = "gid", demo = "20150122020000063895")
	private String gid;
	
	@OpenApiField(desc = "是否显示抬头", constraint = "{\"data\":[\"YES:显示\",\"NO:不显示\"],\"name\":\"是否显示抬头\"}", demo = "YES")
	private String display;

	@OpenApiField(desc = "跳转企富通路径", demo = "RECHARGE", constraint = "{\"data\":\"INDEX:首页\",\"INVEST:我要理财\", \"REPORT:报表中心\",\"RECHARGE:我要充值\", \"WITHDRAW:我要提现\",\"SECURITY:安全中心\",\"MANAGE:商户管理\",\"ERROR:错误页面\"}")
	private String qftPathEnum;

	@OpenApiField(desc = "请求时间" ,demo = "20160232143022")
	private Date requestDate=new Date();

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	
	public String getPartnerShopId() {
		return this.partnerShopId;
	}
	
	public void setPartnerShopId(String partnerShopId) {
		this.partnerShopId = partnerShopId;
	}
	
	public String getClientType() {
		return this.clientType;
	}
	
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	
	public String getGid() {
		return this.gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getQftPathEnum() {
		return qftPathEnum;
	}

	public void setQftPathEnum(String qftPathEnum) {
		this.qftPathEnum = qftPathEnum;
	}
}
