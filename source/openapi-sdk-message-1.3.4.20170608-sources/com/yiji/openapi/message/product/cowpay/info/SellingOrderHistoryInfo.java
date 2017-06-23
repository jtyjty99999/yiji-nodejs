/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:02:52 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import java.io.Serializable;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class SellingOrderHistoryInfo implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 操作员
	 */
	private String operatorName;
	
	/**
	 * 操作内容
	 */
	private String operateContent;
	
	/**
	 * 操作时间
	 */
	private String operateTime;
	
	/**
	 * 备注
	 */
	private String memo;
	
	public String getOperatorName() {
		return operatorName;
	}
	
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	
	public String getOperateContent() {
		return operateContent;
	}
	
	public void setOperateContent(String operateContent) {
		this.operateContent = operateContent;
	}
	
	public String getOperateTime() {
		return operateTime;
	}
	
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
}

    