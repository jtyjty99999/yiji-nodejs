package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "mpayOpinionFeedback", type = ApiMessageType.Request)
public class MpayOpinionFeedbackRequest extends ApiRequest {
	/**
	 * 用户编号
	 */
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "用户编号",constraint="用户编号",demo="20150619010000072320")
	private String userId;
	
	/**
	 * 问题类型
	 */
	@NotBlank
	@OpenApiField(desc = "问题类型",constraint="问题类型",demo="EXETERNAL_HTTP_NOTIFY")
	private String type;
	
	/**
	 * 反馈内容
	 */
	@NotBlank
	@Length(max = 512, min = 7)
	@OpenApiField(desc = "反馈内容",constraint="反馈内容",demo="{protocol=httpPost,capitalAmount=150.89}")
	private String content;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
