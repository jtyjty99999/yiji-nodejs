/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:14:05 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class ShippingAddressInfo {
	/**
	 * 用户ID
	 */
	public String userId;
	/**
	 * 收货地址
	 */
	public String address;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}

    