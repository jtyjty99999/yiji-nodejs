/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2014-12-16 16:23 创建
 *
 */
package com.yiji.openapi.message.mpay.common;

import java.util.Map;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mpayQueryUserInfo", type = ApiMessageType.Response)
public class MpayQueryUserInfoResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户编号",constraint="用户编号",demo="20150619010000072320")
	private String userId;
	
	@OpenApiField(desc = "用户名",constraint="用户名",demo="admin")
	private String userName;
	
	@OpenApiField(desc = "真实姓名",constraint="真实姓名",demo="admin")
	private String realName;
	
	@OpenApiField(desc = "移动绑定手机号",constraint="移动绑定手机号",demo="13521401254")
	private String mobileNo;
	
	@OpenApiField(desc = "易手富密码状态-1开，0关",constraint="易手富密码状态-1开，0关",demo="0")
	private int mPayStatus;
	
	@OpenApiField(desc = "实名认证状态",constraint="实名认证状态",demo="UNAUTHERIZED")
	private String certifyStatus;
	
	@OpenApiField(desc = "实名认证等级",constraint="实名认证等级",demo="NO_RANK")
	private String certifyRank;
	
	@OpenApiField(desc = "余额",constraint="余额",demo="66.66")
	private Money balance;
	
	@OpenApiField(desc = "用户状态",constraint="用户状态",demo="UNACTIVATED")
	private String userStatus;
	
	@OpenApiField(desc = "用户运行状态",constraint="用户运行状态",demo="NOMARL")
	private String runtimeStatus;
	
	@OpenApiField(desc = "冻结金额",constraint="冻结金额",demo="66.66")
	private Money freezeAmount;
	
	@OpenApiField(desc = "扩展信息",constraint="扩展信息",demo="{easylife=0,cowpay=0}")
	private Map<String, String> extData;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public int getmPayStatus() {
		return mPayStatus;
	}
	
	public void setmPayStatus(int mPayStatus) {
		this.mPayStatus = mPayStatus;
	}
	
	public String getCertifyStatus() {
		return certifyStatus;
	}
	
	public void setCertifyStatus(String certifyStatus) {
		this.certifyStatus = certifyStatus;
	}
	
	public String getCertifyRank() {
		return certifyRank;
	}
	
	public void setCertifyRank(String certifyRank) {
		this.certifyRank = certifyRank;
	}
	
	public Money getBalance() {
		return balance;
	}
	
	public void setBalance(Money balance) {
		this.balance = balance;
	}
	
	public String getUserStatus() {
		return userStatus;
	}
	
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	
	public String getRuntimeStatus() {
		return runtimeStatus;
	}
	
	public void setRuntimeStatus(String runtimeStatus) {
		this.runtimeStatus = runtimeStatus;
	}
	
	public Money getFreezeAmount() {
		return freezeAmount;
	}
	
	public void setFreezeAmount(Money freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	
	public Map<String, String> getExtData() {
		return extData;
	}
	
	public void setExtData(Map<String, String> extData) {
		this.extData = extData;
	}
	
}
