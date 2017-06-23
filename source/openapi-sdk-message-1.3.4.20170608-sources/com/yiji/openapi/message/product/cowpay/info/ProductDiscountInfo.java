/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:41:15 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年8月9日
 */

public class ProductDiscountInfo {
	// 折扣价是否对经销商可见
	private boolean visible = false;
	// 起订量
	private int minOrder;
	// 折扣单价
	private Money price;
	
	public boolean isVisible() {
		return this.visible;
	}
	
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public int getMinOrder() {
		return this.minOrder;
	}
	
	public void setMinOrder(int minOrder) {
		this.minOrder = minOrder;
	}
	
	public Money getPrice() {
		return this.price;
	}
	
	public void setPrice(Money price) {
		this.price = price;
	}
}
