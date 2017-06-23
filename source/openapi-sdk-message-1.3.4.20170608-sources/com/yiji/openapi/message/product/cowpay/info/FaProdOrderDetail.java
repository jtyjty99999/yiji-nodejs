/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午2:59:59 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年8月9日
 */

public class FaProdOrderDetail implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * 商品编号
	 */
	@NotNull(message = "商品编号不能为空")
	private String productCode;
	/**
	 * 商品数量
	 */
	@Min(value = 1, message = "商品数量不能小于1")
	private Long quantity;
	
	public String getProductCode() {
		return productCode;
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public Long getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
}
