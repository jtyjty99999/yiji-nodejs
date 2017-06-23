package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月29日
 */
@OpenApiMessage(service = "commonCertificatecheck", type = ApiMessageType.Request)
public class CommonCertificatecheckRequest extends ApiRequest {
	
	@OpenApiField(desc = "会员号")
	private String userId;
	
	@OpenApiField(desc = "姓名")
	private String name;
	
	@OpenApiField(desc = "证件号")
	private String certNo;
	
	@OpenApiField(desc = "证件类型")
	private String certType;
	
	@OpenApiField(desc = "营业执照号")
	private String businessLicenseNo;
	
	@OpenApiField(desc = "组织机构代码号")
	private String organizationCode;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCertType() {
		return certType;
	}
	
	public void setCertType(String certType) {
		this.certType = certType;
	}
	
	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}
	
	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}
	
	public String getOrganizationCode() {
		return organizationCode;
	}
	
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}
	
}
