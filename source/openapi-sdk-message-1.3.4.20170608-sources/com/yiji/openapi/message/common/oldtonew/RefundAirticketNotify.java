/*
        * www.yiji.com Inc.
        * Copyright (c) 2014 All Rights Reserved.
        */

/*
* 修订记录：
* wkeduo 下午3:35:58 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import com.yiji.openapi.message.common.oldtonew.info.RefundDetailApiInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */
@Deprecated
@OpenApiMessage(service = "refund_airticket", type = ApiMessageType.Notify)
public class RefundAirticketNotify extends ApiNotify {

	@OpenApiField(desc = "退款金额", demo = "1.11")
	private Money refundAmount;

	@OpenApiField(desc = "易极付订单编号", demo = "2016012900547356")
	private String easyLifeOrderNo;

	@OpenApiField(desc = "退款明细", demo = "xxx")
	private List<RefundDetailApiInfo> refundDetail;

	public Money getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(Money refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getEasyLifeOrderNo() {
		return this.easyLifeOrderNo;
	}

	public void setEasyLifeOrderNo(String easyLifeOrderNo) {
		this.easyLifeOrderNo = easyLifeOrderNo;
	}

	public List<RefundDetailApiInfo> getRefundDetail() {
		return this.refundDetail;
	}

	public void setRefundDetail(List<RefundDetailApiInfo> refundDetail) {
		this.refundDetail = refundDetail;
	}

}
