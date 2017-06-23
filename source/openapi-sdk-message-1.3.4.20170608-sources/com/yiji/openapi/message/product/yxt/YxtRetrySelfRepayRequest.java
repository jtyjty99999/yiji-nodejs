/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年10月10日 下午2:53:22 创建
 */
package com.yiji.openapi.message.product.yxt;

import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.product.yxt.info.ExtraSettleItemInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 *
 */
@OpenApiMessage(service = "yxtRetrySelfRepay", type = ApiMessageType.Request)
public class YxtRetrySelfRepayRequest extends ApiRequest{
	@NotEmpty
	@Size(min = 16, max = 40)
	@OpenApiField(desc = "订单号", constraint = "订单号长度为16-40字节",demo="1512141515459051518073443")
	private String installmentOrderNo;

	/**
	 * 总金额
	 */
	@OpenApiField(desc = "总金额",demo = "88.66")
	private Money totalAmount = new Money();
	/**
	 * 滞纳金
	 */
	@OpenApiField(desc = "滞纳金",demo = "88.66")
	private Money overdueFineAmount = new Money();

	@OpenApiField(desc = "额外结算列表")
	private List<ExtraSettleItemInfo> extraSettleItemInfos;

	@OpenApiField(desc = "行为", constraint = "当extraSettleItemAction=MODIFY且 额外结算列表不传时判定为删除之前的额外结算规则")
	private String extraSettleItemAction;

	public List<ExtraSettleItemInfo> getExtraSettleItemInfos() {
		return extraSettleItemInfos;
	}

	public void setExtraSettleItemInfos(List<ExtraSettleItemInfo> extraSettleItemInfos) {
		this.extraSettleItemInfos = extraSettleItemInfos;
	}

	public String getExtraSettleItemAction() {
		return extraSettleItemAction;
	}

	public void setExtraSettleItemAction(String extraSettleItemAction) {
		this.extraSettleItemAction = extraSettleItemAction;
	}

	public Money getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Money getOverdueFineAmount() {
		return overdueFineAmount;
	}

	public void setOverdueFineAmount(Money overdueFineAmount) {
		this.overdueFineAmount = overdueFineAmount;
	}

	public String getInstallmentOrderNo() {
		return this.installmentOrderNo;
	}

	public void setInstallmentOrderNo(String installmentOrderNo) {
		this.installmentOrderNo = installmentOrderNo;
	}
}
