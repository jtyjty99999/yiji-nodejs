package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com on 2016/8/26.
 */
@OpenApiMessage(service = "openPaymentAccount", type = ApiMessageType.Request)
public class OpenPaymentAccountRequest extends ApiRequest {

    @OpenApiField(desc = "终端类型",demo = "PC",constraint = "默认取user agent")
    private String userTerminalType;

    @OpenApiField(desc = "用户注册类型",demo = "PERSONAL")
    private String registerUserType;

    @NotBlank
    @Length(max = 100)
    @OpenApiField(desc = "外部用户id",demo = "216521651821")
    private String outUserId;

    @Length(min = 20,max = 20)
    @OpenApiField(desc = "易极付用户id",demo = "216521651821")
    private String userId;

    @Length(max = 1,min = 1)
    @OpenApiField(desc = "是否需要展示标题",demo = "1",constraint = "{\"data\":[\"1:需要标题\",\"0:不需要标题\",\"默认是1：需要\"],\"name\":\"企业/个体户可传入该参数\"}")
    private String title = "1";

    @Length(min = 1,max = 1)
    @OpenApiField(desc = "营业执照类型",demo = "G",constraint = "{\"data\":[\"G：普通营业执照\",\"S：三合一营业执照\"],\"name\":\"企业/个体户可传入该参数\"}")
    private String enterpriseLicenseType;

    @Length(max = 100)
    @OpenApiField(desc = "企业名称",demo = "重庆易极付科技有限公司",constraint = "企业/个体户可传入该参数")
    private String enterpriseName;

    @Length(max = 32)
    @OpenApiField(desc = "营业执照号",demo = "safasdfdasasfds",constraint = "企业/个体户可传入该参数")
    private String licenceNo;

    @Length(max = 20)
    @OpenApiField(desc = "单位所在省",demo = "重庆",constraint = "企业/个体户可传入该参数")
    private String province;

    @Length(max = 20)
    @OpenApiField(desc = "单位所在市",demo = "重庆",constraint = "企业/个体户可传入该参数")
    private String city;

    @Length(max = 255)
    @OpenApiField(desc = "单位所在地址",demo = "重庆市渝北区黄山大道中段",constraint = "企业/个体户可传入该参数")
    private String address;

    @OpenApiField(desc = "营业期限",demo = "2016-12-05",constraint = "企业/个体户可传入该参数，格式：yyyy-MM-dd")
    private String businessTerm;

    @Length(max = 500)
    @OpenApiField(desc = "经营范围",demo = "计算机经营",constraint = "企业/个体户可传入该参数")
    private String businessScope;

    @Length(max = 64)
    @OpenApiField(desc = "组织结构代码",demo = "35541065sdf",constraint = "企业/个体户可传入该参数")
    private String organizationCode;

    @OpenApiField(desc = "控股人类型",demo = "HOLDING_COM",constraint = "企业/个体户可传入该参数")
    private String holdingType;

    @OpenApiField(desc = "手机号码",demo = "10086100101",constraint = "个人用户可以传入该参数")
    private String mobile;

    @OpenApiField(desc = "职业",demo = "COMPUTER",constraint = "个人用户可以传入该参数")
    private String profession;

    @OpenApiField(desc = "营业执照照片路径",demo = "http://www.yiji.com/1.jpg",constraint = "企业/个体户可传入该参数")
    private String licensePhotoPath;

    @OpenApiField(desc = "法人身份证正面照片路径",demo = "http://www.yiji.com/1.jpg",constraint = "企业/个体户可传入该参数")
    private String legalCertFrontPath;

    @OpenApiField(desc = "法人身份证反面照片路径",demo = "http://www.yiji.com/1.jpg",constraint = "企业/个体户可传入该参数")
    private String legalCertBackPath;

    @OpenApiField(desc = "组织机构代码证照片",demo = "http://www.yiji.com/1.jpg",constraint = "企业/个体户可传入该参数")
    private String organizationCodePath;

    @OpenApiField(desc = "开户许可证照片路径",demo = "http://www.yiji.com/1.jpg",constraint = "企业/个体户可传入该参数")
    private String openLicensePath;

    @OpenApiField(desc = "税务登记证照片路径",demo = "http://www.yiji.com/1.jpg",constraint = "企业/个体户可传入该参数")
    private String taxCertPath;

    @OpenApiField(desc = "特许经营许可证一",demo = "http://www.yiji.com/1.jpg",constraint = "企业/个体户可传入该参数")
    private String specialBusinessFirst;

    @OpenApiField(desc = "委托授权书照片",demo = "http://www.yiji.com/1.jpg",constraint = "企业/个体户可传入该参数")
    private String attorneyPath;

    @OpenApiField(desc = "代理人身份证正面照片",demo = "http://www.yiji.com/1.jpg",constraint = "企业/个体户可传入该参数")
    private String agentCertFrontPath;

    @OpenApiField(desc = "代理人身份证反面照片",demo = "http://www.yiji.com/1.jpg",constraint = "企业/个体户可传入该参数")
    private String agentCertBackPath;

    @OpenApiField(desc = "个人身份证件正面照片",demo = "http://www.yiji.com/1.jpg",constraint = "个人用户可以传入该参数")
    private String personCertFrontPath;

    @OpenApiField(desc = "个人身份证反面照片",demo = "http://www.yiji.com/1.jpg",constraint = "个人用户可以传入该参数")
    private String personCertBackPath;

    @OpenApiField(desc = "是否设置支付密码",constraint = "false：不设置支付密码；true：设置支付密码；默认true设置支付密码")
    private boolean setPayPwd = true;

    public String getOutUserId() {
        return outUserId;
    }

    public void setOutUserId(String outUserId) {
        this.outUserId = outUserId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEnterpriseLicenseType() {
        return enterpriseLicenseType;
    }

    public void setEnterpriseLicenseType(String enterpriseLicenseType) {
        this.enterpriseLicenseType = enterpriseLicenseType;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusinessTerm() {
        return businessTerm;
    }

    public void setBusinessTerm(String businessTerm) {
        this.businessTerm = businessTerm;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLicensePhotoPath() {
        return licensePhotoPath;
    }

    public void setLicensePhotoPath(String licensePhotoPath) {
        this.licensePhotoPath = licensePhotoPath;
    }

    public String getLegalCertFrontPath() {
        return legalCertFrontPath;
    }

    public void setLegalCertFrontPath(String legalCertFrontPath) {
        this.legalCertFrontPath = legalCertFrontPath;
    }

    public String getLegalCertBackPath() {
        return legalCertBackPath;
    }

    public void setLegalCertBackPath(String legalCertBackPath) {
        this.legalCertBackPath = legalCertBackPath;
    }

    public String getOrganizationCodePath() {
        return organizationCodePath;
    }

    public void setOrganizationCodePath(String organizationCodePath) {
        this.organizationCodePath = organizationCodePath;
    }

    public String getOpenLicensePath() {
        return openLicensePath;
    }

    public void setOpenLicensePath(String openLicensePath) {
        this.openLicensePath = openLicensePath;
    }

    public String getTaxCertPath() {
        return taxCertPath;
    }

    public void setTaxCertPath(String taxCertPath) {
        this.taxCertPath = taxCertPath;
    }

    public String getSpecialBusinessFirst() {
        return specialBusinessFirst;
    }

    public void setSpecialBusinessFirst(String specialBusinessFirst) {
        this.specialBusinessFirst = specialBusinessFirst;
    }

    public String getAttorneyPath() {
        return attorneyPath;
    }

    public void setAttorneyPath(String attorneyPath) {
        this.attorneyPath = attorneyPath;
    }

    public String getAgentCertFrontPath() {
        return agentCertFrontPath;
    }

    public void setAgentCertFrontPath(String agentCertFrontPath) {
        this.agentCertFrontPath = agentCertFrontPath;
    }

    public String getAgentCertBackPath() {
        return agentCertBackPath;
    }

    public void setAgentCertBackPath(String agentCertBackPath) {
        this.agentCertBackPath = agentCertBackPath;
    }

    public String getPersonCertFrontPath() {
        return personCertFrontPath;
    }

    public void setPersonCertFrontPath(String personCertFrontPath) {
        this.personCertFrontPath = personCertFrontPath;
    }

    public String getPersonCertBackPath() {
        return personCertBackPath;
    }

    public void setPersonCertBackPath(String personCertBackPath) {
        this.personCertBackPath = personCertBackPath;
    }

    public boolean isSetPayPwd() {
        return setPayPwd;
    }

    public void setSetPayPwd(boolean setPayPwd) {
        this.setPayPwd = setPayPwd;
    }

    public String getUserTerminalType() {
        return userTerminalType;
    }

    public void setUserTerminalType(String userTerminalType) {
        this.userTerminalType = userTerminalType;
    }

    public String getRegisterUserType() {
        return registerUserType;
    }

    public void setRegisterUserType(String registerUserType) {
        this.registerUserType = registerUserType;
    }

    public String getHoldingType() {
        return holdingType;
    }

    public void setHoldingType(String holdingType) {
        this.holdingType = holdingType;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
