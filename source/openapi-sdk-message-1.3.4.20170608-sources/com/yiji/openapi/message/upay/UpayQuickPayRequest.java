/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月24日 上午9:36:36 创建
 */
package com.yiji.openapi.message.upay;

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
@Deprecated
@OpenApiMessage(service = "upayQuickPay", type = ApiMessageType.Request)
public class UpayQuickPayRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "签约编号")
	private String subscribeCode;
	
	@Length(max = 32)
	@OpenApiField(desc = "卖家编号（收款方）")
	private String sellerId;
	
	@NotNull
	@OpenApiField(desc = "支付方式", constraint = "BY_DEPOSIT:无卡支付，BY_BALANCE：余额支付")
	private String payWay;
	
	@NotNull
	@OpenApiField(desc = "支付金额", constraint = "单位：元")
	private Money amount;
	
	/** 用户客户端IP，目前使用ipv4的格式，例如192.168.1.110 **/
	@OpenApiField(desc = "客户端IP")
	private String userEndIp;
	
	/** 用户终端类型 **/
	@OpenApiField(desc = "终端类型")
	private String userTemunalType;
	
	/** 交易类型 **/
	@OpenApiField(desc = "交易类型")
	private String tradeCategory;
	
	/** 商品类型码 */
	@OpenApiField(desc = "商品类型码")
	private String goodsTypeCode;
	
	/** 商品类型名称 */
	@OpenApiField(desc = "商品类型名称")
	private String goodsTypeName;
	
	/** 商品名称 */
	@OpenApiField(desc = "商品名称")
	private String goodsName;
	
	public String getSubscribeCode() {
		return this.subscribeCode;
	}
	
	public void setSubscribeCode(String subscribeCode) {
		this.subscribeCode = subscribeCode;
	}
	
	public String getSellerId() {
		return this.sellerId;
	}
	
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	
	public String getPayWay() {
		return this.payWay;
	}
	
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
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
