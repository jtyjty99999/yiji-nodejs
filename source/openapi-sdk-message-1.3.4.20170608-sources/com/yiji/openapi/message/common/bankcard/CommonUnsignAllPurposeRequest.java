package com.yiji.openapi.message.common.bankcard;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月10日
 */
@OpenApiMessage(service = "commonUnsignAllPurpose", type = ApiMessageType.Request)
public class CommonUnsignAllPurposeRequest extends ApiRequest {

	/**
	 * 会员号
	 */
	@NotBlank(message = "会员号不能为空")
	@OpenApiField(desc = "会员号",demo = "12345697801234567890")
	private String userId;
	/**
	 * 流水号
	 */
	@NotBlank(message = "签约流水号不能为空")
	@OpenApiField(desc = "流水号",demo = "12345679")
	private String pactNo;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPactNo() {
		return pactNo;
	}

	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}

}
