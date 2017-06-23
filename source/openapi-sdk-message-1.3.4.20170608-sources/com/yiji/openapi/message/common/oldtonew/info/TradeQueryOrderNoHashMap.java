/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月23日 下午1:46:23 创建
 */
package com.yiji.openapi.message.common.oldtonew.info;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.enums.ApiServiceResultCode;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月23日
 */

public class TradeQueryOrderNoHashMap {
	
	@NotEmpty
	@OpenApiField(desc = "服务响应编码", constraint = "必填")
	private String resultCode = ApiServiceResultCode.SUCCESS.getCode();
	
	@NotEmpty
	@OpenApiField(desc = "服务响应信息")
	private String resultMessage = ApiServiceResultCode.SUCCESS.getCode();
	
	@OpenApiField(desc = "交易流水号", constraint = "交易流水号", demo = "12346579801234567980")
	private String tradeNo;
	
	@OpenApiField(desc = "交易类型", constraint = "交易类型", demo = "FASTPAYTRADE")
	private String tradeType;
	
	@OpenApiField(desc = "交易名称", constraint = "交易名称", demo = "易极付转账")
	private String tradeName;
	
	@OpenApiField(desc = "交易金额", constraint = "交易金额", demo = "6.66")
	private String tradeAmount;
	
	@OpenApiField(desc = "实付金额", constraint = "实付金额", demo = "6.66")
	private String actuallyPaid;
	
	@OpenApiField(desc = "退款金额", constraint = "退款金额", demo = "6.66")
	private String refundAmount;
	
	@OpenApiField(desc = "买家id", constraint = "买家id", demo = "12346579801234567980")
	private String buyerId;
	
	@OpenApiField(desc = "买家姓名", constraint = "买家姓名", demo = "张三")
	private String buyerRealName;
	
	@OpenApiField(desc = "买家邮箱", constraint = "买家邮箱", demo = "yiji@12.com")
	private String buyerEmail;
	
	@OpenApiField(desc = "买家留言", constraint = "买家留言", demo = "服务不错")
	private String buyerMemo;
	
	@OpenApiField(desc = "卖家id", constraint = "卖家id", demo = "234234234")
	private String sellerId;
	
	@OpenApiField(desc = "卖家姓名", constraint = "卖家姓名", demo = "淘宝")
	private String sellerRealName;
	
	@OpenApiField(desc = "卖家邮箱", constraint = "卖家邮箱", demo = "yiji@12.com")
	private String sellerEmail;
	
	@OpenApiField(desc = "是否有退款", constraint = "是否有退款", demo = "1")
	private String isRefund;
	
	@OpenApiField(desc = "交易状态", constraint = "交易状态", demo = "交易成功")
	private String tradeStatus;
	
	@OpenApiField(desc = "交易状态标识", constraint = "交易状态标识", demo = "A")
	private String tradeStatusFlag;
	
	@OpenApiField(desc = "卖家留言", constraint = "卖家留言", demo = "感谢好评")
	private String sellerMessage;
	
	@OpenApiField(desc = "买家留言", constraint = "买家留言", demo = "下次再来")
	private String buyerMessage;
	
	@OpenApiField(desc = "交易结束时间", constraint = "交易结束时间", demo = "2015-11-11")
	private String tradeEndTime;
	
	@OpenApiField(desc = "交易来源系统", constraint = "交易来源系统", demo = "易极付")
	private String tradeFrom;
	
	@OpenApiField(desc = "商户会员号", constraint = "商户会员号", demo = "20141229020000062199")
	private String merchantId;

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeType() {
		return this.tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getTradeName() {
		return this.tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}

	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getActuallyPaid() {
		return this.actuallyPaid;
	}

	public void setActuallyPaid(String actuallyPaid) {
		this.actuallyPaid = actuallyPaid;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getBuyerId() {
		return this.buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerRealName() {
		return this.buyerRealName;
	}

	public void setBuyerRealName(String buyerRealName) {
		this.buyerRealName = buyerRealName;
	}

	public String getBuyerEmail() {
		return this.buyerEmail;
	}

	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public String getBuyerMemo() {
		return this.buyerMemo;
	}

	public void setBuyerMemo(String buyerMemo) {
		this.buyerMemo = buyerMemo;
	}

	public String getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerRealName() {
		return this.sellerRealName;
	}

	public void setSellerRealName(String sellerRealName) {
		this.sellerRealName = sellerRealName;
	}

	public String getSellerEmail() {
		return this.sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getIsRefund() {
		return this.isRefund;
	}

	public void setIsRefund(String isRefund) {
		this.isRefund = isRefund;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getTradeStatusFlag() {
		return this.tradeStatusFlag;
	}

	public void setTradeStatusFlag(String tradeStatusFlag) {
		this.tradeStatusFlag = tradeStatusFlag;
	}

	public String getSellerMessage() {
		return this.sellerMessage;
	}

	public void setSellerMessage(String sellerMessage) {
		this.sellerMessage = sellerMessage;
	}

	public String getBuyerMessage() {
		return this.buyerMessage;
	}

	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}

	public String getTradeEndTime() {
		return this.tradeEndTime;
	}

	public void setTradeEndTime(String tradeEndTime) {
		this.tradeEndTime = tradeEndTime;
	}

	public String getTradeFrom() {
		return this.tradeFrom;
	}

	public void setTradeFrom(String tradeFrom) {
		this.tradeFrom = tradeFrom;
	}

	public String getMerchantId() {
		return this.merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
}

    