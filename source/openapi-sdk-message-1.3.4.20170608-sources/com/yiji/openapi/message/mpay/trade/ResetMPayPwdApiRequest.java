package com.yiji.openapi.message.mpay.trade;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 易手富， 找回密码
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "resetMPayPwd", type = ApiMessageType.Request)
public class ResetMPayPwdApiRequest extends ApiRequest {
	
	/** 交易额 */
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "用户id")
	@NotBlank
	private String userId;
	
	/** 交易名称 */
	@Length(max = 18)
	@OpenApiField(desc = "身份证号码")
	@NotBlank
	private String certNo;
	
	/** 买家 */
	@Length(max = 32)
	@OpenApiField(desc = "真实姓名")
	@NotBlank
	private String realName;
	
	@Length(max = 32)
	@OpenApiField(desc = "易手富密码")
	private String password;
	
	@Length(max = 20)
	@OpenApiField(desc = "业务类型")
	private String businessType = "CHECK";
	
	public String getBusinessType() {
		return businessType;
	}
	
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}	
}
