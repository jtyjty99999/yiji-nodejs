/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年10月14日 下午5:54:03 创建
 */
package com.yiji.openapi.message.common.transferAccounts;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.message.common.transferAccounts.info.ApiFundsQuotaZbjOrderInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2015年10月14日
 */
@OpenApiMessage(service = "commonMultiFundsQuotaCheck", type = ApiMessageType.Request)
public class CommonMultiFundsQuotaCheckRequest extends ApiRequest {
	
	@NotNull
	@OpenApiField(
			desc = "资金限额订单信息列表",
			constraint = "资金限额订单信息列表",
			demo = "[{'userId':'20150619010000072320'},{'currency':'CNY'},{'amount':'66.66'},{'operation':'TRANSFER_OUT'}]")
	private List<ApiFundsQuotaZbjOrderInfo> fundsQuotaZbjOrderInfoList;
	
	public List<ApiFundsQuotaZbjOrderInfo> getFundsQuotaZbjOrderInfoList() {
		return this.fundsQuotaZbjOrderInfoList;
	}
	
	public void setFundsQuotaZbjOrderInfoList(List<ApiFundsQuotaZbjOrderInfo> fundsQuotaZbjOrderInfoList) {
		this.fundsQuotaZbjOrderInfoList = fundsQuotaZbjOrderInfoList;
	}
}
