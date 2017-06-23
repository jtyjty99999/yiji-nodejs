/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * Administrator 2015年8月31日 下午3:49:23 创建
 */
    
package com.yiji.openapi.message.common.trade.info;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 *
 *
 * @author Administrator
 *
 */

public class ExtInfoClause {
	/** 买家备注 */
	@Length(max = 128, min = 1)
	@OpenApiField(desc = "买家备注",demo = "买电脑")
	private String buyerMarkerMemo;
	
	/** 卖家备注 */
	@Length(max = 128, min = 1)
	@OpenApiField(desc = "卖家备注",demo = "卖电脑")
	private String sellerMarkerMemo;

	public String getBuyerMarkerMemo() {
		return this.buyerMarkerMemo;
	}

	public void setBuyerMarkerMemo(String buyerMarkerMemo) {
		this.buyerMarkerMemo = buyerMarkerMemo;
	}

	public String getSellerMarkerMemo() {
		return this.sellerMarkerMemo;
	}

	public void setSellerMarkerMemo(String sellerMarkerMemo) {
		this.sellerMarkerMemo = sellerMarkerMemo;
	}
}

    