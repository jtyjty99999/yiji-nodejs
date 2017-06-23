/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月23日 下午1:44:23 创建
 */
package com.yiji.openapi.message.common.oldtonew.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月23日
 */

public class TradeQueryOrderNoData {
	@OpenApiField(desc="用户ID",constraint="用户ID",demo="20150519020005491913")
	private String orderNo;
	
	@OpenApiField(desc="用户ID",constraint="用户ID",demo="20150519020005491913")
	private String success;
	
	@OpenApiField(desc="用户ID",constraint="用户ID",demo="20150519020005491913")
	private String signType;
	
	@OpenApiField(desc="用户ID",constraint="用户ID",demo="20150519020005491913")
	private String channelId;
	
	@OpenApiField(desc="业务参数",constraint="业务参数")
	private TradeQueryOrderNoHashMap hashMap;

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getSignType() {
		return this.signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public TradeQueryOrderNoHashMap getHashMap() {
		return this.hashMap;
	}

	public void setHashMap(TradeQueryOrderNoHashMap hashMap) {
		this.hashMap = hashMap;
	}
}

    