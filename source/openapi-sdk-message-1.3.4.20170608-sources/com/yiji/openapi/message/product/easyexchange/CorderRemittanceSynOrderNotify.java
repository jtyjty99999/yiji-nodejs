package com.yiji.openapi.message.product.easyexchange;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;


@OpenApiMessage(service = "corderRemittanceSynOrder", type = ApiMessageType.Notify)
public class CorderRemittanceSynOrderNotify extends ApiNotify {
	
	@OpenApiField(desc = "跨境付款批次号")
	private String remittranceBatchNo;
	
	@OpenApiField(desc = "处理结果列表")
	private String resultInfos;
	
	/**
	 * @return the remittranceBatchNo
	 */
	public String getRemittranceBatchNo() {
		return remittranceBatchNo;
	}
	
	/**
	 * @param remittranceBatchNo the remittranceBatchNo to set
	 */
	public void setRemittranceBatchNo(String remittranceBatchNo) {
		this.remittranceBatchNo = remittranceBatchNo;
	}
	
	/**
	 * @return the resultInfos
	 */
	public String getResultInfos() {
		return resultInfos;
	}
	
	/**
	 * @param resultInfos the resultInfos to set
	 */
	public void setResultInfos(String resultInfos) {
		this.resultInfos = resultInfos;
	}
	
}
