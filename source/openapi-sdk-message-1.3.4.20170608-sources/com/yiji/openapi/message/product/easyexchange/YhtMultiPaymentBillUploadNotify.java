package com.yiji.openapi.message.product.easyexchange;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;


@OpenApiMessage(service = "yhtMultiPaymentBillUpload", type = ApiMessageType.Notify)
public class YhtMultiPaymentBillUploadNotify extends ApiNotify {
	
	@OpenApiField(desc = "处理结果列表")
	private String resultInfos;
	
	public String getResultInfos() {
		return resultInfos;
	}
	
	public void setResultInfos(String resultInfos) {
		this.resultInfos = resultInfos;
	}
	
}
