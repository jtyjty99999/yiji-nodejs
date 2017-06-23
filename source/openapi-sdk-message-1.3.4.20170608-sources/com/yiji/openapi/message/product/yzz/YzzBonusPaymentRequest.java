package com.yiji.openapi.message.product.yzz;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.message.product.yzz.info.PaymentSubOrder;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "yzzBonusPayment", type = ApiMessageType.Request)
public class YzzBonusPaymentRequest extends ApiRequest {
	
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "付款用户id,默认使用partnerId")
	private String payerUserId;
	
	@NotNull
	@OpenApiField(desc = "奖励模式")
	private String bonusType;
	
	@NotNull
	@OpenApiField(desc = "奖励总金额")
	private Money totalAmount;
	
	@OpenApiField(desc = "到期时间")
	private Date expiresDate;
	
	@NotNull
	@Size(min = 1, max = 400)
	@OpenApiField(desc = "付款明细")
	private List<PaymentSubOrder> paymentSubOrders;
	
	@Length(max = 100)
	@OpenApiField(desc = "备注")
	private String memo;
	
	public String getPayerUserId() {
		return payerUserId;
	}
	
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	
	public String getBonusType() {
		return bonusType;
	}
	
	public void setBonusType(String bonusType) {
		this.bonusType = bonusType;
	}
	
	public Money getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Date getExpiresDate() {
		return expiresDate;
	}
	
	public void setExpiresDate(Date expiresDate) {
		this.expiresDate = expiresDate;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public List<PaymentSubOrder> getPaymentSubOrders() {
		return paymentSubOrders;
	}
	
	public void setPaymentSubOrders(List<PaymentSubOrder> paymentSubOrders) {
		this.paymentSubOrders = paymentSubOrders;
	}
	
}
