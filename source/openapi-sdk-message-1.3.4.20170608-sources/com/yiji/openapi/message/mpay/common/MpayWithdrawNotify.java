package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 移动转账响应对象
 * 
 * @author lingjiao
 * 
 */
@OpenApiMessage(service = "mpayWithdraw", type = ApiMessageType.Notify)
public class MpayWithdrawNotify extends ApiNotify {

	@OpenApiField(desc = "转账总金额",constraint="转账总金额",demo="66.66")
	private Money amount;

	@OpenApiField(desc = "交易号",constraint="交易号",demo="20151016000451549430")
	private String tradeNo;

	@OpenApiField(desc = "外部订单号",constraint="外部订单号",demo="20151016000451549430")
	private String outOrderNo;

	@OpenApiField(desc = "交易类型",demo = "充值")
	private String type;

	@OpenApiField(desc = "用户ID",demo = "12345679801234567890")
	private String userId;

	@OpenApiField(desc = "充值状态",constraint="充值状态",demo="true")
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
