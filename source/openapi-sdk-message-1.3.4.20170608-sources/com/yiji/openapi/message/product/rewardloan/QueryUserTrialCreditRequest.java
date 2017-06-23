package com.yiji.openapi.message.product.rewardloan;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

@OpenApiMessage(service = "queryUserTrialCredit", type = ApiMessageType.Request)
public class QueryUserTrialCreditRequest extends ApiRequest {
	
	@NotBlank(message = "易极付用户ID不能为空")
	@OpenApiField(desc = "易极付用户ID")
	@Size(max = 20, min = 20)
	private String userId;
	
	@NotBlank(message = "合作伙伴用户ID不能为空")
	@OpenApiField(desc = "合作伙伴用户ID")
	private String partnerUserId;
	
	@Size(max = 18)
	@OpenApiField(desc = "身份证号")
	private String certNo;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPartnerUserId() {
		return partnerUserId;
	}
	
	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
}
