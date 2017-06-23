package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;

import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-02-15<br>
 */
public class GoodsInfo implements Serializable {
	private static final long serialVersionUID = 5974479085606489564L;

	@Size(max = 255, message = "商户名称长度不能超过255位！")
	@OpenApiField(desc = "货品名称", demo = "军刀")
	private String goodsName;

	@Size(max = 60, message = "货号长度不能超过60位")
	@OpenApiField(desc = "货号", demo = "1232132131232132312")
	private String goodsNumber;

	@Size(max = 50, message = "商品分类长度不能超过50位！")
	@OpenApiField(desc = "商品分类", demo = "机械类")
	private String itemSharpProductCode;

	@Size(max = 15, message = "商品单价长度不能超过15位！")
	@OpenApiField(desc = "商品单价", demo = "299")
	private String itemSharpUnitPrice;

	@OpenApiField(desc = "货品数量", demo = "10")
	private String goodsCount;

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

	public String getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(String goodsCount) {
		this.goodsCount = goodsCount;
	}
}
