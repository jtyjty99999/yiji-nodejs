/*
        * www.yiji.com Inc.
        * Copyright (c) 2014 All Rights Reserved.
        */

/*
* 修订记录：
* wkeduo 下午4:12:41 创建
*/

package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * copy from com.yjf.easylife.service.order.RefundDetail
 *
 * @author wkeduo
 *
 * @see com.yjf.easylife.service.order.RefundDetail
 *
 */

public class RefundDetailApiInfo implements Serializable {

	private static final long serialVersionUID = -6239262288440377813L;

	/** 退款票号,出票后退款不能为空 */
	@OpenApiField(desc = "退款票号", demo = "2016012900547356")
	private String easyLifeOutOrderDetailNo;

	/** 退款票面价格基数 出票后退款不能为空 */
	@OpenApiField(desc = "退款票面价格基数", demo = "1.11")
	private Money refundBaseAmount;

	/** 易极付订单明细号 出票后退款不能为空 */
	@OpenApiField(desc = "易极付订单明细号", demo = "2016012900547356")
	private String easyLifeOrderDetailNo;

	public String getEasyLifeOutOrderDetailNo() {
		return easyLifeOutOrderDetailNo;
	}

	public void setEasyLifeOutOrderDetailNo(String easyLifeOutOrderDetailNo) {
		this.easyLifeOutOrderDetailNo = easyLifeOutOrderDetailNo;
	}

	public Money getRefundBaseAmount() {
		return refundBaseAmount;
	}

	public void setRefundBaseAmount(Money refundBaseAmount) {
		this.refundBaseAmount = refundBaseAmount;
	}

	public String getEasyLifeOrderDetailNo() {
		return easyLifeOrderDetailNo;
	}

	public void setEasyLifeOrderDetailNo(String easyLifeOrderDetailNo) {
		this.easyLifeOrderDetailNo = easyLifeOrderDetailNo;
	}

}
