/**
 * 
 */
package com.yiji.openapi.message.common.guaranteepay;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mayansen
 * @date 20140827
 *
 */
@OpenApiMessage(service = "guaranteePayFreezeUnfreeze", type = ApiMessageType.Request)
public class GuaranteePayPauseOrCancelUnfreezeRequest extends ApiRequest {
	
	@NotNull
	@Length(max = 64)
	@OpenApiField(desc = "交易号",demo = "1253456312468132")
	private String tradeNo;
	
	@NotNull
	@OpenApiField(desc = "交易动作",demo = "ESCOW_TRADE_BUYER_ESCOW_PAY")
	private String executeAction;
	
	/**
	 * 
	 */
	public GuaranteePayPauseOrCancelUnfreezeRequest() {
		super();
	}
	
	/**
	 * @param tradeNo
	 * @param executeAction
	 */
	public GuaranteePayPauseOrCancelUnfreezeRequest(String tradeNo, String executeAction) {
		super();
		this.tradeNo = tradeNo;
		this.executeAction = executeAction;
	}
	
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
	 * @return the executeAction
	 */
	public String getExecuteAction() {
		return executeAction;
	}
	
	/**
	 * @param executeAction the executeAction to set
	 */
	public void setExecuteAction(String executeAction) {
		this.executeAction = executeAction;
	}
	
}
