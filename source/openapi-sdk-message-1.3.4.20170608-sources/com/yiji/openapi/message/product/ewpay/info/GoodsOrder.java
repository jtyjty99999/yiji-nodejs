/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * @author xinqing@yiji.com 下午3:56:44 创建
 */
package com.yiji.openapi.message.product.ewpay.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
public class GoodsOrder {
	/** 商品名称 */
	@NotNull
	@Length(max = 256, min = 1)
	@OpenApiField(desc = "商品名称" ,demo = "基金")
	private String title;
	
	/** 商品编码 */
	@OpenApiField(desc = "商品编码" ,demo = "344355")
	private String code;
	
	/** 商品描述 */
	@OpenApiField(desc = "商品描述" ,demo = "描述")
	@Length(max = 512)
	private String description;
	
	/** 商品单价 */
	@OpenApiField(desc = "商品单价" ,demo = "10.00")
	private Money price;
	
	/** 商品数量 */
	@OpenApiField(desc = "商品数量" ,demo = "50")
	private String quantity;
	
	/** 商品单位 */
	@Length(max = 8)
	@OpenApiField(desc = "商品单位" ,demo = "8")
	private String unit;
	
	/** 其他费用 */
	@OpenApiField(desc = "其他费用 " ,demo = "500.00")
	private Money chargeExtra;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Money getPrice() {
		return this.price;
	}

	public void setPrice(Money price) {
		this.price = price;
	}

	public String getQuantity() {
		return this.quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Money getChargeExtra() {
		return this.chargeExtra;
	}

	public void setChargeExtra(Money chargeExtra) {
		this.chargeExtra = chargeExtra;
	}
	
	
}
