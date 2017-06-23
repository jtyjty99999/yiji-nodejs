/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:13:20 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class SellingTradeOrderDetailInfo {
	/**
	 * 供应商ID
	 */
	private String ownerId;
	
	/**
	 * 商品编号
	 */
	private String productCode;
	
	/**
	 * 商品名称
	 */
	private String productName;
	
	/**
	 * 商品规格
	 */
	private String specification;
	
	/**
	 * 商品图片
	 */
	private String productPicUrl;
	
	/**
	 * 商品销售单位
	 */
	private String saleUnit;
	
	/**
	 * 商品单价
	 */
	private Money unitPrice;
	
	/**
	 * 商品数量
	 */
	private Long quantity;
	
	/**
	 * 商品金额
	 */
	private Money amount;
	
	public String getOwnerId() {
		return ownerId;
	}
	
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	public String getProductCode() {
		return productCode;
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getSpecification() {
		return specification;
	}
	
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	
	public String getProductPicUrl() {
		return productPicUrl;
	}
	
	public void setProductPicUrl(String productPicUrl) {
		this.productPicUrl = productPicUrl;
	}
	
	public String getSaleUnit() {
		return saleUnit;
	}
	
	public void setSaleUnit(String saleUnit) {
		this.saleUnit = saleUnit;
	}
	
	public Money getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(Money unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public Long getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
}

    