/**
 * www.yiji.com
 */
package com.yiji.openapi.message.product.ypos;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mayansen
 * @date 20140821
 *
 */
@OpenApiMessage(service = "yposSettlementQuery", type = ApiMessageType.Request)
public class YposSettlementQueryRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "订单号")
	private String tradeNo;
	
	public YposSettlementQueryRequest() {
		super();
	}
	
	public YposSettlementQueryRequest(String tradeNo) {
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
