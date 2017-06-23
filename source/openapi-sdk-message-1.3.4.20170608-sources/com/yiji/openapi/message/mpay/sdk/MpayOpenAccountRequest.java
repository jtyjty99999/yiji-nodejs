/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-07-08 17:53 创建
 *
 */
package com.yiji.openapi.message.mpay.sdk;

import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.mpay.sdk.info.CardNos;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author zhike@yiji.com
 */
@OpenApiMessage(service = "mpayOpenAccount", type = ApiMessageType.Request)
public class MpayOpenAccountRequest extends ApiRequest {

    @NotBlank
    @Length(max = 20)
    @OpenApiField(desc = "会员id", constraint = "会员id", demo = "20151208000010595418")
    private String userId;

    @NotBlank
    @Length(max = 32)
    @OpenApiField(desc = "身份证号码", constraint = "身份证号码", demo = "500221198512132310")
    private String certNo;

    @NotBlank
    @Length(max = 20)
    @OpenApiField(desc = "真实姓名", constraint = "真实姓名", demo = "张三")
    private String realName;

    @NotBlank
    @Length(max = 30)
    @OpenApiField(desc = "证件有效期", constraint = "时间格式：YYYY-MM-dd传入“1972-12-12”或者“0”表长期", demo = "1972-12-12")
    private String licenceValidTime;

    @NotBlank
    @Length(max = 200)
    @OpenApiField(desc = "证件正面", constraint = "证件正面", demo = "https://www.baidu.com/a.jpg")
    private String certCorrect;

    @NotBlank
    @Length(max = 200)
    @OpenApiField(desc = "证件反面", constraint = "证件反面", demo = "https://www.baidu.com/a.jpg")
    private String certOpposite;

    @NotBlank
    @Length(max = 40)
    @OpenApiField(desc = "职业", constraint = "职业", demo = "架构师")
    private String profession;

    @NotBlank
    @Length(max = 200)
    @OpenApiField(desc = "地址", constraint = "地址", demo = "重庆渝北土星五楼")
    private String address;

    @OpenApiField(desc = "银行卡号", constraint = "银行卡号,可以传多个", demo = "621776849881425")
    private List<CardNos> cardNos;

    @Length(max = 100)
    @OpenApiField(desc = "学历号", constraint = "学历号", demo = "201215652455")
    private String educationNo;

    @Length(max = 20)
    @OpenApiField(desc = "提现申请流水号", constraint = "学历号、毕业年份必须同时传入才有效毕业年份，例如2009（校验学历时传入）, 只能是4位数字", demo = "2015")
    private String graduateYear;

    @Length(max = 100)
    @OpenApiField(desc = "航空机票证件号", constraint = "航空机票证件号", demo = "20151208000010595418")
    private String airplaneCertNo;

    @OpenApiField(desc = "航空机票证件号类型", constraint = "{\"data\":[\"ID:身份证\",\"PASSPORT:护照\"],\"name\":\"航空机票证件号类型\"}", demo = "PASSPORT")
    private String airplaneCertType;

    /**
     * 手机号
     */
    @Length(min = 11, max = 11, message = "手机号码只能为11位")
    @OpenApiField(desc = "手机号", constraint = "手机号", demo = "13521042757")
    private String mobileNo;
    /**
     * 是否校验驾照渠道:1-校验、0-不校验；默认不校验
     */
    @Length(min = 1, max = 1)
    @OpenApiField(desc = "是否校验驾照渠道", constraint = "{\"data\":[\"1:校验\",\"0:不校验\"],\"name\":\"是否校验驾照渠道\"}", demo = "0")
    private String driverCheck = "0";

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

    public String getLicenceValidTime() {
        return licenceValidTime;
    }

    public void setLicenceValidTime(String licenceValidTime) {
        this.licenceValidTime = licenceValidTime;
    }

    public String getCertCorrect() {
        return certCorrect;
    }

    public void setCertCorrect(String certCorrect) {
        this.certCorrect = certCorrect;
    }

    public String getCertOpposite() {
        return certOpposite;
    }

    public void setCertOpposite(String certOpposite) {
        this.certOpposite = certOpposite;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<CardNos> getCardNos() {
        return cardNos;
    }

    public void setCardNos(List<CardNos> cardNos) {
        this.cardNos = cardNos;
    }

    public String getEducationNo() {
        return educationNo;
    }

    public void setEducationNo(String educationNo) {
        this.educationNo = educationNo;
    }

    public String getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(String graduateYear) {
        this.graduateYear = graduateYear;
    }

    public String getAirplaneCertNo() {
        return airplaneCertNo;
    }

    public void setAirplaneCertNo(String airplaneCertNo) {
        this.airplaneCertNo = airplaneCertNo;
    }

    public String getAirplaneCertType() {
        return airplaneCertType;
    }

    public void setAirplaneCertType(String airplaneCertType) {
        this.airplaneCertType = airplaneCertType;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getDriverCheck() {
        return driverCheck;
    }

    public void setDriverCheck(String driverCheck) {
        this.driverCheck = driverCheck;
    }
}
