package com.yiji.openapi.message.common.certify;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
@Deprecated
@OpenApiMessage(service = "confidenceAbroadCorporate", type = ApiMessageType.Request)
public class ConfidenceAbroadCorporateRequest extends ApiRequest {
	
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@NotBlank
	@Length(max = 180)
	@OpenApiField(desc = "企业名称")
	private String comName;
	
	@NotNull
	@OpenApiField(desc = "国籍")
	private String country;
	
	@Length(max = 250)
	@OpenApiField(desc = "地址")
	private String address;
	
	@NotBlank
	@Length(max = 50)
	@OpenApiField(desc = "注册证书号")
	private String registCertifyNumber;
	
	@NotBlank
	@Length(max = 8)
	@OpenApiField(desc = "营业年限,格式yyyyMMdd,长期则填0")
	private String comCycle;
	
	@NotBlank
	@Length(max = 200)
	@OpenApiField(desc = "经营范围")
	private String businessScope;
	
	@NotBlank
	@Length(max = 50)
	@OpenApiField(desc = "税务登记证号")
	private String taxRegistrationCertNum;
	
	@NotBlank
	@Length(max = 50)
	@OpenApiField(desc = "企业联系方式")
	private String telPhone;
	
	@NotBlank
	@Length(max = 500)
	@OpenApiField(desc = "注册证书扫描件")
	private String registCanningCopy;
	
	@Length(max = 500)
	@OpenApiField(desc = "证明文件1")
	private String certifyFile1;
	
	@Length(max = 500)
	@OpenApiField(desc = "证明文件2")
	private String certifyFile2;
	
	@NotBlank
	@Length(max = 50)
	@OpenApiField(desc = "注册人真实名称")
	private String regPersonRealName;
	
	@NotNull
	@OpenApiField(desc = "注册人证件类型")
	private String regCertTypeEnum;
	
	@NotBlank
	@Length(max = 50)
	@OpenApiField(desc = "注册人证件号码")
	private String regCertifyNum;
	
	@NotBlank
	@Length(max = 8)
	@OpenApiField(desc = "注册人证件有效期,格式yyyyMMdd,长期填0")
	private String regCertifyValidity;
	
	@NotBlank
	@Length(max = 500)
	@OpenApiField(desc = "注册人证件扫描件正面")
	private String regCertifyCanningCopyFront;
	
	@NotBlank
	@Length(max = 500)
	@OpenApiField(desc = "注册人证件扫描件背面")
	private String regCertifyCanningCopyBack;
	
	@NotNull
	@Length(max = 50)
	@OpenApiField(desc = "担保企业名称")
	private String assureBusinessEnterpriseName;
	
	@NotBlank
	@Length(max = 30)
	@OpenApiField(desc = "担保企业营业执照注册号")
	private String assureBusinessLicenseNumber;
	
	@NotBlank
	@Length(max = 8)
	@OpenApiField(desc = "担保企业营业执照到期时间,格式yyyyMMdd,长期填0")
	private String assureBusinessCertExprireTime;
	
	@NotBlank
	@Length(max = 200)
	@OpenApiField(desc = "担保企业经营范围")
	private String assureBusinessScope;
	
	@NotBlank
	@Length(max = 30)
	@OpenApiField(desc = "担保企业组织机构代码")
	private String assureBusinessOrganizeCode;
	
	@NotBlank
	@Length(max = 30)
	@OpenApiField(desc = "担保企业联系方式")
	private String assureBusinessTelNumber;
	
	@NotBlank
	@Length(max = 500)
	@OpenApiField(desc = "企业营业执照副本扫描件")
	private String assureBusinessLicenseScanningCopy;
	
	@NotBlank
	@Length(max = 500)
	@OpenApiField(desc = "担保函图片")
	private String assurePaperImage;
	
	@Length(max = 500)
	@OpenApiField(desc = "公安部存档照片")
	private String auditpic;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getComName() {
		return comName;
	}
	
	public void setComName(String comName) {
		this.comName = comName;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getRegistCertifyNumber() {
		return registCertifyNumber;
	}
	
	public void setRegistCertifyNumber(String registCertifyNumber) {
		this.registCertifyNumber = registCertifyNumber;
	}
	
	public String getComCycle() {
		return comCycle;
	}
	
	public void setComCycle(String comCycle) {
		this.comCycle = comCycle;
	}
	
	public String getBusinessScope() {
		return businessScope;
	}
	
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	
	public String getTaxRegistrationCertNum() {
		return taxRegistrationCertNum;
	}
	
	public void setTaxRegistrationCertNum(String taxRegistrationCertNum) {
		this.taxRegistrationCertNum = taxRegistrationCertNum;
	}
	
	public String getTelPhone() {
		return telPhone;
	}
	
	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}
	
	public String getRegistCanningCopy() {
		return registCanningCopy;
	}
	
	public void setRegistCanningCopy(String registCanningCopy) {
		this.registCanningCopy = registCanningCopy;
	}
	
	public String getCertifyFile1() {
		return certifyFile1;
	}
	
	public void setCertifyFile1(String certifyFile1) {
		this.certifyFile1 = certifyFile1;
	}
	
	public String getCertifyFile2() {
		return certifyFile2;
	}
	
	public void setCertifyFile2(String certifyFile2) {
		this.certifyFile2 = certifyFile2;
	}
	
	public String getRegPersonRealName() {
		return regPersonRealName;
	}
	
	public void setRegPersonRealName(String regPersonRealName) {
		this.regPersonRealName = regPersonRealName;
	}
	
	public String getRegCertTypeEnum() {
		return regCertTypeEnum;
	}
	
	public void setRegCertTypeEnum(String regCertTypeEnum) {
		this.regCertTypeEnum = regCertTypeEnum;
	}
	
	public String getRegCertifyNum() {
		return regCertifyNum;
	}
	
	public void setRegCertifyNum(String regCertifyNum) {
		this.regCertifyNum = regCertifyNum;
	}
	
	public String getRegCertifyValidity() {
		return regCertifyValidity;
	}
	
	public void setRegCertifyValidity(String regCertifyValidity) {
		this.regCertifyValidity = regCertifyValidity;
	}
	
	public String getRegCertifyCanningCopyFront() {
		return regCertifyCanningCopyFront;
	}
	
	public void setRegCertifyCanningCopyFront(String regCertifyCanningCopyFront) {
		this.regCertifyCanningCopyFront = regCertifyCanningCopyFront;
	}
	
	public String getRegCertifyCanningCopyBack() {
		return regCertifyCanningCopyBack;
	}
	
	public void setRegCertifyCanningCopyBack(String regCertifyCanningCopyBack) {
		this.regCertifyCanningCopyBack = regCertifyCanningCopyBack;
	}
	
	public String getAssureBusinessEnterpriseName() {
		return assureBusinessEnterpriseName;
	}
	
	public void setAssureBusinessEnterpriseName(String assureBusinessEnterpriseName) {
		this.assureBusinessEnterpriseName = assureBusinessEnterpriseName;
	}
	
	public String getAssureBusinessLicenseNumber() {
		return assureBusinessLicenseNumber;
	}
	
	public void setAssureBusinessLicenseNumber(String assureBusinessLicenseNumber) {
		this.assureBusinessLicenseNumber = assureBusinessLicenseNumber;
	}
	
	public String getAssureBusinessCertExprireTime() {
		return assureBusinessCertExprireTime;
	}
	
	public void setAssureBusinessCertExprireTime(String assureBusinessCertExprireTime) {
		this.assureBusinessCertExprireTime = assureBusinessCertExprireTime;
	}
	
	public String getAssureBusinessScope() {
		return assureBusinessScope;
	}
	
	public void setAssureBusinessScope(String assureBusinessScope) {
		this.assureBusinessScope = assureBusinessScope;
	}
	
	public String getAssureBusinessOrganizeCode() {
		return assureBusinessOrganizeCode;
	}
	
	public void setAssureBusinessOrganizeCode(String assureBusinessOrganizeCode) {
		this.assureBusinessOrganizeCode = assureBusinessOrganizeCode;
	}
	
	public String getAssureBusinessTelNumber() {
		return assureBusinessTelNumber;
	}
	
	public void setAssureBusinessTelNumber(String assureBusinessTelNumber) {
		this.assureBusinessTelNumber = assureBusinessTelNumber;
	}
	
	public String getAssureBusinessLicenseScanningCopy() {
		return assureBusinessLicenseScanningCopy;
	}
	
	public void setAssureBusinessLicenseScanningCopy(String assureBusinessLicenseScanningCopy) {
		this.assureBusinessLicenseScanningCopy = assureBusinessLicenseScanningCopy;
	}
	
	public String getAssurePaperImage() {
		return assurePaperImage;
	}
	
	public void setAssurePaperImage(String assurePaperImage) {
		this.assurePaperImage = assurePaperImage;
	}
	
	public String getAuditpic() {
		return auditpic;
	}
	
	public void setAuditpic(String auditpic) {
		this.auditpic = auditpic;
	}
	
}