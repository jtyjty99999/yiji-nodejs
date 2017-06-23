/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 上午9:56:30 创建
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

public class PaymentSubOrder extends OrderBase{
	private static final long serialVersionUID = 1L;

	/**
	 * 子订单号
	 */
	@NotEmpty
	@Size(min = 20, max = 40)
	private String subOrderNo;

	/**
	 * 收款方UserId
	 */
	@NotEmpty
	@Size(min = 20, max = 20)
	private String payeeUserId;

	/**
	 * 还款金额
	 */
	@NotNull
	private Money amount;

	/**
	 * 还款本金金额(同卡进出使用)
	 */
	private Money principal;

	/**
	 * 说明
	 */
	@Size(min = 0, max = 128)
	private String memo;

	/**
	 * 下级分润列表
	 */
	@Size(min = 0, max = 10)
	private List<ProfitOrder> profitOrders;

	public List<ProfitOrder> getProfitOrders() {
		return profitOrders;
	}

	public void setProfitOrders(List<ProfitOrder> profitOrders) {
		this.profitOrders = profitOrders;
	}

	public String getSubOrderNo() {
		return subOrderNo;
	}

	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
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

	public Money getPrincipal() {
		return principal;
	}

	public void setPrincipal(Money principal) {
		this.principal = principal;
	}

	/**
	 * 
	 * @see com.yiji.openapi.message.product.yzz.info.Order#check()
	 */
	public void check() {
	}
}

    