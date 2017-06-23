package com.yiji.openapi.message.product.ccp;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "closeProcessInstance", type = ApiMessageType.Response)
public class CloseProcessInstanceResponse extends ApiResponse {
	
	@Length(max = 128)
	@OpenApiField(desc = "返回码")
	private String code;
	
	@Length(max = 1024)
	@OpenApiField(desc = "描述")
	private String msg;
	
	@Length(max = 128)
	@OpenApiField(desc = "流程id")
	private String processInstanceId;
	
	@Length(max = 128)
	@OpenApiField(desc = "流程名称")
	private String processInstanceName;
	
	@OpenApiField(desc = "流程结束标志")
	private boolean processIsEnd;
	
	public String getProcessInstanceId() {
		return processInstanceId;
	}
	
	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}
	
	public String getProcessInstanceName() {
		return processInstanceName;
	}
	
	public void setProcessInstanceName(String processInstanceName) {
		this.processInstanceName = processInstanceName;
	}
	
	public boolean isProcessIsEnd() {
		return processIsEnd;
	}
	
	public void setProcessIsEnd(boolean processIsEnd) {
		this.processIsEnd = processIsEnd;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
