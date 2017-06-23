package com.yiji.openapi.message.mpay.app;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * app 最新版本 请求对象
 * 
 * @author zhangpu
 *
 */
@OpenApiMessage(service = "userActive", type = ApiMessageType.Request)
public class AppLatestVersionRequest extends ApiRequest {
	/** 应用编码 */
	@NotEmpty
	@OpenApiField(desc = "应用编码", constraint = "由平台分配，唯一标识一个APP应用。",demo = "YIPINHUI")
	private String appCode;
	/** 设备类型 */
	@NotBlank
	@OpenApiField(desc = "设备类型", constraint = "可选值:ANDROID,IPHONE",demo = "ANDROID")
	private String appDeviceTypeEnum;
	
	public String getAppCode() {
		return appCode;
	}
	
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}
	
	public String getAppDeviceTypeEnum() {
		return appDeviceTypeEnum;
	}
	
	public void setAppDeviceTypeEnum(String appDeviceTypeEnum) {
		this.appDeviceTypeEnum = appDeviceTypeEnum;
	}
	
	@Override
	public String toString() {
		return String.format("AppLatestVersionRequest: {appCode:%s, appDeviceTypeEnum:%s}", appCode, appDeviceTypeEnum);
	}
	
}
