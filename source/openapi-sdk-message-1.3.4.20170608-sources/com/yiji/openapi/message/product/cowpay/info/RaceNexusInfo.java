/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:25:39 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import com.yiji.openapi.message.product.yzz.info.OrderBase;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class RaceNexusInfo extends OrderBase{
	private static final long serialVersionUID = 1L;
	/**
	 * ID
	 */
	private Long id;
	/**
	 * 收款人ID
	 */
	private String sUserId;
	/**
	 * 收款人用户名
	 */
	private String sUserName;
	/**
	 * 收款人名字
	 */
	private String sUserRealName;
	/**
	 * 付款人ID
	 */
	private String fUserId;
	/**
	 * 付款人用户名
	 */
	private String fUserName;
	/**
	 * 付款人名字
	 */
	private String fUserRealName;
	/**
	 * 付款人身份证号码
	 */
	private String fCertNo;
	/**
	 * 付款人联系手机
	 */
	private String fMobile;
	/**
	 * 1付,2收,3全
	 */
	private Integer type = 1;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getsUserId() {
		return sUserId;
	}
	
	public void setsUserId(String sUserId) {
		this.sUserId = sUserId;
	}
	
	public String getsUserName() {
		return sUserName;
	}
	
	public void setsUserName(String sUserName) {
		this.sUserName = sUserName;
	}
	
	public String getsUserRealName() {
		return sUserRealName;
	}
	
	public void setsUserRealName(String sUserRealName) {
		this.sUserRealName = sUserRealName;
	}
	
	public String getfUserId() {
		return fUserId;
	}
	
	public void setfUserId(String fUserId) {
		this.fUserId = fUserId;
	}
	
	public String getfUserName() {
		return fUserName;
	}
	
	public void setfUserName(String fUserName) {
		this.fUserName = fUserName;
	}
	
	public String getfUserRealName() {
		return fUserRealName;
	}
	
	public void setfUserRealName(String fUserRealName) {
		this.fUserRealName = fUserRealName;
	}
	
	public String getfCertNo() {
		return fCertNo;
	}
	
	public void setfCertNo(String fCertNo) {
		this.fCertNo = fCertNo;
	}
	
	public String getfMobile() {
		return fMobile;
	}
	
	public void setfMobile(String fMobile) {
		this.fMobile = fMobile;
	}
	
	public Integer getType() {
		return type;
	}
	
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * 
	 * @see com.yiji.openapi.message.product.yzz.info.Order#check()
	 */
	public void check() {
	}
}

    