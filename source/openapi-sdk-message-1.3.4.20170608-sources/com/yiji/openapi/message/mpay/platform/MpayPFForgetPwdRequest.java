/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-09-10 13:58 创建
 *
 */
package com.yiji.openapi.message.mpay.platform;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mpayPFForgetPwd", type = ApiMessageType.Request)
public class MpayPFForgetPwdRequest extends ApiRequest {
	
	/**
	 * 签约流水号
	 */
	@NotBlank
	@Length(max = 20, min = 1, message = "签约流水号不能为空")
    @OpenApiField(desc = "签约流水号",demo = "21345678901232")
	private String pactNo;
	
	/**
	 * 交易号
	 */
	@NotBlank
	@Length(max = 20, min = 20)
    @OpenApiField(desc = "交易号",demo = "213456123456542")
	private String tradeNo;
	
	/** 真实姓名 */
	@NotBlank
	@Length(max = 60, min = 1)
    @OpenApiField(desc = "真实姓名",demo = "易极付")
	private String realName;
	
	/** 身份证号码 */
	@NotBlank
	@Length(max = 50, min = 6)
    @OpenApiField(desc = "身份证号码",demo = "123546789012345687")
	private String certNo;
	
	/** 手机号 */
	@NotBlank
	@Size(min = 8, max = 16)
    @OpenApiField(desc = "手机号",demo = "10086100101")
	private String mobileNo;
	
	
	@JSONField(serialize = false)
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	@JSONField(serialize = false)
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getPactNo() {
		return this.pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getMobileNo() {
		return this.mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}
