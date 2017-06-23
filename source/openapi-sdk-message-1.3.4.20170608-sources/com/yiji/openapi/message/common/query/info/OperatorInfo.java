package com.yiji.openapi.message.common.query.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * Created by Jason Ma on 2015/1/14.
 */
public class OperatorInfo {
	
	@OpenApiField(desc = "操作员Id")
	private String operatorId;
	
	@OpenApiField(desc = "操作员姓名")
	private String operatorRealName;
	
	@OpenApiField(desc = "状态")
	private String status;
	
	public String getOperatorId() {
		return operatorId;
	}
	
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
	public String getOperatorRealName() {
		return operatorRealName;
	}
	
	public void setOperatorRealName(String operatorRealName) {
		this.operatorRealName = operatorRealName;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
