package com.yiji.openapi.message.common.query;

import java.util.List;

import com.yiji.openapi.message.common.query.info.OperatorInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/1/14.
 */
@OpenApiMessage(service = "operatorInfoQuery", type = ApiMessageType.Response)
public class OperatorInfoQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "操作员信息列表")
	private List<OperatorInfo> operatorInfoList;
	
	public List<OperatorInfo> getOperatorInfoList() {
		return operatorInfoList;
	}
	
	public void setOperatorInfoList(List<OperatorInfo> operatorInfoList) {
		this.operatorInfoList = operatorInfoList;
	}
}
