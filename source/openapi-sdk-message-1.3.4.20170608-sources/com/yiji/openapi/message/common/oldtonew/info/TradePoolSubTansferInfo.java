/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.yiji.openapi.message.common.oldtonew.info;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 *
 * @Filename TradePoolSubTansferInfo.java
 *
 * @Description
 *
 * @Version 1.0
 *
 * @Author wangjiayin
 *
 * @Email wjiayin@yiji.com
 *
 * @History
 * <li>Author: wangjiayin</li>
 * <li>Date: 2013-3-13</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 *
 */
public class TradePoolSubTansferInfo {

	/** 订单号 */
	@NotBlank
	@Length(min = 1, max = 64)
	@OpenApiField(desc = "订单号", demo = "20160127150443988374")
	private String orderNo;

	/** 付款人会员号 */
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "付款人会员号", demo = "20151106010009133011")
	private String payerUserId;

	/** 收款人会员号 */
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "收款人会员号", demo = "20151106010009133011")
	private String payeeUserId;

	/** 付款金额 */
	@NotBlank
	@OpenApiField(desc = "付款金额", demo = "1.11")
	private String transferAmount;

	/** 备注 */
	@Length(max = 1024)
	@OpenApiField(desc = "备注", demo = "备注")
	private String memo;

	/** 交易名称 */
	@Length(max = 60)
	@OpenApiField(desc = "交易名称", demo = "交易名称")
	private String tradeName;

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayerUserId() {
		return payerUserId;
	}

	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

	public String getPayeeUserId() {
		return payeeUserId;
	}

	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

	public String getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(String transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
