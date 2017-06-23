package com.yiji.openapi.message.product.easyexchange;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xinqing@yiji.com
 *
 * Data： 2015年6月16日
 */
@OpenApiMessage(service = "realNameQuery", type = ApiMessageType.Request)
public class RealNameQueryRequest extends ApiRequest {
	
	/**
	 * 姓名
	 */
	@NotBlank
	@OpenApiField(desc = "姓名")
	private String realName;
	
	/**
	 * 身份证号
	 */
	@NotBlank
	@OpenApiField(desc = "身份证号")
	private String certNo;
	
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
}
