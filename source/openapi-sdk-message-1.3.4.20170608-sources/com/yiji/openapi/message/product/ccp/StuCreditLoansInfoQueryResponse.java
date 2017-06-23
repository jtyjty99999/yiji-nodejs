package com.yiji.openapi.message.product.ccp;

import java.util.List;

import com.yiji.openapi.message.product.ccp.info.StudentCreditLoanQueryInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "stuCreditLoansInfoQuery", type = ApiMessageType.Response)
public class StuCreditLoansInfoQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "查询结果列表")
	List<StudentCreditLoanQueryInfo> loanInfoList;
	
	public List<StudentCreditLoanQueryInfo> getLoanInfoList() {
		return loanInfoList;
	}
	
	public void setLoanInfoList(List<StudentCreditLoanQueryInfo> loanInfoList) {
		this.loanInfoList = loanInfoList;
	}
	
}
