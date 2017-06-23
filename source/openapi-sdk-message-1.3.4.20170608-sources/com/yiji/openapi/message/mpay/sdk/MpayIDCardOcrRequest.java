package com.yiji.openapi.message.mpay.sdk;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by hgeshu@yiji.com on 2016/7/14.
 */
@OpenApiMessage(service = "mpayIDCardOcr", type = ApiMessageType.Request)
public class MpayIDCardOcrRequest extends ApiRequest {
	
	@Length(max = 20)
	@NotBlank
	@OpenApiField(desc = "内部会员号 ", constraint = "内部会员号 ", demo = "20151123020000082860")
	private String userId;
	/**
	 * 身份证正面图片地址
	 */
	@NotBlank
	@Length(min = 1, max = 200)
	@OpenApiField(desc = "身份证正面图片地址", demo = "http://www.yiji.com/1.jpg")
	private String certFrontPath;
	/**
	 * 身份证背面图片地址
	 */
	@NotBlank
	@Length(min = 1, max = 200)
	@OpenApiField(desc = "身份证背面图片地址", demo = "http://www.yiji.com/1.jpg")
	private String certBackPath;
	
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

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
