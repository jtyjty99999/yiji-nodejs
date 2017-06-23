/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-02-05 15:53 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.message.common.certify.info.StatusEnum;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/2/5
 */
@Deprecated
@OpenApiMessage(service = "new_authorize_query", type = ApiMessageType.Response)
public class NewAuthorizeQueryResponse extends ApiResponse {

    @OpenApiField(desc = "消息",demo="消息")
    private String message;
    @OpenApiField(desc = "认证方式",demo="0x00000000",constraint = "{\"data\":[\"0x00000000:未认证\",\"0x00000001:身份证快速认证\",\"0x00000004:银行快键认证\",\"0x00010000:银行卡认证\",\"0x00000010:个人普通认证\",\"0x00000040:个人增强认证\",\"0x00000100:打款认证\",\"0x00000400:担保认证\",\"0x00001000:企业普通认证\"],\"name\":\"认证方式\"}")
    private String method;
    @OpenApiField(desc = "认证状态",demo="ATP")
    private StatusEnum status;
    @OpenApiField(desc = "实名通过日期",demo="2014-11-02",constraint = "格式：YYYY-MM-DD")
    private String certifyPassDate;
    @OpenApiField(desc = "真实姓名",demo="张开军")
    private String realName;
    @OpenApiField(desc = "证件号码",demo="201002129123901233")
    private String certNo;
    @OpenApiField(desc = "有效期",demo="2043-12-11")
    private String validityTime;
    @OpenApiField(desc = "属性",demo="XXX")
    private String attribution;
    @OpenApiField(desc = "证件正面路径",demo="http://yiji.com/xxx1.jpg")
    private String certFrontPath;
    @OpenApiField(desc = "证件反面路径",demo="http://yiji.com/xxx2.jpg")
    private String certBackPath;
    @OpenApiField(desc = "法人",demo="王大三")
    private String comName;
    @OpenApiField(desc = "营业执照号码",demo="4523234")
    private String licenceNo;
    @OpenApiField(desc = "法人姓名",demo="刘大海")
    private String legalPersonName;
    @OpenApiField(desc = "法人证件号",demo="4234456456456")
    private String legalPersonCertNo;
    @OpenApiField(desc = "法人证件正面地址",demo="http://yiji.com/xxx1.jpg")
    private String legalPersonCertFrontPath;
    @OpenApiField(desc = "法人证件背面地址",demo="http://yiji.com/xxx1.jpg")
    private String legalPersonCertBackPath;
    @OpenApiField(desc = "是否以代办人申请实名认证",constraint = "Y:是，N:否",demo="N")
    private String isLegalPerAudit;
    @OpenApiField(desc = "代办人证件号",demo="86165165156156")
    private String agentPersonCertNo;
    @OpenApiField(desc = "代办人姓名",demo="张三")
    private String agentPersonName;
    @OpenApiField(desc = "代办人证件正面照片",demo="http://yiji.com/xxx1.jpg")
    private String agentPersonCertFrontPath;
    @OpenApiField(desc = "代办人证件背面照片",demo="http://yiji.com/xxx1.jpg")
    private String agentPersonCertBackPath;
    @OpenApiField(desc = "传真号码",demo="02812341234")
    private String taxAuthorityNo;
    @OpenApiField(desc = "组织代码",demo="234234234")
    private String organizationCode;
    @OpenApiField(desc = "营业年限",demo="10")
    private String comCycle;
    @OpenApiField(desc = "地址",demo="武侯区XXXX")
    private String address;
    @OpenApiField(desc = "手机号",demo="13212345678")
    private String phone;
    @OpenApiField(desc = "省",demo="四川")
    private String provName;
    @OpenApiField(desc = "城市",demo="成都")
    private String cityName;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getCertifyPassDate() {
        return certifyPassDate;
    }

    public void setCertifyPassDate(String certifyPassDate) {
        this.certifyPassDate = certifyPassDate;
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

    public String getValidityTime() {
        return validityTime;
    }

    public void setValidityTime(String validityTime) {
        this.validityTime = validityTime;
    }

    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
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

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getLegalPersonName() {
        return legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
    }

    public String getLegalPersonCertNo() {
        return legalPersonCertNo;
    }

    public void setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
    }

    public String getLegalPersonCertFrontPath() {
        return legalPersonCertFrontPath;
    }

    public void setLegalPersonCertFrontPath(String legalPersonCertFrontPath) {
        this.legalPersonCertFrontPath = legalPersonCertFrontPath;
    }

    public String getLegalPersonCertBackPath() {
        return legalPersonCertBackPath;
    }

    public void setLegalPersonCertBackPath(String legalPersonCertBackPath) {
        this.legalPersonCertBackPath = legalPersonCertBackPath;
    }

    public String getIsLegalPerAudit() {
        return isLegalPerAudit;
    }

    public void setIsLegalPerAudit(String isLegalPerAudit) {
        this.isLegalPerAudit = isLegalPerAudit;
    }

    public String getAgentPersonCertNo() {
        return agentPersonCertNo;
    }

    public void setAgentPersonCertNo(String agentPersonCertNo) {
        this.agentPersonCertNo = agentPersonCertNo;
    }

    public String getAgentPersonName() {
        return agentPersonName;
    }

    public void setAgentPersonName(String agentPersonName) {
        this.agentPersonName = agentPersonName;
    }

    public String getAgentPersonCertFrontPath() {
        return agentPersonCertFrontPath;
    }

    public void setAgentPersonCertFrontPath(String agentPersonCertFrontPath) {
        this.agentPersonCertFrontPath = agentPersonCertFrontPath;
    }

    public String getAgentPersonCertBackPath() {
        return agentPersonCertBackPath;
    }

    public void setAgentPersonCertBackPath(String agentPersonCertBackPath) {
        this.agentPersonCertBackPath = agentPersonCertBackPath;
    }

    public String getTaxAuthorityNo() {
        return taxAuthorityNo;
    }

    public void setTaxAuthorityNo(String taxAuthorityNo) {
        this.taxAuthorityNo = taxAuthorityNo;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getComCycle() {
        return comCycle;
    }

    public void setComCycle(String comCycle) {
        this.comCycle = comCycle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
