package com.yiji.openapi.message.product.yzz;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "yzzTenderTradeQuery", type = ApiMessageType.Request)
public class YzzTenderTradeQueryRequest extends ApiRequest {
	
	@OpenApiField(desc = "借款项目主交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@NotEmpty
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "借款人用户Id")
	private String userId;
	
	@NotNull
	@OpenApiField(desc = "借款项目总金额")
	private Money tenderAmount;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getTenderAmount() {
		return tenderAmount;
	}
	
	public void setTenderAmount(Money tenderAmount) {
		this.tenderAmount = tenderAmount;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
}
