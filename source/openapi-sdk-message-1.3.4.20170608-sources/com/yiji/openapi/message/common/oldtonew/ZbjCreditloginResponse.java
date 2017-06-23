package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-02 9:55.
 */
@OpenApiMessage(service = "zbjCreditlogin", type = ApiMessageType.Response)
public class ZbjCreditloginResponse extends ApiResponse {
	
	@OpenApiField(desc = "系统来源", demo = "openapi")
	private String systemFrom;
	
	@OpenApiField(desc = "请求时间")
	private String requestTime;
	
	@OpenApiField(desc = "易极付用户ID", demo = "214586158125151")
	private String userId;
	
	@OpenApiField(desc = "gid", demo = "H0000000002612016040619561605500000")
	private String gid;
	
	public String getSystemFrom() {
		return systemFrom;
	}
	
	public void setSystemFrom(String systemFrom) {
		this.systemFrom = systemFrom;
	}
	
	public String getRequestTime() {
		return requestTime;
	}
	
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getGid() {
		return this.gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
}
