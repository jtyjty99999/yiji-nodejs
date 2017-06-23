/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:16:35 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import com.yiji.openapi.message.product.yzz.info.OrderBase;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年8月9日
 */

public class FaSupplierOrder extends OrderBase {
	private static final long serialVersionUID = 1L;
	/**
	 * 供应商ID
	 */
	private String supplierId;
	/**
	 * 供应商名字
	 */
	private String supplierName;
	
	public String getSupplierId() {
		return supplierId;
	}
	
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	
	public String getSupplierName() {
		return supplierName;
	}
	
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	/**
	 * 
	 * @see com.yiji.openapi.message.product.yzz.info.Order#check()
	 */
	public void check() {
	}
}
