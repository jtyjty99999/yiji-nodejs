package com.yiji.openapi.message.mpay.common;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 易手富 个人实名认证 请求报文
 * 
 * @author zhangpu
 *
 */
@OpenApiMessage(service = "mpayPersonalCertify", type = ApiMessageType.Request)
public class MpayPersonalCertifyRequest extends ApiRequest {
	
	@NotEmpty
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户Id", constraint = "易极付用户ID",demo="20151016000124130517")
	private String userId;
	
	@NotEmpty
	@Length(max = 50)
	@OpenApiField(desc = "真实名称", constraint = "真实名称",demo="张三")
	private String realName;
	
	@NotEmpty
	@Length(max = 50)
	@OpenApiField(desc = "身份证号码", constraint = "身份证号码",demo="622221195410252315")
	private String certNo;
	
	@NotNull
	@Length(max = 8)
	@OpenApiField(desc = "身份证有效期", constraint = "身份证到期日期	yyyyMMdd，长期为：0",demo="20201010")
	private String certValidTime;
	
	@NotEmpty
	@Length(max = 256)
	@OpenApiField(desc = "身份证正面图片", constraint = "身份证正面图片。请提供可公网访问的URL",demo="http://www.baidu.com/aa.jpg")
	private String certFrontPath;
	
	@NotEmpty
	@Length(max = 256)
	@OpenApiField(desc = "身份证背面图片", constraint = "身份证背面图片。请提供可公网访问的URL",demo="http://www.baidu.com/aa.jpg")
	private String certBackPath;
	
	@NotEmpty
	@Length(max = 16)
	@OpenApiField(desc = "手机号码", constraint = "手机号码",demo="13525142150")
	private String mobileNo;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCertValidTime() {
		return certValidTime;
	}
	
	public void setCertValidTime(String certValidTime) {
		this.certValidTime = certValidTime;
	}
	
	public String getCertFrontPath() {
		return certFrontPath;
	}
	
	public void setCertFrontPath(String certFrontPath) {
		this.certFrontPath = certFrontPath;
	}
	
	public String getCertBackPath() {
		return certBackPath;
	}
	
	public void setCertBackPath(String certBackPath) {
		this.certBackPath = certBackPath;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
}
