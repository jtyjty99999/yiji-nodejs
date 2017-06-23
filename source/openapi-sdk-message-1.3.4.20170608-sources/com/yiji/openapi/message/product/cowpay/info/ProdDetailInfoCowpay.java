/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月11日 上午9:33:53 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import java.util.List;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年8月11日
 */

public class ProdDetailInfoCowpay {
	// 商品编号(唯一的)
	private String productCode;
	// 商品名称
	private String productName;
	// 商品图片地址
	private String imageUrl;
	// 商品单价
	private Money unitPrice;
	// 商品状态
	private String productStatus;
	// 商品规格
	private List<SpeciValueInfo> speciValues;
	
	public String getProductCode() {
		return this.productCode;
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getImageUrl() {
		return this.imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public Money getUnitPrice() {
		return this.unitPrice;
	}
	
	public void setUnitPrice(Money unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public String getProductStatus() {
		return this.productStatus;
	}
	
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	
	public List<SpeciValueInfo> getSpeciValues() {
		return this.speciValues;
	}
	
	public void setSpeciValues(List<SpeciValueInfo> speciValues) {
		this.speciValues = speciValues;
	}
}
