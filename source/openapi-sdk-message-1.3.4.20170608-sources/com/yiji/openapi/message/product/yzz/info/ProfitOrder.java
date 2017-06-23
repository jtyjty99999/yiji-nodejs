/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 上午10:09:18 创建
 */
package com.yiji.openapi.message.product.yzz.info;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class ProfitOrder extends OrderBase{
	private static final long serialVersionUID = 1L;

	/**
	 * 子订单号
	 */
	@NotEmpty
	@Size(min = 20, max = 40)
	private String subOrderNo;

	/**
	 * 付款UserId 可选，默认为上级的收款方(第一层默认为交易收款方)
	 */
	@Size(min = 20, max = 20)
	private String payerUserId;

	/**
	 * 收款方UserId
	 */
	@NotEmpty
	@Size(min = 20, max = 20)
	private String payeeUserId;

	/**
	 * 金额
	 */
	@NotNull
	private Money amount;

	/**
	 * 说明
	 */
	@Size(min = 0, max = 128)
	private String memo;

	/**
	 * 下级列表
	 */
	@Size(min = 0, max = 10)
	private List<ProfitOrder> profits;

	public List<ProfitOrder> getProfits() {
		return profits;
	}

	public void setProfits(List<ProfitOrder> profits) {
		this.profits = profits;
	}

	public Money getAmount() {
		return amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPayeeUserId() {
		return payeeUserId;
	}

	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

	public String getSubOrderNo() {
		return subOrderNo;
	}

	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}

	public String getPayerUserId() {
		return payerUserId;
	}

	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

	/**
	 * 
	 * @see com.yiji.openapi.message.product.yzz.info.Order#check()
	 */
	public void check() {
	}
}

    