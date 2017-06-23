package com.yiji.openapi.message.product.easyexchange;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "corderRemittanceSynOrder", type = ApiMessageType.Response)
public class CorderRemittanceSynOrderResponse extends ApiResponse {
	
	@OpenApiField(desc = "跨境付款批次号")
	private String remittranceBatchNo;
	
	@OpenApiField(desc = "汇款状态", constraint = "processing:处理中,fail:失败")
	private String status;
	
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
}
