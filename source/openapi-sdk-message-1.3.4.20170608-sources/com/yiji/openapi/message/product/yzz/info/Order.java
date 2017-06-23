/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 上午10:07:17 创建
 */
package com.yiji.openapi.message.product.yzz.info;

import java.io.Serializable;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年8月9日
 */
public interface Order extends Serializable {
	
	/**
	 * 校验入参
	 */
	public void check();
	
	/**
	 * 获取统一流水号
	 * @return 统一流水号
	 */
	String getGid();
	
	/**
	 * 设置统一流水号
	 * @param gid 统一流水号
	 */
	void setGid(String gid);
}
