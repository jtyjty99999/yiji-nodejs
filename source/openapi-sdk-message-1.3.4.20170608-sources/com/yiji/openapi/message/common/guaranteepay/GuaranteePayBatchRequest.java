package com.yiji.openapi.message.common.guaranteepay;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.message.common.cashier.info.ProdDetailInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

@OpenApiMessage(service = "guaranteePayBatch", type = ApiMessageType.Request)
public class GuaranteePayBatchRequest extends ApiRequest {
	
	@NotNull
	@Size(min = 1, max = 9)
	@OpenApiField(desc = "商品信息列表")
	private List<ProdDetailInfo> prodInfoList;
	
	@OpenApiField(desc = "商户外部订单号",demo = "1235467981")
	private String outOrderNo;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "买家id",demo = "20140814010000052219")
	private String buyerUserId;
	
	@OpenApiField(desc = "币种", constraint = "可选参数为：CNY: 人民币(默认) USD: 美元 JPY:日元",demo = "CNY")
	private String currency;
	
	@OpenApiField(desc = "是否自动打款", constraint = "默认为自动打款，但也会受到额度的限制 ",demo = "false")
	private boolean autoConfirmPayFlag = Boolean.TRUE;
	
	@OpenApiField(desc = "自动关闭交易时间", constraint = "单位为分钟，创建交易后，该时间段后，自动关闭交易，默认为3天",demo = "40")
	private long autoCloseTradeMinutes = 3 * 24 * 60L;
	
	@OpenApiField(desc = "自动打款时间", constraint = "单位为分钟，在交易金额较小的情况下，卖家发货后，该时间段后，执行自动打款，默认为10天",demo = "2400")
	private long autoConfirmPayMinutes = 10 * 24 * 60L;
	
	public List<ProdDetailInfo> getProdInfoList() {
		return prodInfoList;
	}
	
	public void setProdInfoList(List<ProdDetailInfo> prodInfoList) {
		this.prodInfoList = prodInfoList;
	}
	
	public String getBuyerUserId() {
		return buyerUserId;
	}
	
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public boolean isAutoConfirmPayFlag() {
		return autoConfirmPayFlag;
	}
	
	public void setAutoConfirmPayFlag(boolean autoConfirmPayFlag) {
		this.autoConfirmPayFlag = autoConfirmPayFlag;
	}
	
	public long getAutoCloseTradeMinutes() {
		return autoCloseTradeMinutes;
	}
	
	public void setAutoCloseTradeMinutes(long autoCloseTradeMinutes) {
		this.autoCloseTradeMinutes = autoCloseTradeMinutes;
	}
	
	public long getAutoConfirmPayMinutes() {
		return autoConfirmPayMinutes;
	}
	
	public void setAutoConfirmPayMinutes(long autoConfirmPayMinutes) {
		this.autoConfirmPayMinutes = autoConfirmPayMinutes;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
}