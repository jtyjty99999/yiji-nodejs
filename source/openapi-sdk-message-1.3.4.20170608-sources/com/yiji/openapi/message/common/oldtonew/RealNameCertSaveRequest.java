/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-25 14:19 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/25
 */
@Deprecated
@OpenApiMessage(service = "realNameCert.save", type = ApiMessageType.Request)
public class RealNameCertSaveRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "实名类型", constraint = "{\"data\":[\"personal:个人\",\"business:企业\"],\"name\":\"实名类型\"}",
			demo = "personal")
	private String certType;
	
	@OpenApiField(desc = "真实姓名", constraint = "真实姓名", demo = "唐三藏")
	private String nickname;
	
	@OpenApiField(desc = "用户ID", constraint = "用户ID", demo = "20238981293123123")
	private String coreCustomerUserId;
	
	@OpenApiField(
			desc = "证件类型",
			constraint = "{\"data\":[\"1:一代身份证\",\"2:二代身份证\",\"3:临时身份证\",\"4:回乡证\",\"5:台胞证\",\"6:护照\",\"7:港澳身份证\",\"8:台湾身份证\",\"9:营业执照\",\"10:其它\"],\"name\":\"证件类型\"}",
			demo = "1")
	private String cardtype;
	
	@OpenApiField(desc = "证件号码", constraint = "证件号码", demo = "1029372812372323")
	private String cardid;
	
	@OpenApiField(desc = "证件正面", constraint = "证件正面", demo = "/var/a.jpg")
	private String cardpic;
	
	@OpenApiField(desc = "证件反面", constraint = "证件反面", demo = "/var/a.jpg")
	private String cardpic1;
	
	@OpenApiField(desc = "电话号码", constraint = "电话号码", demo = "023664721")
	private String phone;
	
	@OpenApiField(desc = "手机号码", constraint = "手机号码", demo = "13898471883")
	private String mobile;
	
	@OpenApiField(desc = "地址", constraint = "地址", demo = "重庆市两江新区黄山大道中段木星1区5楼")
	private String address;
	
	@OpenApiField(desc = "卡有效期", constraint = "卡有效期", demo = "291282")
	private Integer cardoff;
	
	//企业实名认证
	@OpenApiField(desc = "营业执照所在地 市名称", constraint = "营业执照所在地 市名称", demo = "重庆市")
	private String cityname;
	
	@OpenApiField(desc = "公司地址", constraint = "公司地址", demo = "杭州A区东路29-29")
	private String comAddress;
	
	@OpenApiField(desc = "企业名称或个体户名称", constraint = "企业名称或个体户名称", demo = "重庆易极付科技有限公司")
	private String comName;
	
	@OpenApiField(desc = "公司经营范围", constraint = "公司经营范围", demo = "五金")
	private String comScope;
	
	@OpenApiField(desc = "XXX", constraint = "XXX", demo = "XXX")
	private String conCardid;
	
	@OpenApiField(desc = "传真号", constraint = "传真号", demo = "02343423423")
	private String conFax;
	
	@OpenApiField(desc = "联系人手机", constraint = "联系人手机", demo = "13881231234")
	private String conMobile;
	
	@OpenApiField(desc = "联系人姓名", constraint = "联系人姓名", demo = "张凯")
	private String conName;
	
	@OpenApiField(desc = "联系人电话", constraint = "联系人电话", demo = "13881231234")
	private String conPhone;
	
	@OpenApiField(desc = "错误信息", constraint = "错误信息", demo = "无")
	private String errormsg;
	
	@OpenApiField(desc = "营业执照副本图片", constraint = "营业执照副本图片", demo = "/var/a.jpg")
	private String licence;
	
	@OpenApiField(desc = "营业执照副本加盖公章图片", constraint = "营业执照副本加盖公章图片", demo = "/var/a.jpg")
	private String licencecopy;
	
	@OpenApiField(desc = "营业执照号码", constraint = "营业执照号码", demo = "B-AD12")
	private String licencenum;
	
	@OpenApiField(desc = "税务机关号", constraint = "税务机关号", demo = "123123")
	private String taxAuthority;
	
	@OpenApiField(desc = "组织机构代码证号", constraint = "组织机构代码证号", demo = "009")
	private String organizationcode;
	
	@OpenApiField(desc = "营业执照所在地 省份名称", constraint = "营业执照所在地 省份名称", demo = "重庆")
	private String provname;
	
	@OpenApiField(desc = "股东或实际控制人证件正面图片", constraint = "股东或实际控制人证件正面图片", demo = "/var/a.jpg")
	private String legalPersonCardPic;
	
	@OpenApiField(desc = "股东或实际控制人证件背面图片", constraint = "股东或实际控制人证件背面图片", demo = "/var/a.jpg")
	private String legalPersonCardPic1;

	@OpenApiField(
			desc = "法人或经营者证件类型",
			constraint = "{\"data\":[\"1:一代身份证\",\"2:二代身份证\",\"3:临时身份证\",\"4:回乡证\",\"5:台胞证\",\"6:护照\",\"7:港澳身份证\",\"8:台湾身份证\",\"9:营业执照\",\"10:其它\"],\"name\":\"证件类型\"}",
			demo = "1")
	private String legalPersonCardType;
	
	@OpenApiField(desc = "法人或者经营者证件号", constraint = "法人或者经营者证件号", demo = "123412341234")
	private String legalPersonCardid;
	
	@OpenApiField(desc = "代办人真实姓名", constraint = "代办人真实姓名", demo = "陈开国")
	private String agentPersonName;
	
	@OpenApiField(desc = "代办人身份证号", constraint = "代办人身份证号", demo = "123123123")
	private String agentPersonCardid;
	
	@OpenApiField(desc = "担保函图片", constraint = "担保函图片", demo = "/var/1.jpg")
	private String backLetterPic;
	
	@OpenApiField(desc = "是否以代办人申请实名认证", constraint = "{\"data\":[\"Y:是\",\"N:否\"],\"name\":\"是否以代办人申请实名认证\"}",
			demo = "Y")
	private String isLegalPerAudit;
	
	@OpenApiField(desc = "代办人证件正面图", constraint = "代办人证件正面图", demo = "/var/1.jpg")
	private String agentPersonCardPic;
	
	@OpenApiField(desc = "代办人证件反面图", constraint = "代办人证件反面图", demo = "/var/1.jpg")
	private String agentPersonCardPic1;
	
	@OpenApiField(desc = "营业年限", constraint = "正常：20120911, 长期:0", demo = "20120911")
	private Integer comCycle;
	
	@OpenApiField(desc = "股东或实际控制人证件到期时间", constraint = "长期:0", demo = "20120911")
	private Integer legalPersonCardOff;
	
	@OpenApiField(desc = "股东或实际控制人证件到期时间", constraint = "长期:0，优先取legalPersonCardOff", demo = "20120911")
	private Integer agentPersonCardOff;
	
	public String getCertType() {
		return certType;
	}
	
	public void setCertType(String certType) {
		this.certType = certType;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getCardtype() {
		return cardtype;
	}
	
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	
	public String getCardid() {
		return cardid;
	}
	
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	
	public String getCardpic() {
		return cardpic;
	}
	
	public void setCardpic(String cardpic) {
		this.cardpic = cardpic;
	}
	
	public String getCardpic1() {
		return cardpic1;
	}
	
	public void setCardpic1(String cardpic1) {
		this.cardpic1 = cardpic1;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Integer getCardoff() {
		return cardoff;
	}
	
	public void setCardoff(Integer cardoff) {
		this.cardoff = cardoff;
	}
	
	public String getCoreCustomerUserId() {
		return coreCustomerUserId;
	}
	
	public void setCoreCustomerUserId(String coreCustomerUserId) {
		this.coreCustomerUserId = coreCustomerUserId;
	}
	
	public String getCityname() {
		return cityname;
	}
	
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	
	public String getComAddress() {
		return comAddress;
	}
	
	public void setComAddress(String comAddress) {
		this.comAddress = comAddress;
	}
	
	public String getComName() {
		return comName;
	}
	
	public void setComName(String comName) {
		this.comName = comName;
	}
	
	public String getComScope() {
		return comScope;
	}
	
	public void setComScope(String comScope) {
		this.comScope = comScope;
	}
	
	public String getConCardid() {
		return conCardid;
	}
	
	public void setConCardid(String conCardid) {
		this.conCardid = conCardid;
	}
	
	public String getConFax() {
		return conFax;
	}
	
	public void setConFax(String conFax) {
		this.conFax = conFax;
	}
	
	public String getConMobile() {
		return conMobile;
	}
	
	public void setConMobile(String conMobile) {
		this.conMobile = conMobile;
	}
	
	public String getConName() {
		return conName;
	}
	
	public void setConName(String conName) {
		this.conName = conName;
	}
	
	public String getConPhone() {
		return conPhone;
	}
	
	public void setConPhone(String conPhone) {
		this.conPhone = conPhone;
	}
	
	public String getErrormsg() {
		return errormsg;
	}
	
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	
	public String getLicence() {
		return licence;
	}
	
	public void setLicence(String licence) {
		this.licence = licence;
	}
	
	public String getLicencecopy() {
		return licencecopy;
	}
	
	public void setLicencecopy(String licencecopy) {
		this.licencecopy = licencecopy;
	}
	
	public String getLicencenum() {
		return licencenum;
	}
	
	public void setLicencenum(String licencenum) {
		this.licencenum = licencenum;
	}
	
	public String getTaxAuthority() {
		return taxAuthority;
	}
	
	public void setTaxAuthority(String taxAuthority) {
		this.taxAuthority = taxAuthority;
	}
	
	public String getOrganizationcode() {
		return organizationcode;
	}
	
	public void setOrganizationcode(String organizationcode) {
		this.organizationcode = organizationcode;
	}
	
	public String getProvname() {
		return provname;
	}
	
	public void setProvname(String provname) {
		this.provname = provname;
	}
	
	public String getLegalPersonCardPic() {
		return legalPersonCardPic;
	}
	
	public void setLegalPersonCardPic(String legalPersonCardPic) {
		this.legalPersonCardPic = legalPersonCardPic;
	}
	
	public String getLegalPersonCardPic1() {
		return legalPersonCardPic1;
	}
	
	public void setLegalPersonCardPic1(String legalPersonCardPic1) {
		this.legalPersonCardPic1 = legalPersonCardPic1;
	}
	
	public String getLegalPersonCardid() {
		return legalPersonCardid;
	}
	
	public void setLegalPersonCardid(String legalPersonCardid) {
		this.legalPersonCardid = legalPersonCardid;
	}
	
	public String getAgentPersonName() {
		return agentPersonName;
	}
	
	public void setAgentPersonName(String agentPersonName) {
		this.agentPersonName = agentPersonName;
	}
	
	public String getAgentPersonCardid() {
		return agentPersonCardid;
	}
	
	public void setAgentPersonCardid(String agentPersonCardid) {
		this.agentPersonCardid = agentPersonCardid;
	}
	
	public String getBackLetterPic() {
		return backLetterPic;
	}
	
	public void setBackLetterPic(String backLetterPic) {
		this.backLetterPic = backLetterPic;
	}
	
	public String getIsLegalPerAudit() {
		return isLegalPerAudit;
	}
	
	public void setIsLegalPerAudit(String isLegalPerAudit) {
		this.isLegalPerAudit = isLegalPerAudit;
	}

	public String getAgentPersonCardPic() {
		return agentPersonCardPic;
	}
	
	public void setAgentPersonCardPic(String agentPersonCardPic) {
		this.agentPersonCardPic = agentPersonCardPic;
	}
	
	public String getAgentPersonCardPic1() {
		return agentPersonCardPic1;
	}
	
	public void setAgentPersonCardPic1(String agentPersonCardPic1) {
		this.agentPersonCardPic1 = agentPersonCardPic1;
	}
	
	public Integer getComCycle() {
		return comCycle;
	}
	
	public void setComCycle(Integer comCycle) {
		this.comCycle = comCycle;
	}
	
	public Integer getLegalPersonCardOff() {
		return legalPersonCardOff;
	}
	
	public void setLegalPersonCardOff(Integer legalPersonCardOff) {
		this.legalPersonCardOff = legalPersonCardOff;
	}
	
	public Integer getAgentPersonCardOff() {
		return agentPersonCardOff;
	}
	
	public void setAgentPersonCardOff(Integer agentPersonCardOff) {
		this.agentPersonCardOff = agentPersonCardOff;
	}

	public String getLegalPersonCardType() {
		return legalPersonCardType;
	}

	public void setLegalPersonCardType(String legalPersonCardType) {
		this.legalPersonCardType = legalPersonCardType;
	}
}
