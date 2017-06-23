/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:19:33 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.message.product.yzz.info.OrderBase;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class RaceOrder extends OrderBase{
	private static final long serialVersionUID = 1L;
	/**
	 * 外部订单号
	 */
	@NotNull(message = "外部订单号不能为空")
	private String outOrderNo;
	/**
	 * 交易订单号
	 */
	private String tradeOrderNo;
	/**
	 * 付款人ID
	 */
	@NotNull(message = "付款人ID不能为空")
	private String fUserId;
	/**
	 * 付款人名字
	 */
	private String fUserRealName;
	/**
	 * 收款人ID
	 */
	@NotNull(message = "收款人ID不能为空")
	private String sUserId;
	/**
	 * 收款人名字
	 */
	private String sUserRealName;
	/**
	 * 金额
	 */
	//    @Min(value = 1, message = "金额不能小于1")
	private Money money = new Money(0);
	/**
	 * 手续费
	 */
	private Money chargeMoney = new Money(0);
	/**
	 * 状态(-2取消,-1失败,0付款中,1成功)
	 */
	private Integer state = 0;
	/**
	 * 类型(1付款单,2收款单)
	 */
	private Integer type = 1;
	/**
	 * 描述
	 */
	private String memo;
	
	/**
	 * 单据号
	 */
	private String documentsNo;
	/**
	 * 附件地址
	 */
	private String attachmentUrl;
	
	/**
	 * 添加时间
	 */
	private String rowAddTime;
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getTradeOrderNo() {
		return tradeOrderNo;
	}
	
	public void setTradeOrderNo(String tradeOrderNo) {
		this.tradeOrderNo = tradeOrderNo;
	}
	
	public String getfUserId() {
		return fUserId;
	}
	
	public void setfUserId(String fUserId) {
		this.fUserId = fUserId;
	}
	
	public String getfUserRealName() {
		return fUserRealName;
	}
	
	public void setfUserRealName(String fUserRealName) {
		this.fUserRealName = fUserRealName;
	}
	
	public String getsUserId() {
		return sUserId;
	}
	
	public void setsUserId(String sUserId) {
		this.sUserId = sUserId;
	}

	public String getsUserRealName() {
		return sUserRealName;
	}
	
	public void setsUserRealName(String sUserRealName) {
		this.sUserRealName = sUserRealName;
	}
	
	public Money getMoney() {
		return money;
	}
	
	public void setMoney(Money money) {
		this.money = money;
	}
	
	public Money getChargeMoney() {
		return chargeMoney;
	}
	
	public void setChargeMoney(Money chargeMoney) {
		this.chargeMoney = chargeMoney;
	}
	
	public Integer getState() {
		return state;
	}
	
	public void setState(Integer state) {
		this.state = state;
	}
	
	public Integer getType() {
		return type;
	}
	
	public void setType(Integer type) {
		this.type = type;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getRowAddTime() {
		return rowAddTime;
	}
	
	public void setRowAddTime(String rowAddTime) {
		this.rowAddTime = rowAddTime;
	}
	
	public String getDocumentsNo() {
		return documentsNo;
	}
	
	public void setDocumentsNo(String documentsNo) {
		this.documentsNo = documentsNo;
	}
	
	public String getAttachmentUrl() {
		return attachmentUrl;
	}
	
	public void setAttachmentUrl(String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}

	/**
	 * 
	 * @see com.yiji.openapi.message.product.yzz.info.Order#check()
	 */
	public void check() {
	}
}

    