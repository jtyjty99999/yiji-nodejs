package com.yiji.openapi.message.mpay.query;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 查询交易信息 响应报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "queryTradeInfo", type = ApiMessageType.Response)
public class QueryTradeInfoApiResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易号",demo = "21657821383236")
	private String tradeNo;
	
	@OpenApiField(desc = "交易名称",demo = "充值")
	private String tradeName;
	
	@OpenApiField(desc = "交易金额",demo = "88.66")
	private Money tradeAmount;
	
	@OpenApiField(desc = "买家id",demo = "12345679801234567890")
	private String buyerId;
	
	@OpenApiField(desc = "卖家id",demo = "12345678901234567890")
	private String sellerId;
	
	@OpenApiField(desc = "卖家名称",demo = "易极付")
	private String sellerRealName;
	
	@OpenApiField(desc = "交易状态",demo = "SUCCESS")
	private String tradeStatus;
	
	@OpenApiField(desc = "汇率",demo = "8.66")
	private String rate;
	
	@OpenApiField(desc = "外汇币种",demo = "CNY")
	private String swapCurrency;
	
	@OpenApiField(desc = "外汇金额",demo = "88.66")
	private Money swapAmount;
	
	@OpenApiField(desc = "外部订单号",demo = "213456798")
	private String outOrderNo;
	
	@OpenApiField(desc = "订单类型",constraint = "“1”:外部会员订单;“2”：易极付会员订单",demo = "1")
	private String orderType;
	@OpenApiField(desc = "买家真实姓名",demo = "易极付")
	private String realName;
	@OpenApiField(desc = "买家身份证号",demo = "123456789013245679")
	private String certNo;

	@OpenApiField(desc = "外部用户ID",demo = "12345687912345647890")
	private String partnerUserId;
	
	public String getOrderType() {
		return orderType;
	}
	
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getTradeName() {
		return tradeName;
	}
	
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public String getBuyerId() {
		return buyerId;
	}
	
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	
	public String getSellerId() {
		return sellerId;
	}
	
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	
	public String getSellerRealName() {
		return sellerRealName;
	}
	
	public void setSellerRealName(String sellerRealName) {
		this.sellerRealName = sellerRealName;
	}
	
	public String getTradeStatus() {
		return tradeStatus;
	}
	
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	
	public String getRate() {
		return this.rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getSwapCurrency() {
		return swapCurrency;
	}
	
	public void setSwapCurrency(String swapCurrency) {
		this.swapCurrency = swapCurrency;
	}
	
	public Money getSwapAmount() {
		return swapAmount;
	}
	
	public void setSwapAmount(Money swapAmount) {
		this.swapAmount = swapAmount;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPartnerUserId() {
		return partnerUserId;
	}

	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}
}
