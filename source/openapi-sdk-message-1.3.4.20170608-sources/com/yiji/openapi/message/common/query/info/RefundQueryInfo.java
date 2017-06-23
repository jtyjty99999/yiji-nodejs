package com.yiji.openapi.message.common.query.info;

import java.io.Serializable;
import java.util.Date;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 
 * 
 * @Filename RefundQueryInfo.java
 * 
 * @Description 退款查询结果信息
 * 
 * @Version 1.0
 * 
 * @Author yinhaijun
 * 
 * @Email yhaijun@yiji.com
 * 
 * @History <li>Author: yinhaijun</li> <li>Date: 2013-5-27</li> <li>Version: 1.0
 * </li> <li>Content: create</li>
 * 
 */
public class RefundQueryInfo implements Serializable {
	
	/** serialVersionUID */
	private static final long serialVersionUID = -4381230731930096680L;
	
	/** 退款流水号 */
	private String refundNo;
	
	/** 交易流水号 */
	private String tradeNo;
	
	/** 来源 */
	private String tradeFrom;
	
	/** 业务产品 */
	private String tradeBizProductCode;
	
	/** 外部定单号 */
	private String outOrderNo;
	
	/** 付款额 */
	private Money payAmount;
	
	/** 退款额 */
	private Money refundAmount;
	
	/** 剩余额 */
	private Money remainingAmount;
	
	/** 退款方会员号(就是卖家) */
	private String payerUserId;
	
	/** 退款方姓名 */
	private String payerName;
	
	/** 收款方会员号(就是买家) */
	private String payeeUserId;
	
	/** 收款方姓名 */
	private String payeeName;
	
	/** 平台商会员号 */
	private String merchantUserId;
	
	/** 退款状态 */
	private String refundStatuse;
	
	/** 币种,默认为人民币 */
	private String currency;
	
	/** 退款原因 */
	private String refundReason;
	
	/** 退款描述 */
	private String refundMemo;
	
	/** 退款时间 */
	private Date refundTime;
	
	public String getRefundNo() {
		return refundNo;
	}
	
	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getTradeFrom() {
		return tradeFrom;
	}
	
	public void setTradeFrom(String tradeFrom) {
		this.tradeFrom = tradeFrom;
	}
	
	public String getTradeBizProductCode() {
		return tradeBizProductCode;
	}
	
	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public Money getPayAmount() {
		return payAmount;
	}
	
	public void setPayAmount(Money payAmount) {
		this.payAmount = payAmount;
	}
	
	public Money getRefundAmount() {
		return refundAmount;
	}
	
	public void setRefundAmount(Money refundAmount) {
		this.refundAmount = refundAmount;
	}
	
	public Money getRemainingAmount() {
		return remainingAmount;
	}
	
	public void setRemainingAmount(Money remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	
	public String getPayerUserId() {
		return payerUserId;
	}
	
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	
	public String getPayerName() {
		return payerName;
	}
	
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	
	public String getPayeeUserId() {
		return payeeUserId;
	}
	
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}
	
	public String getPayeeName() {
		return payeeName;
	}
	
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	
	public String getMerchantUserId() {
		return merchantUserId;
	}
	
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}
	
	public String getRefundStatuse() {
		return refundStatuse;
	}
	
	public void setRefundStatuse(String refundStatuse) {
		this.refundStatuse = refundStatuse;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getRefundReason() {
		return refundReason;
	}
	
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	
	public String getRefundMemo() {
		return refundMemo;
	}
	
	public void setRefundMemo(String refundMemo) {
		this.refundMemo = refundMemo;
	}
	
	public Date getRefundTime() {
		return refundTime;
	}
	
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}
	
}
