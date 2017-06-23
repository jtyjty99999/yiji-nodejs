package com.yiji.openapi.message.product.ccp;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;



@OpenApiMessage(service = "stuCreditAmountApply", type = ApiMessageType.Response)
public class StuCreditAmountApplyResponse extends ApiResponse {
	
	@OpenApiField(desc = "申请人ID")
	private String borrowerId;
	
	@OpenApiField(desc = "申请流水号")
	private String creditAmountApplicationNo;
	
	@OpenApiField(desc = "外部流水")
	private String outBizNo;
	
	@OpenApiField(desc = "申请状态")
	private String creditAmountStatus;
	
	@OpenApiField(desc = "电子协议")
	private String eContract;
	
	@OpenApiField(desc = "电子协议文件路径")
	private String eContractFilePath;
	
	public String getBorrowerId() {
		return borrowerId;
	}
	
	public void setBorrowerId(String borrowerId) {
		this.borrowerId = borrowerId;
	}
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getCreditAmountStatus() {
		return creditAmountStatus;
	}
	
	public void setCreditAmountStatus(String creditAmountStatus) {
		this.creditAmountStatus = creditAmountStatus;
	}
	
	public String geteContract() {
		return eContract;
	}
	
	public void seteContract(String eContract) {
		this.eContract = eContract;
	}
	
	public String geteContractFilePath() {
		return eContractFilePath;
	}
	
	public void seteContractFilePath(String eContractFilePath) {
		this.eContractFilePath = eContractFilePath;
	}
	
	public String getCreditAmountApplicationNo() {
		return creditAmountApplicationNo;
	}
	
	public void setCreditAmountApplicationNo(String creditAmountApplicationNo) {
		this.creditAmountApplicationNo = creditAmountApplicationNo;
	}
	
}