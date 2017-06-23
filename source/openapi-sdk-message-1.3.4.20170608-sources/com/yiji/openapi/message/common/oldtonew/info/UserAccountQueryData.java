/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月23日 下午3:57:18 创建
 */
package com.yiji.openapi.message.common.oldtonew.info;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.enums.ApiServiceResultCode;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月23日
 */

public class UserAccountQueryData {
	
	@OpenApiField(desc="用户ID",constraint="用户ID",demo="20150519020005491913")
	private String orderNo;
	
	@OpenApiField(desc="用户ID",constraint="用户ID",demo="20150519020005491913")
	private String success;
	
	@OpenApiField(desc="用户ID",constraint="用户ID",demo="20150519020005491913")
	private String signType;
	
	@OpenApiField(desc="用户ID",constraint="用户ID",demo="20150519020005491913")
	private String channelId;
	
	@NotEmpty
	@OpenApiField(desc = "服务响应编码", constraint = "必填")
	private String resultCode = ApiServiceResultCode.SUCCESS.getCode();
	
	@NotEmpty
	@OpenApiField(desc = "服务响应信息")
	private String resultMessage = ApiServiceResultCode.SUCCESS.getMessage();
	
	/** 账户号*/
	@NotBlank
	@OpenApiField(desc="账户号",constraint="账户号",demo="20150710020006388431")
	private String accountNo;
	
	/** 用户ID*/
	@NotBlank
	@OpenApiField(desc="用户ID",constraint="用户ID",demo="20150710020006388431")
	private String userId;
	
	/** 帐务别名*/
	@NotBlank
	@OpenApiField(desc="帐务别名",constraint="帐务别名",demo="易极付")
	private String accountAlias;
	
	/** 帐务号科目*/
	@NotBlank
	@OpenApiField(desc="帐务号科目",constraint="帐务号科目",demo="yjf20117")
	private String accountTitleId;
	
	/** 科目ID*/
	@NotBlank
	@OpenApiField(desc="科目ID",constraint="科目ID",demo="易周转平台商户")
	private String titleName;
	
	/** 币种*/
	@NotBlank
	@OpenApiField(desc="币种",constraint="币种",demo="人民币")
	private String currency;
	
	/** 账户余额*/
	@NotBlank
	@OpenApiField(desc="账户余额",constraint="账户余额",demo="66.66")
	private String balance;
	
	/** 账户类型*/
	@NotBlank
	@OpenApiField(desc="账户类型",constraint="账户类型",demo="商户")
	private String accountType;
	
	/** 账户状态*/
	@NotBlank
	@OpenApiField(desc="账户状态",constraint="账户状态",demo="激活")
	private String status;
	
	/**  账户支付模型*/
	@NotBlank
	@OpenApiField(desc=" 账户支付模型",constraint=" 账户支付模型",demo="1111111111111")
	private String paymodel;
	
	/** 账户信用额度*/
	@NotBlank
	@OpenApiField(desc="账户信用额度",constraint="账户信用额度",demo="66.66")
	private String creditAmount;
	
	/** 账户可用信用额度*/
	@NotBlank
	@OpenApiField(desc="账户可用信用额度",constraint="账户可用信用额度",demo="66.66")
	private String creditBalance;
	
	/** 账户冻结额度*/
	@NotBlank
	@OpenApiField(desc="账户冻结额度",constraint="账户冻结额度",demo="66.66")
	private String freezeAmount;
	
	/**系统冻结额度*/
	@NotBlank
	@OpenApiField(desc="系统冻结额度",constraint="系统冻结额度",demo="6.66")
	private String systemAmount;
	
	/**邮箱*/
	@NotBlank
	@OpenApiField(desc="邮箱",constraint="邮箱",demo="1156@yiji.com")
	private String email;
	
	/**用户登录名*/
	@NotBlank
	@OpenApiField(desc="用户登录名",constraint="用户登录名",demo="admin")
	private String userName;
	
	/**用户真实名称*/
	@NotBlank
	@OpenApiField(desc="用户真实名称",constraint="用户真实名称",demo="张三")
	private String realName;
	
	/**用户状态*/
	@NotBlank
	@OpenApiField(desc="用户状态",constraint="用户状态",demo="未激活")
	private String userStatus;
	
	/**用户身份类型*/
	@NotBlank
	@OpenApiField(desc="用户身份类型",constraint="用户身份类型",demo="营业执照")
	private String certType;
	
	/**证件号*/
	@NotBlank
	@OpenApiField(desc="证件号",constraint="证件号",demo="440303462569257")
	private String certNo;
	
	/**证件有效期*/
	@NotBlank
	@OpenApiField(desc="证件有效期",constraint="证件有效期",demo="Tue Dec 12 01:00:00 CST 1972")
	private String licenseValidTime;
	
	/**认证状态*/
	@NotBlank
	@OpenApiField(desc="认证状态",constraint="认证状态",demo="已认证")
	private String certifyStatus;
	
	/**运行时状态*/
	@NotBlank
	@OpenApiField(desc="运行时状态",constraint="运行时状态",demo="正常状态")
	private String runtimeStatus;
	
	@NotBlank
	@OpenApiField(desc="注册来源",constraint="注册来源",demo="易周转")
	private String registerFrom;

	@NotBlank
	@OpenApiField(desc="详细地址",constraint="详细地址",demo="重庆渝北区")
	private String address;
	
	@NotBlank
	@OpenApiField(desc="手机",constraint="手机",demo="13521021254")
	private String mobile;
	
	@NotBlank
	@OpenApiField(desc="国家",constraint="国家",demo="中国")
	private String country;
	
	@NotBlank
	@OpenApiField(desc="省份",constraint="省份",demo="重庆")
	private String province;
	
	@NotBlank
	@OpenApiField(desc="城市",constraint="城市",demo="重庆")
	private String city;

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccountAlias() {
		return this.accountAlias;
	}

	public void setAccountAlias(String accountAlias) {
		this.accountAlias = accountAlias;
	}

	public String getAccountTitleId() {
		return this.accountTitleId;
	}

	public void setAccountTitleId(String accountTitleId) {
		this.accountTitleId = accountTitleId;
	}

	public String getTitleName() {
		return this.titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBalance() {
		return this.balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymodel() {
		return this.paymodel;
	}

	public void setPaymodel(String paymodel) {
		this.paymodel = paymodel;
	}

	public String getCreditAmount() {
		return this.creditAmount;
	}

	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getCreditBalance() {
		return this.creditBalance;
	}

	public void setCreditBalance(String creditBalance) {
		this.creditBalance = creditBalance;
	}

	public String getFreezeAmount() {
		return this.freezeAmount;
	}

	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getSystemAmount() {
		return this.systemAmount;
	}

	public void setSystemAmount(String systemAmount) {
		this.systemAmount = systemAmount;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getCertType() {
		return this.certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCertNo() {
		return this.certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getLicenseValidTime() {
		return this.licenseValidTime;
	}

	public void setLicenseValidTime(String licenseValidTime) {
		this.licenseValidTime = licenseValidTime;
	}

	public String getCertifyStatus() {
		return this.certifyStatus;
	}

	public void setCertifyStatus(String certifyStatus) {
		this.certifyStatus = certifyStatus;
	}

	public String getRuntimeStatus() {
		return this.runtimeStatus;
	}

	public void setRuntimeStatus(String runtimeStatus) {
		this.runtimeStatus = runtimeStatus;
	}

	public String getRegisterFrom() {
		return this.registerFrom;
	}

	public void setRegisterFrom(String registerFrom) {
		this.registerFrom = registerFrom;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getSignType() {
		return this.signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
}

    