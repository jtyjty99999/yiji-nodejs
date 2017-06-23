package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import com.yiji.openapi.message.product.cowpay.info.RaceNexusInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/4/18.
 */
@OpenApiMessage(service = "queryPaymentRelationship", type = ApiMessageType.Response)
public class QueryPaymentRelationshipResponse extends ApiResponse {
	@OpenApiField(desc = "付款关系列表")
	List<RaceNexusInfo> raceNexusInfoList;
	
	public List<RaceNexusInfo> getRaceNexusInfoList() {
		return raceNexusInfoList;
	}
	
	public void setRaceNexusInfoList(List<RaceNexusInfo> raceNexusInfoList) {
		this.raceNexusInfoList = raceNexusInfoList;
	}
}
