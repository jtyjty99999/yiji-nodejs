package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

@OpenApiMessage(service = "commonGatewayTradePay", type = ApiMessageType.Notify)
public class CommonCashierPayGatewayNotifyV2 extends ApiNotify {

	@OpenApiField(desc = "外部订单号",demo = "1234647923165")
	private String outOrderNo;

	@OpenApiField(desc = "交易号",demo = "12341654798623")
	private String tradeNo;
	
	@OpenApiField(desc = "交易类型",demo = "ESCROWTRADE")
	private String tradeType;
	
	@OpenApiField(desc = "到账日期",demo = "20150922")
	private String accountDay;
	
	/**
	 * @return the tradeNo
	 */
	public String getTradeNo() {
		return tradeNo;
	}
	
	/**
	 * @param tradeNo the tradeNo to set
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	/**
	 * @return the tradeType
	 */
	public String getTradeType() {
		return tradeType;
	}
	
	/**
	 * @param tradeType the tradeType to set
	 */
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	
	/**
	 * @return the accountDay
	 */
	public String getAccountDay() {
		return accountDay;
	}
	
	/**
	 * @param accountDay the accountDay to set
	 */
	public void setAccountDay(String accountDay) {
		this.accountDay = accountDay;
	}
	
	/**
	 * @return the payerUserId
	 */
	public String getOutOrderNo() {
		return outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
}
