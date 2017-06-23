/**
 * www.yiji.com 
 */
package com.yiji.openapi.message.common.transferAccounts;

import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mayansen
 * @date 20140828
 *
 */
@OpenApiMessage(service = "bankCardTransfer", type = ApiMessageType.Response)
public class bankCardTransferResponse extends ApiResponse {
	
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	/**
	 * 
	 */
	public bankCardTransferResponse() {
		super();
	}
	
	/**
	 * @param tradeNo
	 */
	public bankCardTransferResponse(String tradeNo) {
		super();
		this.tradeNo = tradeNo;
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
	
}
