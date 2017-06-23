/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年10月16日 下午3:07:11 创建
 */
package com.yiji.openapi.message.mpay.common.info;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年10月16日
 */

public class OpenApiTransaction implements java.io.Serializable {
	
private static final long serialVersionUID = 1L;
	
	@OpenApiField(desc = "交易号",constraint="交易号",demo="20151016000124130517")
	private String tradeNo;
	
	@OpenApiField(desc = "外部订单号",constraint="外部订单号",demo="20150619010000072320")
	private String outOrderNo;
	
	@OpenApiField(desc = "交易类型",constraint="交易类型",demo="DEPOSIT")
	private String transactionType;
	
	@OpenApiField(desc = "付款用户ID",constraint="付款用户ID",demo="20150619010000072320")
	private String userId;
	
	@OpenApiField(desc = "支付金额",constraint="支付金额",demo="66.66")
	private Money amount;
	
	@OpenApiField(desc = "交易受理时间",constraint="交易受理时间",demo="2015-10-10 10:10:56")
	private Date applyTime;
	
	@OpenApiField(desc = "交易处理时间",constraint="交易处理时间",demo="2015-10-10 10:10:56")
	private Date transTime;
	
	@OpenApiField(desc = "状态",constraint="状态",demo="DEDUCT_SUCCESS")
	private String status;
	
	@OpenApiField(desc = "交易状态中文名",constraint="交易状态中文名",demo="提现处理中")
	private String statusName;
	
	@OpenApiField(desc = "交易对方用户编号",constraint="交易对方用户编号",demo="20151016094348411000")
	private String tradeUserId;
	
	@OpenApiField(desc = "交易对方用户名",constraint="交易对方用户名",demo="admin")
	private String tradeUserName;
	
	@OpenApiField(desc = "交易对方真实姓名",constraint="交易对方真实姓名",demo="张三")
	private String tradeUserRealName;
	
	@OpenApiField(desc = "绑卡编号",constraint="绑卡编号",demo="20151016094348411000")
	private String pactNo;
	
	@OpenApiField(desc = "银行简称",constraint="银行简称",demo="BOC")
	private String bankCode;
	
	@OpenApiField(desc = "银行卡号",constraint="银行卡号",demo="6540 3250 1542 4685")
	private String bankCard;
	
	@OpenApiField(desc = "交易备注",constraint="交易备注",demo="交易成功")
	private String remark;
	
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
	
	public String getTransactionType() {
		return transactionType;
	}
	
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public Date getApplyTime() {
		return applyTime;
	}
	
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	
	public Date getTransTime() {
		return transTime;
	}
	
	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatusName() {
		return statusName;
	}
	
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	
	public String getTradeUserId() {
		return tradeUserId;
	}
	
	public void setTradeUserId(String tradeUserId) {
		this.tradeUserId = tradeUserId;
	}
	
	public String getTradeUserName() {
		return tradeUserName;
	}
	
	public void setTradeUserName(String tradeUserName) {
		this.tradeUserName = tradeUserName;
	}
	
	public String getTradeUserRealName() {
		return tradeUserRealName;
	}
	
	public void setTradeUserRealName(String tradeUserRealName) {
		this.tradeUserRealName = tradeUserRealName;
	}
	
	public String getPactNo() {
		return pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankCard() {
		return bankCard;
	}
	
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
	
	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
}

    