/*
        * www.yiji.com Inc.
        * Copyright (c) 2014 All Rights Reserved.
        */

/*
* 修订记录：
* wkeduo 下午3:35:29 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.oldtonew.info.RefundDetailApiInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */
@Deprecated
@OpenApiMessage(service = "refund_airticket", type = ApiMessageType.Request)
public class RefundAirticketRequest extends ApiRequest {

	/** 易极付订单编号 */
	@NotBlank(message = "易极付订单编号不能为空")
	@OpenApiField(desc = "易极付订单编号", demo = "2016012900547356")
	private String easyLifeOrderNo;

	/** 退款金额 */
	@NotNull(message = "退款金额不能为空")
	@OpenApiField(desc = "退款金额", constraint="",demo = "6.66")
	private Money refundAmount;

	/** 退款明细,出票后退款不能为空 */
	@Valid
	@OpenApiField(desc = "退款明细", demo = "xxx")
	List<RefundDetailApiInfo> refundDetail;

	public String getEasyLifeOrderNo() {
		return this.easyLifeOrderNo;
	}

	public void setEasyLifeOrderNo(String easyLifeOrderNo) {
		this.easyLifeOrderNo = easyLifeOrderNo;
	}

	public Money getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(Money refundAmount) {
		this.refundAmount = refundAmount;
	}

	public List<RefundDetailApiInfo> getRefundDetail() {
		return this.refundDetail;
	}

	public void setRefundDetail(List<RefundDetailApiInfo> refundDetail) {
		this.refundDetail = refundDetail;
	}

}
