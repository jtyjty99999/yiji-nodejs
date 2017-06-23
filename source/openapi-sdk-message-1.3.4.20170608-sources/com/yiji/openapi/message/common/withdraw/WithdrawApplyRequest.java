package com.yiji.openapi.message.common.withdraw;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

@OpenApiMessage(service = "withdrawApply", type = ApiMessageType.Request)
public class WithdrawApplyRequest extends ApiRequest {

	@NotEmpty
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "会员ID", constraint = "提现的会员ID",demo = "20140809010000051239")
	private String userId;

	@NotNull
	@OpenApiField(desc = "提现金额",demo = "88.66")
	private Money amount;

	@NotEmpty
	@Length(max = 32)
	@OpenApiField(desc = "绑定银行卡ID",demo = "123645789")
	private String bindId;

	@OpenApiField(desc = "到账期限", constraint = "0：T+0  1：T+1",demo = "0")
	private Integer arrivedType = 0;

	@OpenApiField(desc = "币种",demo = "CNY")
	private String currency;

	@OpenApiField(desc = "收费方式", constraint = "可选值{P：平台付费,U：用户付费}",demo = "P")
	private String payWay;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Money getAmount() {
		return amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public String getBindId() {
		return bindId;
	}

	public void setBindId(String bindId) {
		this.bindId = bindId;
	}

	public Integer getArrivedType() {
		return arrivedType;
	}

	public void setArrivedType(Integer arrivedType) {
		this.arrivedType = arrivedType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}
}
