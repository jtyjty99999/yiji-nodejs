/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月17日 下午2:09:30 创建
 */
package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年11月17日
 */

public class OpenApiUserBaseInfo implements Serializable{
	
	private static final long serialVersionUID = -6582187006254893301L;

	/** 用户ID */
	@OpenApiField(desc="用户ID",constraint="用户ID",demo="20150519020005491913")
	private String userId;
	
	/** 用户名 */
	@OpenApiField(desc="用户名",constraint="用户名",demo="admin")
	private String userName;
	
	/** 真实姓名 */
	@OpenApiField(desc="用户真实姓名",constraint="用户真实姓名",demo="张三")
	private String realName;
	
	/** 外部用户ID */
	@OpenApiField(desc="外部用户ID",constraint="外部用户ID",demo="20150519020005491913")
	private String outUserId;
	
	/** 可用余额 */
	@OpenApiField(desc="可用余额",constraint="可用余额",demo="6.66")
	private Money balance;
	
	/** 不可用余额 */
	@OpenApiField(desc="不可用余额",constraint="不可用余额",demo="6.66")
	private Money unbalance;
	
	/** 用户状态 */
	@OpenApiField(desc="用户状态",constraint="用户状态",demo="created")
	private String userStatus;
	
	/** 创建日期 */
	@OpenApiField(desc="创建日期",constraint="创建日期",demo="20151111")
	private long createDate;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getOutUserId() {
		return this.outUserId;
	}

	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public Money getBalance() {
		return this.balance;
	}

	public void setBalance(Money balance) {
		this.balance = balance;
	}

	public Money getUnbalance() {
		return this.unbalance;
	}

	public void setUnbalance(Money unbalance) {
		this.unbalance = unbalance;
	}

	public String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public long getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}	
}

    