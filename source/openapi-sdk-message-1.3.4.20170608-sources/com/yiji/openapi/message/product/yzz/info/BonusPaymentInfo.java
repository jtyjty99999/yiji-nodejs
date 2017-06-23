package com.yiji.openapi.message.product.yzz.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

public class BonusPaymentInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@OpenApiField(desc = "子订单号")
	private String subOrderNo;
	
	@OpenApiField(desc = "收款方UserId")
	private String payeeUserId;
	
	@OpenApiField(desc = "付款方UserId")
	private String payerUserId;
	
	@OpenApiField(desc = "金额")
	private Money amount;
	
	@OpenApiField(desc = "借款项目主交易号")
	private String memo;
	
	public String getSubOrderNo() {
		return subOrderNo;
	}
	
	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}
	
	public String getPayeeUserId() {
		return payeeUserId;
	}
	
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
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
	
	public String getPayerUserId() {
		return payerUserId;
	}
	
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	
}
