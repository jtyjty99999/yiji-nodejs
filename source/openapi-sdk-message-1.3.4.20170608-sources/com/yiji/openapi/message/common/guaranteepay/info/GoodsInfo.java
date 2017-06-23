/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 下午2:54:51 创建
 */
package com.yiji.openapi.message.common.guaranteepay.info;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 
 * 
 * @author lvchen@yiji.com
 * 
 */
public class GoodsInfo {
	/** 商品的外部ID */
	@OpenApiField(desc = "商品的外部ID",demo = "123456132564")
	@Length(max = 32)
	private String outId;
	
	/** 商品名称 */
	@OpenApiField(desc = "商品名称",demo = "笔记本")
	@Length(max = 256, min = 1)
	@NotBlank
	private String name;
	
	/** 商品详情 */
	@OpenApiField(desc = "商品详情 ",demo = "笔记本")
	@Length(max = 512)
	private String memo;
	
	/** 商品单价 */
	@OpenApiField(desc = "商品价格", constraint = "商品价格，支持2位小数的元。默认：0",demo = "88.66")
	private Money price = Money.zero();
	
	/** 商品数量 */
	@OpenApiField(desc = "商品数量 ", constraint = "商品数量，默认：0",demo = "10")
	private int quantity;
	
	/** 商品其它费用 */
	@OpenApiField(desc = "商品其它费用", constraint = "商品其它费用，支持2位小数的元。默认：0",demo = "88.66")
	private Money otherFee = Money.zero();
	
	/** 商品单位 */
	@OpenApiField(desc = "商品单位", constraint = "商品单位",demo = "本")
	@Length(max = 8)
	private String unit;
	
	/** 商品描述网址 */
	@OpenApiField(desc = "商品描述网址", constraint = "商品描述网址，可访问的公网地址",demo = "http://www.baidu.com")
	@Length(max = 256)
	private String detailUrl;
	
	/** 商品来源网址 */
	@OpenApiField(desc = "商品来源网址", constraint = "商品来源网址，可访问的公网地址",demo = "http://www.baidu.com")
	@Length(max = 256)
	private String referUrl;
	
	/** 商品类目 */
	@OpenApiField(desc = "商品类目", constraint = "商品类目",demo = "文具")
	@Length(max = 16)
	private String category;
	
	public String getOutId() {
		return outId;
	}
	
	public void setOutId(String outId) {
		this.outId = outId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public Money getPrice() {
		return price;
	}
	
	public void setPrice(Money price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Money getOtherFee() {
		return otherFee;
	}
	
	public void setOtherFee(Money otherFee) {
		this.otherFee = otherFee;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public String getDetailUrl() {
		return detailUrl;
	}
	
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}
	
	public String getReferUrl() {
		return referUrl;
	}
	
	public void setReferUrl(String referUrl) {
		this.referUrl = referUrl;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
}
