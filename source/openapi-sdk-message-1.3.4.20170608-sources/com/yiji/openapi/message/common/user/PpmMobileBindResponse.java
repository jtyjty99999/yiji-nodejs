package com.yiji.openapi.message.common.user;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月29日
 */
@OpenApiMessage(service = "ppmMobileBind", type = ApiMessageType.Response)
public class PpmMobileBindResponse extends ApiResponse {
	@OpenApiField(desc = "用户ID")
	private String loginId;
	
	@OpenApiField(desc = "系统标识")
	private String system;
	
	@OpenApiField(desc = "gid")
	private String gid;
	
	public String getLoginId() {
		return loginId;
	}
	
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	public String getSystem() {
		return system;
	}
	
	public void setSystem(String system) {
		this.system = system;
	}
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
}
