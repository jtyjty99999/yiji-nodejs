package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

@OpenApiMessage(service = "bankNoQuery", type = ApiMessageType.Response)
public class BankNoQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "联行号", demo = "1230")
	private String bankLasalle;
	
	@OpenApiField(desc = "开户行名称", demo = "重庆市渝北松石路支行")
	private String branchName;
	
	public String getBankLasalle() {
		return bankLasalle;
	}
	
	public void setBankLasalle(String bankLasalle) {
		this.bankLasalle = bankLasalle;
	}
	
	public String getBranchName() {
		return branchName;
	}
	
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	

	public String toString() {
		return "BankNoQueryResponse [bankLasalle=" + bankLasalle + ", branchName=" + branchName + ", getResultCode()="
				+ getResultCode() + ", getResultMessage()=" + getResultMessage() + ", getReturnUrl()=" + getReturnUrl()
				+ ", getResultDetail()=" + getResultDetail() + ", isSuccess()=" + isSuccess() + ", getMerchOrderNo()="
				+ getMerchOrderNo() + ", getService()=" + getService() + ", getProtocol()=" + getProtocol()
				+ ", getPartnerId()=" + getPartnerId() + ", getSignType()=" + getSignType() + ", getSign()="
				+ getSign() + ", getVersion()=" + getVersion() + ", getContext()=" + getContext() + ", getOrderNo()="
				+ getOrderNo() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
