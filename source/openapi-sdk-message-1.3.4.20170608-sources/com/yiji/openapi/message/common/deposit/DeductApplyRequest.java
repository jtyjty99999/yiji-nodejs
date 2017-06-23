/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月30日 上午10:03:20 创建
 */
package com.yiji.openapi.message.common.deposit;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "deductApply", type = ApiMessageType.Request)
public class DeductApplyRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "绑卡ID",demo = "123465798")
	private String bindId;
	
	@NotNull
	@OpenApiField(desc = "金额",demo = "88.66")
	private Money amount;
	
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "易极付用户ID",demo = "20140809010000051239")
	private String userId;
	
	@OpenApiField(desc = "备注",demo = "提现")
	private String memo;
	
	@OpenApiField(desc = "收费方式", constraint = "可选值{P：平台付费,U：用户付费}",demo = "P")
	private String payWay;

	/** 用户客户端IP，目前使用ipv4的格式，例如192.168.1.110 **/
	@OpenApiField(desc = "客户端IP",demo = "192.168.1.1")
	private String userEndIp;
	
	/** 用户终端类型 **/
	@OpenApiField(desc = "终端类型",demo = "PC")
	private String userTemunalType;
	
	/** 交易类型 **/
	@OpenApiField(desc = "交易类型",demo = "FASTPAYTRADE")
	private String tradeCategory;
	
	/** 商品类型码 */
	@OpenApiField(desc = "商品类型码",demo = "2311456")
	private String goodsTypeCode;
	
	/** 商品类型名称 */
	@OpenApiField(desc = "商品类型名称",demo = "文具")
	private String goodsTypeName;
	
	/** 商品名称 */
	@OpenApiField(desc = "商品名称",demo = "笔")
	private String goodsName;

	
	public String getBindId() {
		return this.bindId;
	}
	
	public void setBindId(String bindId) {
		this.bindId = bindId;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getPayWay() {
		return payWay;
	}
	
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}
	
	public String getUserEndIp() {
		return userEndIp;
	}

	public void setUserEndIp(String userEndIp) {
		this.userEndIp = userEndIp;
	}

	public String getUserTemunalType() {
		return userTemunalType;
	}

	public void setUserTemunalType(String userTemunalType) {
		this.userTemunalType = userTemunalType;
	}

	public String getTradeCategory() {
		return tradeCategory;
	}

	public void setTradeCategory(String tradeCategory) {
		this.tradeCategory = tradeCategory;
	}

	public String getGoodsTypeCode() {
		return goodsTypeCode;
	}

	public void setGoodsTypeCode(String goodsTypeCode) {
		this.goodsTypeCode = goodsTypeCode;
	}

	public String getGoodsTypeName() {
		return goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
}
