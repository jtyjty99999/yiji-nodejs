package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-18<br>
 */
@Deprecated
@OpenApiMessage(service = "new_authorize", type = ApiMessageType.Response)
public class NewAuthorizeResponse extends ApiResponse {

	@OpenApiField(desc = "统一流水号", constraint = "统一流水号", demo = "H000jyj44993xxxxxxxxxxxxx")
	private String gid;

	@OpenApiField(desc = "用户ID", constraint = "用户ID", demo = "12346579801234567980")
	private String userId;

	@OpenApiField(desc = "外部ID,实际上就是partnerId", constraint = "外部ID", demo = "20121015300000032621")
	private String externalId;

	@OpenApiField(desc = "服务器异步通知页面路径", constraint = "服务器异步通知页面路径", demo = "http://xxxxxxxxxx")
	private String notifyUrl;

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
}
