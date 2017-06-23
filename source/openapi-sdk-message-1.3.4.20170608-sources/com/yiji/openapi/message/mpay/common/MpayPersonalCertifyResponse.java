package com.yiji.openapi.message.mpay.common;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.certify.info.StatusEnum;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 易手富用户注册 同步响应报文
 * 
 * @author zhangpu
 *
 */
@OpenApiMessage(service = "mpayPersonalCertify", type = ApiMessageType.Response)
public class MpayPersonalCertifyResponse extends ApiResponse {
	/** 注册ID */
	@NotBlank
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "用户ID", constraint = "易极付用户ID，20位.",demo="20150619010000072320")
	private String userId;
	
	@OpenApiField(desc = "认证状态", constraint = "认证状态",demo="NOA")
	private StatusEnum certifyStatus;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public StatusEnum getCertifyStatus() {
		return certifyStatus;
	}
	
	public void setCertifyStatus(StatusEnum certifyStatus) {
		this.certifyStatus = certifyStatus;
	}
	
}
