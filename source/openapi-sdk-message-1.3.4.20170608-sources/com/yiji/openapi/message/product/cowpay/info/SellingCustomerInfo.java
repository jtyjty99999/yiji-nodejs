/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:12:38 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class SellingCustomerInfo {
	/**
	 * 联系人
	 */
	private String customerName;
	
	/**
	 * 手机号
	 */
	private String cellPhoneNumber;
	
	/**
	 * 座机号
	 */
	private String homePhoneNumber;
	
	/**
	 * 送货地址
	 */
	private String deliveryAddress;
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}
	
	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}
	
	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}
	
	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}
	
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
}

    