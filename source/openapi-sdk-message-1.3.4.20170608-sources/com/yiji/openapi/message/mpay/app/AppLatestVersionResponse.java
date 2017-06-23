package com.yiji.openapi.message.mpay.app;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 获取最细APP版本响应对象
 * 
 * @author zhangpu
 *
 */
@OpenApiMessage(service = "userActive", type = ApiMessageType.Response)
public class AppLatestVersionResponse extends ApiResponse {
	
	/** 应用编码 */
	@NotEmpty
	@OpenApiField(desc = "应用编码", constraint = "唯一标识应用",demo = "YIPINHUI")
	private String appCode;
	/** 应用名称 */
	@OpenApiField(desc = "应用名称",demo = "易品汇")
	private String appName;
	/** 设备类型 */
	@NotBlank
	@OpenApiField(desc = "设备类型", constraint = "可选值:ANDROID,IPHONE",demo = "ANDROID")
	private String appDeviceTypeEnum;
	/** 版本号 如：1.0.0, 用于显示 */
	@OpenApiField(desc = "版本号", constraint = "如：1.0.0, 用于显示",demo = "1.0.0")
	private String versionName;
	/** 版本编码 通过这个的最大值判断最新版本 */
	@NotEmpty
	@OpenApiField(desc = "版本编号", constraint = "通过这个的最大值判断最新版本",demo = "0")
	private int versionCode = 0;
	/** 版本说明 */
	@OpenApiField(desc = "版本说明",demo = "支持功能")
	private String subject;
	/** 下载URL，全URL */
	@NotEmpty
	@OpenApiField(desc = "下载URL",demo = "http://m.yiji.com/yipinhui1.0.0.apk")
	private String url;
	/** 发布时间 */
	@NotNull
	@OpenApiField(desc = "发布时间",demo = "2015-10-16 00:00:00")
	private Date pubTime;
	/** 是否强制更新 {0:否,1:是} */
	@NotEmpty
	@OpenApiField(desc = "是否强制更新", constraint = "可选值： {0:否,1:是}",demo = "1")
	private int forceUpdate;
	/** 备注 */
	@OpenApiField(desc = "备注",demo = "请及时更新")
	private String comments;
	
	public String getAppCode() {
		return appCode;
	}
	
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}
	
	public String getAppName() {
		return appName;
	}
	
	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	public String getAppDeviceTypeEnum() {
		return appDeviceTypeEnum;
	}
	
	public void setAppDeviceTypeEnum(String appDeviceTypeEnum) {
		this.appDeviceTypeEnum = appDeviceTypeEnum;
	}
	
	public String getVersionName() {
		return versionName;
	}
	
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	
	public int getVersionCode() {
		return versionCode;
	}
	
	public void setVersionCode(int versionCode) {
		this.versionCode = versionCode;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Date getPubTime() {
		return pubTime;
	}
	
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}
	
	public int getForceUpdate() {
		return forceUpdate;
	}
	
	public void setForceUpdate(int forceUpdate) {
		this.forceUpdate = forceUpdate;
	}
	
	public String getComments() {
		return comments;
	}
	
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	@Override
	public String toString() {
		return String
			.format(
				"AppLatestVersionResponse: {appCode:%s, appName:%s, appDeviceTypeEnum:%s, versionName:%s, versionCode:%s, subject:%s, url:%s, pubTime:%s, forceUpdate:%s, comments:%s}",
				appCode, appName, appDeviceTypeEnum, versionName, versionCode, subject, url, pubTime, forceUpdate,
				comments);
	}
	
}
