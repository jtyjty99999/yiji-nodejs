/**
 * 
 */
package com.yiji.openapi.message.common.query;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mayansen
 * @date 20140812
 *
 */
@OpenApiMessage(service = "depositQuery", type = ApiMessageType.Request)
public class DepositQueryRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "充值流水号")
	private String tradeNo;
	
	/**
	 * @param tradeNo
	 */
	public DepositQueryRequest(String tradeNo) {
		super();
		this.tradeNo = tradeNo;
	}
	
	/**
	 * 
	 */
	public DepositQueryRequest() {
		super();
		// TODO Auto-generated constructor stub
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
