/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:42:18 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import com.yiji.openapi.message.product.yzz.info.OrderBase;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class QftUserInfo extends OrderBase{
	private static final long serialVersionUID = 1L;

	/**
	 * 用户userId *
	 */
	private String userId;
	
	/**
	 * 用户登录名 *
	 */
	private String userName;
	
	/**
	 * 用户真实姓名 *
	 */
	private String userRealName;
	
	/**
	 * 用户类型 {P：个人用户;B:企业用户} *
	 */
	private String userType;
	
	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}
	
	public String getUserRealName() {
		return userRealName;
	}
	
	public String getUserType() {
		return userType;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * 
	 * @see com.yiji.openapi.message.product.yzz.info.Order#check()
	 */
	public void check() {
	}
}

    