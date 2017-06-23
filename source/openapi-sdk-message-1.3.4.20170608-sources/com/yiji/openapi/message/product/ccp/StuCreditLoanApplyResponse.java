package com.yiji.openapi.message.product.ccp;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "stuCreditLoanApply", type = ApiMessageType.Response)
public class StuCreditLoanApplyResponse extends ApiResponse {
	
	@OpenApiField(desc = "申请流水号")
	private String applicationNo;
	
	@OpenApiField(desc = "外部流水")
	private String outBizNo;
	
	@OpenApiField(desc = "贷款状态")
	private String loanStatus;
	
	@OpenApiField(desc = "电子借据")
	private String loanReceipt;
	
	@OpenApiField(desc = "电子借据文件路径")
	private String loanReceiptPdfFilePath;
	
	public String getApplicationNo() {
		return applicationNo;
	}
	
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getLoanStatus() {
		return loanStatus;
	}
	
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	
	public String getLoanReceipt() {
		return loanReceipt;
	}
	
	public void setLoanReceipt(String loanReceipt) {
		this.loanReceipt = loanReceipt;
	}
	
	public String getLoanReceiptPdfFilePath() {
		return loanReceiptPdfFilePath;
	}
	
	public void setLoanReceiptPdfFilePath(String loanReceiptPdfFilePath) {
		this.loanReceiptPdfFilePath = loanReceiptPdfFilePath;
	}
	
}
