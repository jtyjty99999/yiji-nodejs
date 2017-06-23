/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:52:41 创建
 */
package com.yiji.openapi.message.product.easyexchange.infos;

import javax.validation.constraints.Size;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年8月9日
 */

public class WkGoodsInfo {
	/** 货号 */
	@Size(max = 60, message = "货号长度不能超过60位")
	private String goodsNumber;
	
	/** 货品名称 */
	@Size(max = 255, message = "商户名称长度不能超过255位！")
	private String goodsName;
	
	/** 商品分类 */
	@Size(max = 50, message = "商品分类长度不能超过50位！")
	private String itemSharpProductCode;
	
	/** 商品单价 */
	@Size(max = 15, message = "商品单价长度不能超过15位！")
	private String itemSharpUnitPrice;
	
	/** 货品数量 */
	private Integer goodsCount;
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public String getGoodsNumber() {
		return goodsNumber;
	}
	
	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	
	public String getItemSharpProductCode() {
		return itemSharpProductCode;
	}
	
	public void setItemSharpProductCode(String itemSharpProductCode) {
		this.itemSharpProductCode = itemSharpProductCode;
	}
	
	public String getItemSharpUnitPrice() {
		return itemSharpUnitPrice;
	}
	
	public void setItemSharpUnitPrice(String itemSharpUnitPrice) {
		this.itemSharpUnitPrice = itemSharpUnitPrice;
	}
	
	public Integer getGoodsCount() {
		return goodsCount;
	}
	
	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}
}
