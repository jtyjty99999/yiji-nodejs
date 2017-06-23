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
 * @date 20140806
 *
 */
@OpenApiMessage(service = "tradeInfoQuery", type = ApiMessageType.Request)
public class PaymentQueryRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "交易号或者订单号",constraint="交易号或者订单号",demo="20160309142146000000100012092")
	private String billNo;
	
	@NotBlank
	@Length(max = 1)
	@OpenApiField(desc = "类型", constraint = "{\"data\":[\"1:代表传入的是交易号\",\"2:代表传入的是订单号\"],\"name\":\"类型\"}", demo = "1")
	private String billNoType;
	
	/**
	 * 
	 */
	public PaymentQueryRequest() {
		super();
	}
	
	/**
	 * @param billNo
	 * @param billNoType
	 */
	public PaymentQueryRequest(String billNo, String billNoType) {
		super();
		this.billNo = billNo;
		this.billNoType = billNoType;
	}
	
	/**
	 * @return the billNo
	 */
	public String getBillNo() {
		return billNo;
	}
	
	/**
	 * @param billNo the billNo to set
	 */
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	
	/**
	 * @return the billNoType
	 */
	public String getBillNoType() {
		return billNoType;
	}
	
	/**
	 * @param billNoType the billNoType to set
	 */
	public void setBillNoType(String billNoType) {
		this.billNoType = billNoType;
	}
	
}
