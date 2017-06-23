package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by tyongfu@yiji.com on 2016/1/28.
 */
@Deprecated
@OpenApiMessage(service = "payerApply", type = ApiMessageType.Request)
public class PayerApplyRequest extends ApiRequest {
	
	@OpenApiField(desc = "交易号", constraint = "交易号", demo = "20160128001111111111")
	@NotBlank
	private String tradeNo;
	
	@OpenApiField(desc = "交易描述", constraint = "交易描述", demo = "买衣服")
	@Length(max = 512)
	private String tradeMemo;
	
	@OpenApiField(desc = "交易名称", constraint = "交易名称", demo = "冬日一日游")
	@Length(max = 64)
	private String tradeName;
	
	@OpenApiField(desc = "付款人ID", constraint = "付款人ID", demo = "20160128001111111111")
	@Length(max = 20, min = 20)
	@NotBlank
	private String payerUserId;
	
	@OpenApiField(desc = "金额", constraint = "金额", demo = "66.66")
	@NotNull
	private Money tradeAmount;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getTradeMemo() {
		return tradeMemo;
	}
	
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}
	
	public String getTradeName() {
		return tradeName;
	}
	
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public String getPayerUserId() {
		return payerUserId;
	}
	
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
}
