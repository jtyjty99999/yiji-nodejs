package com.yiji.openapi.message.product.yzz;

import java.util.List;

import com.yiji.openapi.message.product.yzz.info.QueryClaimsTransferInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "yzzClaimsTransferQuery", type = ApiMessageType.Response)
public class YzzClaimsTransferQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "转让列表")
	private List<QueryClaimsTransferInfo> claimsTransferInfos;
	
	public List<QueryClaimsTransferInfo> getClaimsTransferInfos() {
		return claimsTransferInfos;
	}
	
	public void setClaimsTransferInfos(List<QueryClaimsTransferInfo> claimsTransferInfos) {
		this.claimsTransferInfos = claimsTransferInfos;
	}
	
}
