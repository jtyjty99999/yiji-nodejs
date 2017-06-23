package com.yiji.openapi.message.common.installment;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/2/5.
 */
@OpenApiMessage(service = "installmentSign", type = ApiMessageType.Response)
public class InstalmentSignResponse extends ApiResponse {
	
	@OpenApiField(desc = "签约合同号")
	private String contractNo;
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
}
