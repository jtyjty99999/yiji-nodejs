/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * Administrator 2015年8月31日 下午3:49:16 创建
 */
    
package com.yiji.openapi.message.common.trade.info;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author Administrator
 *
 */

public class GoodsClause {
	/** 商品的外部ID */
	@Length(max = 32)
	@OpenApiField(desc = "商品的外部ID",demo = "1235646")
	private String outId;
	
	/** 商品名称 */
	@Length(max = 256, min = 1)
	@NotBlank
	@OpenApiField(desc = "商品名称",demo = "笔记本电脑")
	private String name;
	
	/** 商品详情 */
	@Length(max = 512)
	@OpenApiField(desc = "商品详情",demo = "笔记本电脑")
	private String memo;
	
	/** 商品单价 */
	@OpenApiField(desc = "商品单价",demo = "88.66")
	private Money price = Money.zero();
	
	/** 商品数量 */
	@OpenApiField(desc = "商品数量",demo = "10")
	private int quantity;
	
	/** 商品其它费用 */
	@OpenApiField(desc = "商品其它费用",demo = "88.66")
	private Money otherFee = Money.zero();
	
	/** 商品单位 */
	@Length(max = 8)
	@OpenApiField(desc = "商品单位",demo = "台")
	private String unit;
	
	/** 商品描述网址 */
	@Length(max = 256)
	@OpenApiField(desc = "商品描述网址",demo = "http://www.yiji.com/")
	private String detailUrl;
	
	/** 商品来源网址 */
	@Length(max = 256)
	@OpenApiField(desc = "商品来源网址",demo = "http://www.yiji.com/")
	private String referUrl;
	
	/** 商品类目 */
	@Length(max = 16)
	@OpenApiField(desc = "商品类目",demo = "计算机")
	private String category;

	public String getOutId() {
		return this.outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Money getPrice() {
		return this.price;
	}

	public void setPrice(Money price) {
		this.price = price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Money getOtherFee() {
		return this.otherFee;
	}

	public void setOtherFee(Money otherFee) {
		this.otherFee = otherFee;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getReferUrl() {
		return this.referUrl;
	}

	public void setReferUrl(String referUrl) {
		this.referUrl = referUrl;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}

    