package com.yiji.openapi.message.product.yzz;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

@OpenApiMessage(service = "yzzBonusPaymentQuery", type = ApiMessageType.Request)
public class YzzBonusPaymentQueryRequest extends ApiRequest {
	
	@OpenApiField(desc = "交易号")
	private String bonusNo;
	
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@NotBlank
	@OpenApiField(desc = "奖励模式")
	private String bonusType;
	
	public String getBonusNo() {
		return bonusNo;
	}
	
	public void setBonusNo(String bonusNo) {
		this.bonusNo = bonusNo;
	}
	
	public String getBonusType() {
		return bonusType;
	}
	
	public void setBonusType(String bonusType) {
		this.bonusType = bonusType;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
}
