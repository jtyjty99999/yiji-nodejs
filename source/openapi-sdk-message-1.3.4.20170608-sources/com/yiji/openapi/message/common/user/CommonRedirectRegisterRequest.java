package com.yiji.openapi.message.common.user;

import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月28日
 */
@Deprecated
@OpenApiMessage(service = "commonRedirectRegister", type = ApiMessageType.Request)
public class CommonRedirectRegisterRequest extends ApiRequest {
	
	@OpenApiField(desc = "平台类型",constraint="平台类型",demo="PC")
	private String termnalType;
	
	@OpenApiField(desc = "用户名",constraint="用户名",demo="admin")
	private String userName;

	@Size(min = 1,max = 1)
	@OpenApiField(desc = "是否显示标题",constraint = "是否显示标题,默认显示[1:显示,0:不显示]",demo="1")
	private String title = "1";
	
	@OpenApiField(desc = "是否显示注册结果页",constraint = "(移动专用)控制注册完成后的结果页面是否显示,默认显示[1:显示,0:不显示]",demo="1")
	private String showResultPage = "1";
	
	@OpenApiField(desc = "是否显示邮箱输入栏",constraint = "(移动专用)控制注册页面的邮箱输入栏是否显示,默认不显示[1:显示,0:不显示]",demo="0")
	private String showMail = "0";
	
	@OpenApiField(desc = "是否显示设置登录密码输入栏",constraint = "(移动专用)控制注册页面用来设置登录密码的输入框是否显示,默认显示[1:显示,0:不显示]",demo="1")
	private String showLoginPassword = "1";
	
	@OpenApiField(desc = "是否显示用户名输入栏",constraint = "(移动专用)控制注册页面的用户名输入栏是否显示,默认不显示[1:显示,0:不显示]",demo="1")
	private String showUserName = "0";
	
	@OpenApiField(desc = "是否显示设置支付密码输入栏",constraint = "(移动专用)控制注册页面用来设置支付密码的输入框是否显示,默认显示[1:显示,0:不显示]",demo="1")
	private String showPaymentPassword = "1";
	
	public String getShowResultPage() {
		return this.showResultPage;
	}

	public void setShowResultPage(String showResultPage) {
		this.showResultPage = showResultPage;
	}

	public String getShowMail() {
		return this.showMail;
	}

	public void setShowMail(String showMail) {
		this.showMail = showMail;
	}

	public String getShowLoginPassword() {
		return this.showLoginPassword;
	}

	public void setShowLoginPassword(String showLoginPassword) {
		this.showLoginPassword = showLoginPassword;
	}

	public String getShowUserName() {
		return this.showUserName;
	}

	public void setShowUserName(String showUserName) {
		this.showUserName = showUserName;
	}

	public String getShowPaymentPassword() {
		return this.showPaymentPassword;
	}

	public void setShowPaymentPassword(String showPaymentPassword) {
		this.showPaymentPassword = showPaymentPassword;
	}

	public String getTermnalType() {
		return termnalType;
	}
	
	public void setTermnalType(String termnalType) {
		this.termnalType = termnalType;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
