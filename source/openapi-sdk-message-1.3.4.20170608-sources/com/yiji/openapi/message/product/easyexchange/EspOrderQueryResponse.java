package com.yiji.openapi.message.product.easyexchange;

import java.util.List;

import com.yiji.openapi.message.product.easyexchange.infos.EspOrderInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "espOrderQuery", type = ApiMessageType.Response)
public class EspOrderQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "总记录数")
	private long count;
	
	@OpenApiField(desc = "订单信息列表")
	private List<EspOrderInfo> espOrderInfoList;
	
	public long getCount() {
		return count;
	}
	
	public void setCount(long count) {
		this.count = count;
	}
	
	public List<EspOrderInfo> getEspOrderInfoList() {
		return espOrderInfoList;
	}
	
	public void setEspOrderInfoList(List<EspOrderInfo> espOrderInfoList) {
		this.espOrderInfoList = espOrderInfoList;
	}
	
}