package com.yiji.openapi.message.product.yzz;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.product.yzz.info.PaymentSubOrder;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "yzzHandRepaymentTrade", type = ApiMessageType.Request)
public class YzzHandRepaymentTradeRequest extends ApiRequest {
	
	@NotEmpty
	@Size(max = 20)
	@OpenApiField(desc = "借款交易主交易号")
	private String tradeNo;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@NotEmpty
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "还款用户Id")
	private String userId;
	
	@NotNull
	@OpenApiField(desc = "还款总金额")
	private Money totalAmount;
	
	@Size(min = 1, max = 400)
	@OpenApiField(desc = "还款明细")
	List<PaymentSubOrder> repaymentSubOrders;
	
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
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public List<PaymentSubOrder> getRepaymentSubOrders() {
		return repaymentSubOrders;
	}
	
	public void setRepaymentSubOrders(List<PaymentSubOrder> repaymentSubOrders) {
		this.repaymentSubOrders = repaymentSubOrders;
	}
	
}
