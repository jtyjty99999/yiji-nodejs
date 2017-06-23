/**
 * www.yiji.com 
 */
package com.yiji.openapi.message.common.transferAccounts;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author mayansen
 * @date 20140828
 *
 */
@OpenApiMessage(service = "bankCardTransfer", type = ApiMessageType.Notify)
public class BankCardTransferNotify extends ApiNotify {
	
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "账期")
	private String accountDay;
	
	@OpenApiField(desc = "异步通知消息")
	private String message;
	
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
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
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * @return the outOrderNo
	 */
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	/**
	 * @param outOrderNo the outOrderNo to set
	 */
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
}
