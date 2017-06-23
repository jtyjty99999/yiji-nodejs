/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午3:56:15 创建
*/

package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */

public class GoodsClauseInfo implements Serializable {

	private static final long serialVersionUID = -214906325600167268L;

	@Length(max = 32)
	@OpenApiField(desc = "商品的外部ID", demo = "1234564")
	private String outId;

	@NotBlank
	@Length(max = 256, min = 1)
	@OpenApiField(desc = "商品名称", demo = "思圆")
	private String name;

	@Length(max = 512)
	@OpenApiField(desc = "商品详情", demo = "方便面")
	private String memo;

	@OpenApiField(desc = "商品单价", demo = "1.11")
	private Money price = Money.zero();

	@OpenApiField(desc = "商品数量", demo = "1")
	private int quantity;

	@OpenApiField(desc = "商品其它费用", demo = "1.11")
	private Money otherFee = Money.zero();

	@Length(max = 8)
	@OpenApiField(desc = "商品单位", demo = "袋")
	private String unit;

	@Length(max = 256)
	@OpenApiField(desc = "商品描述网址", demo = "http://www.oschina.net")
	private String detailUrl;

	@Length(max = 256)
	@OpenApiField(desc = "商品来源网址", demo = "http://www.oschina.net")
	private String referUrl;

	@Length(max = 16)
	@OpenApiField(desc = "商品类目", demo = "食品")
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
