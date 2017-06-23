package com.yiji.openapi.message.common.bankcard;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Jason Ma on 2015/4/6.
 */
@OpenApiMessage(service = "commonRedirectBindCard", type = ApiMessageType.Request)
public class CommonRedirectBindCardRequest extends ApiRequest {
	
	@OpenApiField(desc = "平台类型",demo = "PC")
	private String termnalType;
	
	@NotBlank
	@OpenApiField(desc = "用户id",demo = "12345679801234567890")
	private String userId;
	
	@OpenApiField(desc = "签约用途",demo = "DEDUCT")
	private String purpose;

	@Size(min = 1,max = 1)
	@OpenApiField(desc = "是否显示标题",constraint = "“1”显示，“0”不显示，默认显示",demo = "1")
	private String title = "1";

	@OpenApiField(desc = "是否显示结果页面",constraint = "1：是<br>0：否<br>默认显示",demo = "1")
	private String showResultPage = "1";

	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPurpose() {
		return purpose;
	}
	
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public String getTermnalType() {
		return termnalType;
	}
	
	public void setTermnalType(String termnalType) {
		this.termnalType = termnalType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShowResultPage() {
		return showResultPage;
	}

	public void setShowResultPage(String showResultPage) {
		this.showResultPage = showResultPage;
	}
}
