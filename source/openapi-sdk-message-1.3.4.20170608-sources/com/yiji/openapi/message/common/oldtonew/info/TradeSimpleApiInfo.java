/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午5:05:44 创建
*/

package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * copy from com.yjf.trade.service.info.TradeSimpleInfo
 *
 * @author wkeduo
 * @see com.yjf.trade.service.info.TradeSimpleInfo
 */

public class TradeSimpleApiInfo implements Serializable {

	private static final long serialVersionUID = -6905129780612693008L;

	@Length(max = 20, min = 20)
	@OpenApiField(desc = "交易号", demo = "20150519020005491913")
	private String tradeNo;

	@OpenApiField(desc = "父交易号", demo = "123456")
	private String parentNo;

	@OpenApiField(desc = "订单号", demo = "123456")
	private String orderNo;

	@OpenApiField(desc = "交易业务产品编号", demo = "123456")
	private String tradeBizProductCode;

	@OpenApiField(desc = "付款人", demo = "20150519020005491913")
	private String payerUserId;

	@OpenApiField(desc = "收款人", demo = "20150519020005491913")
	private String payeeUserId;

	@OpenApiField(desc = "交易额", demo = "1.11")
	private Money tradeAmount;

	@OpenApiField(desc = "交易状态",
			constraint = "create_trade:创建交易<br>wait_buyer_pay:等待买家付款<br>create_freeze_paying:冻结处理中<br>...",
			demo = "create_trade")
	private String tradeStatus;

	@OpenApiField(desc = "支付状态", constraint = "SUCCESS:处理成功<br>UNKNOWN:未知<br>FAIL:处理失败", demo = "SUCCESS")
	private String payStatus;

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getParentNo() {
		return this.parentNo;
	}

	public void setParentNo(String parentNo) {
		this.parentNo = parentNo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getTradeBizProductCode() {
		return this.tradeBizProductCode;
	}

	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}

	public String getPayerUserId() {
		return this.payerUserId;
	}

	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

	public String getPayeeUserId() {
		return this.payeeUserId;
	}

	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

	public Money getTradeAmount() {
		return this.tradeAmount;
	}

	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

}
