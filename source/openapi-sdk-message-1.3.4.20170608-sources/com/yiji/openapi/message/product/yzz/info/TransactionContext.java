/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 上午10:06:19 创建
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

public abstract class TransactionContext {
	/**
	 * 易极为商户分配的卡号(cardNo), 必填
	 */
	@NotNull
	@Length(min = 20, max = 20)
	private String partnerId;
	/**
	 * 外部商户请求的交易订单号，必填
	 */
	@NotNull
	@Length(min = 1, max = 64)
	private String merchOrderNo;

	public String getPartnerId() {
		return partnerId;
	}
	
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	
	public String getMerchOrderNo() {
		return merchOrderNo;
	}
	
	public void setMerchOrderNo(String merchOrderNo) {
		this.merchOrderNo = merchOrderNo;
	}
}

    