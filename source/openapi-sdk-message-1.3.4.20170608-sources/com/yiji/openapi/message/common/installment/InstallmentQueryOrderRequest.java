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
@OpenApiMessage(service = "installmentQueryOrder", type = ApiMessageType.Request)
public class InstallmentQueryOrderRequest extends ApiRequest {
	
	@OpenApiField(desc = "签约合同号")
	@NotBlank
	@Length(max = 40)
	private String contractNo;
	
	@OpenApiField(desc = "期数")
	private int time = 1;
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
}
