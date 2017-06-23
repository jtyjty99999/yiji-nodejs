package com.yiji.openapi.message.common.tool;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Jason Ma on 2015/1/15.
 */
@OpenApiMessage(service = "sendEmail", type = ApiMessageType.Request)
public class SendEmailRequest extends ApiRequest {
	
	@NotNull
	@OpenApiField(desc = "邮箱地址集合")
	@Size(min = 1, max = 20)
	private List<String> to;
	
	@Size(max = 1024)
	@OpenApiField(desc = "邮件主题")
	private String subject;
	
	@OpenApiField(desc = "邮件内容")
	@Size(max = 1024)
	private String content;
	
	@NotNull
	@OpenApiField(desc = "客户端名称")
	@Size(min = 1, max = 40)
	private String clientName;

	public List<String> getTo() {
		return to;
	}
	
	public void setTo(List<String> to) {
		this.to = to;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getClientName() {
		return clientName;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
}
