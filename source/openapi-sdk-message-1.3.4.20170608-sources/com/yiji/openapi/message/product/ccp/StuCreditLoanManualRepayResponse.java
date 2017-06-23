package com.yiji.openapi.message.product.ccp;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;



@OpenApiMessage(service = "stuCreditLoanManualRepay", type = ApiMessageType.Response)
public class StuCreditLoanManualRepayResponse extends ApiResponse {
	
	@OpenApiField(desc = "外部业务流水号")
	private String outBizNo;
	
	@OpenApiField(desc = "还款流水号")
	private String repaymentNo;
	
	@OpenApiField(desc = "还款状态")
	private String repaymentStatus;
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getRepaymentStatus() {
		return repaymentStatus;
	}
	
	public void setRepaymentStatus(String repaymentStatus) {
		this.repaymentStatus = repaymentStatus;
	}
	
	public String getRepaymentNo() {
		return repaymentNo;
	}
	
	public void setRepaymentNo(String repaymentNo) {
		this.repaymentNo = repaymentNo;
	}
	
}
