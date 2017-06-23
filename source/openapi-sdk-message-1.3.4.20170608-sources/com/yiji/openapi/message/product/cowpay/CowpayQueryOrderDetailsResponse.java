/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-17 17:31 创建
 *
 */
package com.yiji.openapi.message.product.cowpay;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "cowpayQueryOrderDetails", type = ApiMessageType.Response)
public class CowpayQueryOrderDetailsResponse extends ApiResponse {
	
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "交易订单号")
	private String tradeOrderNo;
	
	@OpenApiField(desc = "付款人ID")
	private String fUserId;
	
	@OpenApiField(desc = "付款人名字")
	private String fUserRealName;
	
	@OpenApiField(desc = "收款人ID")
	private String sUserId;
	
	@OpenApiField(desc = "收款人名字")
	private String sUserRealName;
	
	@OpenApiField(desc = "金额")
	private Money money;
	
	@OpenApiField(desc = "手续费")
	private Money chargeMoney;
	
	@OpenApiField(desc = "状态(-2取消,-1失败,0付款中,1成功)")
	private Integer state = 0;
	
	@OpenApiField(desc = "类型(1付款单,2收款单)")
	private Integer type = 1;
	
	@OpenApiField(desc = "描述")
	private String memo;
	
	@OpenApiField(desc = "单据号")
	private String documentsNo;
	
	@OpenApiField(desc = "附件地址")
	private String attachmentUrl;
	
	@OpenApiField(desc = "添加时间")
	private Date rowAddTime;
	
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
	
	public Date getRowAddTime() {
		return rowAddTime;
	}
	
	public void setRowAddTime(Date rowAddTime) {
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
}
