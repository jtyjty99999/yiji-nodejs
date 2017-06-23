/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 上午10:04:56 创建
 */
package com.yiji.openapi.message.product.yzz.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public abstract class OrderBase extends TransactionContext implements Order{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 统一流水id
	 */
	@NotNull
	@Length(min = 35, max = 35)
	private String gid;
	
	public String getGid() {
		return gid;
	}
	
	/**
	 * 
	 * @param gid 为了保证gid全局唯一,请使用 {@link com.yjf.common.id.GID#newGID()}
	 */
	public void setGid(String gid) {
		this.gid = gid;
	}
}

    