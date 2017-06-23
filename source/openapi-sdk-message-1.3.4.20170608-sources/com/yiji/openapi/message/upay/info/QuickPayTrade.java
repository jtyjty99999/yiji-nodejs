/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月8日 下午6:31:38 创建
 */
package com.yiji.openapi.message.upay.info;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 无卡支付交易记录
 * 
 * @author zhangpu
 * @date 2014年3月7日
 */
public class QuickPayTrade implements Serializable {
	
	/**
	 * UID
	 */
	private static final long serialVersionUID = 3930660293163166684L;
	
	/**
	 * [必填]请求订单号
	 */
	private String orderNo;
	
	/**
	 * [必填]服务器端交易号
	 */
	private String tradeNo;
	
	/**
	 * [可选]接入方编码(收款方)
	 */
	private String partnerCode;
	
	/**
	 * [可选]付款用户ID
	 */
	private String userId;
	
	/**
	 * [可选]支付金额
	 */
	private Money amount;
	
	/**
	 * 交易受理时间
	 */
	private Date applyTime;
	
	/**
	 * 交易处理时间
	 */
	private Date transTime;
	
	/**
	 * 状态 {-1:已退款,1:已受理,2:管控拒绝,5:交易失败, 10:成功}
	 */
	private String status;
	
	/**
	 * 签约编号
	 */
	private String subscribeCode;
	
	/**
	 * 分润信息项
	 */
	private List<QuickPaySubTradeInfo> subTrades;
	
	/**
	 * [可选]会话
	 */
	private String context;
	
	public String getOrderNo() {
		return orderNo;
	}
	
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getPartnerCode() {
		return partnerCode;
	}
	
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
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
	
	public String getSubscribeCode() {
		return subscribeCode;
	}
	
	public void setSubscribeCode(String subscribeCode) {
		this.subscribeCode = subscribeCode;
	}
	
	public String getContext() {
		return context;
	}
	
	public void setContext(String context) {
		this.context = context;
	}
	
	public List<QuickPaySubTradeInfo> getSubTrades() {
		return subTrades;
	}
	
	public void setSubTrades(List<QuickPaySubTradeInfo> subTrades) {
		this.subTrades = subTrades;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}


    