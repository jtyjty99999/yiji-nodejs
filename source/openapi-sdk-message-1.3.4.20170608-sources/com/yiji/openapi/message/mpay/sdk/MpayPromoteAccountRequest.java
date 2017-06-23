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
 * Created by hgeshu@yiji.com on 2016/7/14.
 */
@OpenApiMessage(service = "mpayPromoteAccount", type = ApiMessageType.Request)
public class MpayPromoteAccountRequest extends ApiRequest {

    /**
     * 用户级别，默认3类 请参考
     */
    @OpenApiField(desc = "用户级别",demo = "3",constraint = "默认3")
    private String userLevel = "3";

    /**
     * 内部会员号
     */
    @NotBlank
    @Length(min = 20, max = 20)
    @OpenApiField(desc = "易极付用户ID",demo = "12345678901234567498")
    private String userId;

    /**
     * 更新证件正面照片
     */
    @Length(min = 1, max = 200)
    @OpenApiField(desc = "更新证件正面照片",demo = "http://www.yiji.com/1.jpg",constraint = "身份证正面图片地址、身份证背面图片地址、有效期必须同时传入才有效")
    private String certFrontPath;

    /**
     * 更新证件背面照片
     */
    @Length(min = 1, max = 200)
    @OpenApiField(desc = "更新证件背面照片",demo = "http://www.yiji.com/1.jpg",constraint = "身份证正面图片地址、身份证背面图片地址、有效期必须同时传入才有效")
    private String certBackPath;

    /**
     * 更新证件有效期
     */
    @Length(min = 1, max = 30)
    @OpenApiField(desc = "更新证件有效期",demo = "2020-12-12",constraint = "时间格式：YYYY-MM-dd,传入 “0”表长期")
    private String licenceValidTime;

    /**
     * 银行卡号
     */
    @OpenApiField(desc = "银行卡列表",demo = "[62512561265841,42165321654]")
    private List<CardNos> cardNos;
    /**
     * 学历号
     */
    @OpenApiField(desc = "学历号",demo = "12354156")
    @Length(min = 1, max = 100)
    private String educationNo;
    /**
     * 毕业年份
     */
    @OpenApiField(desc = "毕业年份",demo = "2015")
    @Length(min = 4, max = 4)
    private String graduateYear;
    /**
     * 航空机票证件号
     */
    @OpenApiField(desc = "航空机票证件号",demo = "12652165126574")
    @Length(min = 1, max = 100)
    private String airplaneCertNo;
    /**
     * 航空机票证件号类型
     */
    @OpenApiField(desc = "航空机票证件类型",demo = "PASSPORT")
    private String airplaneCertType;
    /**
     * 手机号
     */
    @OpenApiField(desc = "手机号",demo = "10086100101",constraint = "校验运营商是传入")
    @Length(min = 11, max = 11)
    private String mobileNo;
    /**
     * 是否校验驾照渠道:1-校验、0-不校验；默认不校验
     */
    @OpenApiField(desc = "是否校验驾照渠道",demo = "0",constraint = "{\"data\":[\"1:校验\",\"0:不校验\",\"默认不校验\"],\"name\":\"是否校验驾照渠道\"}")
    @Length(min = 1, max = 1)
    private String driverCheck = "0";

//    @Override
//    public void check() throws OrderCheckException {
//        if (!(StringUtils.isNotBlank(certFrontPath) && StringUtils.isNotBlank(certBackPath) && StringUtils.isNotBlank(licenceValidTime))){
//            if (!(StringUtils.isBlank(certFrontPath) && StringUtils.isBlank(certBackPath) && StringUtils.isBlank(licenceValidTime))){
//                throw new ApiServiceException(ApiServiceResultCode.PARAMETER_ERROR,"身份证正面图片地址、身份证背面图片地址、有效期必须同时传入才有效");
//            }
//        }
//        if (!(StringUtils.isNotBlank(educationNo) && StringUtils.isNotBlank(graduateYear))){
//            if (!(StringUtils.isBlank(educationNo) && StringUtils.isBlank(graduateYear))){
//                throw new ApiServiceException(ApiServiceResultCode.PARAMETER_ERROR,"学历号、毕业年份必须同时传入才有效");
//            }
//        }
//        if (!(StringUtils.isNotBlank(airplaneCertNo) && airplaneCertType != null)){
//            if (!(StringUtils.isBlank(airplaneCertNo) && airplaneCertType == null)){
//                throw new ApiServiceException(ApiServiceResultCode.PARAMETER_ERROR,"航空机票证件号航空机票证件号类型必须同时传入才有效");
//            }
//        }
//    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getLicenceValidTime() {
        return licenceValidTime;
    }

    public void setLicenceValidTime(String licenceValidTime) {
        this.licenceValidTime = licenceValidTime;
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
