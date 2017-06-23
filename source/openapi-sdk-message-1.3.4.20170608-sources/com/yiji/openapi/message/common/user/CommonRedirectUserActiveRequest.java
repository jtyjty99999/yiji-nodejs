package com.yiji.openapi.message.common.user;

import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.enums.ApiServiceResultCode;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Jason Ma on 2015/4/15.
 */
@Deprecated
@OpenApiMessage(service = "commonRedirectUserActive", type = ApiMessageType.Request)
public class CommonRedirectUserActiveRequest extends ApiRequest {
	
	@OpenApiField(desc = "平台类型",demo = "PC")
	private String termnalType;
	
	@OpenApiField(desc = "是否设置登陆密码",demo = "T")
	private String isSetPassword = "T";
	
	@OpenApiField(desc = "用户名",demo = "易极付")
	private String userName;
	
	@Size(min = 1, max = 1)
	@OpenApiField(desc = "是否显示标题", constraint = "“1”显示，“0”不显示，默认显示",demo = "1")
	private String title = "1";
	
	@Size(min = 1, max = 1)
	@OpenApiField(desc = "是否实名", constraint = "“1”是;“0”否，默认否",demo = "0")
	private String certify = "0";
	
	@Size(min = 1, max = 1)
	@OpenApiField(desc = "是否手机验证", constraint = "“1”是;“0”否，默认是",demo = "1")
	private String isPhoneValidate = "1";
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getTermnalType() {
		return termnalType;
	}
	
	public void setTermnalType(String termnalType) {
		this.termnalType = termnalType;
	}
	
	public String getIsSetPassword() {
		return isSetPassword;
	}
	
	public void setIsSetPassword(String isSetPassword) {
		this.isSetPassword = isSetPassword;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCertify() {
		return certify;
	}
	
	public void setCertify(String certify) {
		this.certify = certify;
	}

	public String getIsPhoneValidate() {
		return this.isPhoneValidate;
	}

	public void setIsPhoneValidate(String isPhoneValidate) {
		this.isPhoneValidate = isPhoneValidate;
	}
}
