/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:37:15 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class ProductOverviewInfo {
	// 商品基础对象的物理ID
		private Integer id;
		// 所属分类
		private ProductClassify classify;
		// 商品基础编码
		private String productbasicCode;
		// 商品图片地址
		private String imageUrl;
		// 商品名称
		private String productName;
		// 商品描述
		private String productDesc;
		// 最低价格
		private Money lowestPrice;
		// 最高价格
		private Money highestPrice;
		// 销售单位
		private String saleUnit;
		
		public Integer getId() {
			return this.id;
		}
		
		public void setId(Integer id) {
			this.id = id;
		}
		
		public ProductClassify getClassify() {
			return this.classify;
		}
		
		public void setClassify(ProductClassify classify) {
			this.classify = classify;
		}
		
		public String getProductbasicCode() {
			return this.productbasicCode;
		}
		
		public void setProductbasicCode(String productbasicCode) {
			this.productbasicCode = productbasicCode;
		}
		
		public String getImageUrl() {
			return this.imageUrl;
		}
		
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
		
		public String getProductName() {
			return this.productName;
		}
		
		public void setProductName(String productName) {
			this.productName = productName;
		}
		
		public String getProductDesc() {
			return this.productDesc;
		}
		
		public void setProductDesc(String productDesc) {
			this.productDesc = productDesc;
		}
		
		public Money getLowestPrice() {
			return this.lowestPrice;
		}
		
		public void setLowestPrice(Money lowestPrice) {
			this.lowestPrice = lowestPrice;
		}
		
		public Money getHighestPrice() {
			return this.highestPrice;
		}
		
		public void setHighestPrice(Money highestPrice) {
			this.highestPrice = highestPrice;
		}
		
		public String getSaleUnit() {
			return this.saleUnit;
		}
		
		public void setSaleUnit(String saleUnit) {
			this.saleUnit = saleUnit;
		}
}

    