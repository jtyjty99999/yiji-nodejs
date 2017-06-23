package com.yiji.openapi.message.common.installment;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月10日
 */
@OpenApiMessage(service = "installmentRemittanceQuery", type = ApiMessageType.Request)
public class InstallmentRemittanceQueryRequest extends ApiRequest {
	
	@NotEmpty
	@Length(max = 45)
	@OpenApiField(desc = "合约号")
	private String contractNo;
	
	@NotEmpty
	@Length(max = 45)
	@OpenApiField(desc = "外部订单号")
	private String externalOrderNo;
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getExternalOrderNo() {
		return externalOrderNo;
	}
	
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}
	
}
