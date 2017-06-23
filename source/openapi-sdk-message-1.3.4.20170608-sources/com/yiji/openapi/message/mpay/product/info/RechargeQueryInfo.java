/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年11月4日 下午12:15:53 创建
 */
package com.yiji.openapi.message.mpay.product.info;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author lvchen@yiji.com
 *
 */
public class RechargeQueryInfo {
	/**
	 * 话费充值流水号
	 */
	@OpenApiField(desc = "话费充值流水号",demo = "13245678654")
	private String rechargeNo;
	
	/**
	 * 订单号
	 */
	@OpenApiField(desc = "订单号",demo = "12345648923156")
	private String orderNo;
	
	/**
	 * `话费充值状态
	 */
	@OpenApiField(desc = "话费充值状态",demo = "PAYMENT_SUCCESS")
	private String rechargeStatus;
	
	/**
	 * 话费充值状态中文显示
	 */
	@OpenApiField(desc = "话费充值状态中文显示",demo = "充值成功")
	private String rechargeStatusName;
	
	/**
	 * 用户会员ID
	 */
	@OpenApiField(desc = "用户会员ID",demo = "12345678901234567890")
	private String userId;
	
	/**
	 * 机构编号
	 */
	@OpenApiField(desc = "机构编号",demo = "12345674982")
	private String agencyCode;
	
	/**
	 * 手机号
	 */
	@OpenApiField(desc = "手机号",demo = "10086100101")
	private String mobileNo;
	
	/**
	 * `话费充值金额
	 */
	@OpenApiField(desc = "话费充值金额",demo = "88.66")
	private Money paymentAmount;
	
	/**
	 * `实际金额，当有优惠时此金额为实际扣用户的金额
	 */
	@OpenApiField(desc = "实际金额",demo = "88.66")
	private Money amount;
	
	/**
	 * 用户名
	 */
	@OpenApiField(desc = "用户名",demo = "易极付")
	private String username;
	
	/**
	 * 机构名称
	 */
	@OpenApiField(desc = "机构名称",demo = "重庆易极付科技有限公司")
	private String agencyName;
	
	/**
	 * 话费充值交易创建时间
	 */
	@OpenApiField(desc = "话费充值交易创建时间",demo = "2015-10-12 05:45:12")
	private Date createTime;
	
	/**
	 * 话费充值交易更新时间
	 */
	@OpenApiField(desc = "话费充值交易更新时间",demo = "2015-10-12 05:45:12")
	private Date updateTime;
	
	/**
	 * `充值结果码
	 */
	@OpenApiField(desc = "resultCode",demo = "EXECUTE_SUCCESS")
	private String resultCode;
	
	/**
	 * 充值结果信息
	 */
	@OpenApiField(desc = "充值结果信息",demo = "充值成功")
	private String resultMessage;
	
	/**
	 * 备注信息
	 */
	@OpenApiField(desc = "备注信息",demo = "手机充值")
	private String memo;
	
	public String getRechargeNo() {
		return this.rechargeNo;
	}
	
	public void setRechargeNo(String rechargeNo) {
		this.rechargeNo = rechargeNo;
	}
	
	public String getOrderNo() {
		return this.orderNo;
	}
	
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	public String getRechargeStatus() {
		return this.rechargeStatus;
	}
	
	public void setRechargeStatus(String rechargeStatus) {
		this.rechargeStatus = rechargeStatus;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getAgencyCode() {
		return this.agencyCode;
	}
	
	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}
	
	public String getMobileNo() {
		return this.mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public Money getPaymentAmount() {
		return this.paymentAmount;
	}
	
	public void setPaymentAmount(Money paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getAgencyName() {
		return this.agencyName;
	}
	
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getUpdateTime() {
		return this.updateTime;
	}
	
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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
	
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getRechargeStatusName() {
		return this.rechargeStatusName;
	}
	
	public void setRechargeStatusName(String rechargeStatusName) {
		this.rechargeStatusName = rechargeStatusName;
	}
	
	/**
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RechargeQueryInfo [rechargeNo=");
		builder.append(rechargeNo);
		builder.append(", orderNo=");
		builder.append(orderNo);
		builder.append(", rechargeStatus=");
		builder.append(rechargeStatus);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", agencyCode=");
		builder.append(agencyCode);
		builder.append(", mobileNo=");
		builder.append(mobileNo);
		builder.append(", paymentAmount=");
		builder.append(paymentAmount);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", username=");
		builder.append(username);
		builder.append(", agencyName=");
		builder.append(agencyName);
		builder.append(", createTime=");
		builder.append(createTime);
		builder.append(", updateTime=");
		builder.append(updateTime);
		builder.append(", resultCode=");
		builder.append(resultCode);
		builder.append(", resultMessage=");
		builder.append(resultMessage);
		builder.append(", memo=");
		builder.append(memo);
		builder.append("]");
		return builder.toString();
	}
	
}
