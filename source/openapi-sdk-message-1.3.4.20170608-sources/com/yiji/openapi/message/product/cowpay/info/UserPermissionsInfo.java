/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:34:17 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import com.yiji.openapi.message.product.yzz.info.OrderBase;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class UserPermissionsInfo extends OrderBase{
	private static final long serialVersionUID = 1L;
	/**
	 * 英文名 *
	 */
	private String enName;
	/**
	 * 中文名 *
	 */
	private String cnName;
	/**
	 * 状态{1:有效, 0：无效} *
	 */
	private int status;
	
	public String getEnName() {
		return enName;
	}
	
	public String getCnName() {
		return cnName;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setEnName(String enName) {
		this.enName = enName;
	}
	
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * 
	 * @see com.yiji.openapi.message.product.yzz.info.Order#check()
	 */
	public void check() {
	}
}

    