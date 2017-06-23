package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-26<br>
 */
@Deprecated
@OpenApiMessage(service = "realNameCert.query", type = ApiMessageType.Response)
public class RealNameCertQueryResponse extends ApiResponse {

	@OpenApiField(desc = "用户id", demo = "12346579801234567980")
	private String coreCusUserId;

	@OpenApiField(desc = "信息", demo = "这是描述信息")
	private String msg;

	@OpenApiField(desc = "实名状态", demo = "AUDIT_PASSED")
	private String status;

	@OpenApiField(desc = "信息", demo = "这是描述信息")
	private String message;

	public String getCoreCusUserId() {
		return coreCusUserId;
	}

	public void setCoreCusUserId(String coreCusUserId) {
		this.coreCusUserId = coreCusUserId;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
