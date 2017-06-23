package com.yiji.openapi.message.product.cowpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "modifyPw2Cowpay", type = ApiMessageType.Response)
public class ModifyPw2CowpayResponse extends ApiResponse {
	
	@OpenApiField(desc = "外部软件商useId")
	private String externalUserId;
	
	@OpenApiField(desc = "易极付用户ID")
	private String userId;
	
	@OpenApiField(desc = "用户名称", constraint = "最大50字符")
	private String userName;
	
	@OpenApiField(desc = "0：移动端，1：PC端")
	private int entrance;
	
	@OpenApiField(desc = "gid")
	private String gid;
	
	public String getExternalUserId() {
		return externalUserId;
	}
	
	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getEntrance() {
		return entrance;
	}
	
	public void setEntrance(int entrance) {
		this.entrance = entrance;
	}
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}

}
