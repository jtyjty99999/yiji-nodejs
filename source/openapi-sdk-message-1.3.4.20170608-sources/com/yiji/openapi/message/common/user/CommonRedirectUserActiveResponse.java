package com.yiji.openapi.message.common.user;

import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/4/15.
 */
@Deprecated
@OpenApiMessage(service = "commonRedirectUserActive", type = ApiMessageType.Response)
public class CommonRedirectUserActiveResponse extends ApiResponse {
	
	@OpenApiField(desc = "系统标示")
	private String system;
	
	@OpenApiField(desc = "用户名")
	private String userName;

	@OpenApiField(desc = "gid")
	private String gid;

	@Size(min = 1,max = 1)
	@OpenApiField(desc = "是否显示标题",constraint = "“1”显示，“0”不显示，默认显示")
	private String title = "1";

	@Size(min = 1,max = 1)
	@OpenApiField(desc = "是否设置登录密码",constraint = "“1”设置，“0”不设置，默认设置")
	private String setLoginPas = "1";

	@Size(min = 1,max = 1)
	@OpenApiField(desc = "是否实名",constraint = "“1”是  ， “0”否，默认否")
	private String certify = "0";
	
	@OpenApiField(desc = "是否手机验证", constraint = "“1”是;“0”否，默认否")
	private String isPhoneValidate;

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getSystem() {
		return system;
	}
	
	public void setSystem(String system) {
		this.system = system;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSetLoginPas() {
		return setLoginPas;
	}

	public void setSetLoginPas(String setLoginPas) {
		this.setLoginPas = setLoginPas;
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
