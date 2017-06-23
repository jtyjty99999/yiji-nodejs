package com.yiji.openapi.message.common.bankcard;

import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/4/6.
 */
@OpenApiMessage(service = "commonRedirectBindCard", type = ApiMessageType.Response)
public class CommonRedirectBindCardResponse extends ApiResponse {
	
	@OpenApiField(desc = "易极付内部gid")
	private String gid;
	
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@OpenApiField(desc = "签约类型")
	private String purpose;
	
	@Size(min = 1, max = 1)
	@OpenApiField(desc = "是否显示标题", constraint = "“1”显示，“0”不显示，默认显示")
	private String title = "1";
	
	@OpenApiField(desc = "入口编码")
	private String inlet = "01";
	
	@OpenApiField(desc = "是否显示结果页面", constraint = "1：是<br>0：否<br>默认显示")
	private String showResultPage = "1";
	
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
	
	public String getPurpose() {
		return purpose;
	}
	
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getInlet() {
		return this.inlet;
	}
	
	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
	
	public String getShowResultPage() {
		return showResultPage;
	}
	
	public void setShowResultPage(String showResultPage) {
		this.showResultPage = showResultPage;
	}
}