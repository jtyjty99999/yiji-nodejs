package com.yiji.openapi.message.product.easyexchange;

import java.util.List;

import com.yiji.openapi.message.product.easyexchange.infos.PaymentBillResultVo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "yhtMultiPaymentBillUpload", type = ApiMessageType.Response)
public class YhtMultiPaymentBillUploadResponse extends ApiResponse {
	
	@OpenApiField(desc = "结果集 ")
	private List<PaymentBillResultVo> resultInfos;
	
	public List<PaymentBillResultVo> getResultInfos() {
		return resultInfos;
	}
	
	public void setResultInfos(List<PaymentBillResultVo> resultInfos) {
		this.resultInfos = resultInfos;
	}
	
}
