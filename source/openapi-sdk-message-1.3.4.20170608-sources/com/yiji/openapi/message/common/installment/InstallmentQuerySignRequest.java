package com.yiji.openapi.message.common.installment;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Jason Ma on 2015/2/8.
 */
@OpenApiMessage(service = "installmentQuerySign", type = ApiMessageType.Request)
public class InstallmentQuerySignRequest extends ApiRequest {
	
	@OpenApiField(desc = "纸质合同号")
	@NotBlank
	@Length(max = 40)
	private String paperContractNo;
	
	public String getPaperContractNo() {
		return paperContractNo;
	}
	
	public void setPaperContractNo(String paperContractNo) {
		this.paperContractNo = paperContractNo;
	}
}
