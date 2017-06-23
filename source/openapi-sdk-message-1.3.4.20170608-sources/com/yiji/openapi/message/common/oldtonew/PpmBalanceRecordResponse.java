package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-02-15<br>
 */
@OpenApiMessage(service = "ppmBalanceRecord", type = ApiMessageType.Response)
public class PpmBalanceRecordResponse extends ApiResponse {

	@OpenApiField(desc = "用户id", demo = "21334524133241231")
	private String userId;

	@OpenApiField(desc = "操作员id", demo = "90849074908812083")
	private String operatorId;

	@OpenApiField(desc = "用户名", demo = "张三")
	private String userName;

	@OpenApiField(desc = "入口", demo = "OPENAPI")
	private String inlet;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getInlet() {
		return inlet;
	}

	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
}

