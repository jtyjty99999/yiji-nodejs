/**
 * www.yiji.com
 */
package com.yiji.openapi.message.common.certify;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mayansen
 *
 */
@Deprecated
@OpenApiMessage(service = "confidenceCertifyPersonal", type = ApiMessageType.Request)
public class ConfidenceCertifyRequest extends ApiRequest {
	
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@NotBlank
	@Length(max = 16)
	@OpenApiField(desc = "真实姓名")
	private String realName;
	
	@NotBlank
	@Length(max = 18)
	@OpenApiField(desc = "证件号")
	private String certNo;
	
	@OpenApiField(desc = "证件类型", constraint = "非银行面签必填")
	private String certType;
	
	@OpenApiField(desc = "证件到期时间", constraint = "格式20120911, 长期为0, 非银行面签必填")
	private String certValidTime;
	
	@OpenApiField(desc = "证件正面图片", constraint = "非银行面签必填")
	private String certFrontPath;
	
	@OpenApiField(desc = "证件背面图片", constraint = "非银行面签必填")
	private String certBackPath;
	
	@OpenApiField(desc = "职业", constraint = "非银行面签必填")
	private String occupation;
	
	@OpenApiField(desc = "手机号码", constraint = "非银行面签必填")
	private String phone;
	
	@OpenApiField(desc = "家庭或工作单位地址", constraint = "非银行面签必填")
	private String address;
	
	@OpenApiField(desc = "公安部存档照片", constraint = "非银行面签必填")
	private String auditpic;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getRealName() {
		return this.realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getCertNo() {
		return this.certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCertType() {
		return this.certType;
	}
	
	public void setCertType(String certType) {
		this.certType = certType;
	}
	
	public String getCertValidTime() {
		return this.certValidTime;
	}
	
	public void setCertValidTime(String certValidTime) {
		this.certValidTime = certValidTime;
	}
	
	public String getCertFrontPath() {
		return this.certFrontPath;
	}
	
	public void setCertFrontPath(String certFrontPath) {
		this.certFrontPath = certFrontPath;
	}
	
	public String getCertBackPath() {
		return this.certBackPath;
	}
	
	public void setCertBackPath(String certBackPath) {
		this.certBackPath = certBackPath;
	}
	
	public String getOccupation() {
		return this.occupation;
	}
	
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAuditpic() {
		return this.auditpic;
	}
	
	public void setAuditpic(String auditpic) {
		this.auditpic = auditpic;
	}
	
}
