package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-18<br>
 */
@OpenApiMessage(service = "new_authorize", type = ApiMessageType.Notify)
public class NewAuthorizeNotify extends ApiNotify {

	@OpenApiField(desc = "用户名", constraint = "用户名",demo = "12345679801324567890")
	private String userId;

	@OpenApiField(desc = "认证状态", constraint = "{\"data\":[\"NOA:未认证\",\"AUT:认证中\",\"ATP:认证通过\",\"ATN:认证失败\",\"UCF:更新有效期失败\",\"UCS:更新有效期成功\",\"EXPIRE:过期\"],\"name\":\"认证状态\"}",demo = "ATP")
	private String certifyStatus;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCertifyStatus() {
		return certifyStatus;
	}

	public void setCertifyStatus(String certifyStatus) {
		this.certifyStatus = certifyStatus;
	}

}
