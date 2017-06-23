/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-20 09:41 创建
 *
 */
package com.yiji.openapi.message.mpay.common;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.message.mpay.enums.PurposeEnum;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-20
 */
@OpenApiMessage(service = "mpayBindCard", type = ApiMessageType.Request)
public class MpayBindCardRequest extends ApiRequest {
    /**
     * 会员号
     */
    @Length(max = 64, min = 1)
    @OpenApiField(desc = "会员号" , demo = "20160418010011058184" , constraint = "")
    private String userId;
    /**
     * 会员类型
     */
    @OpenApiField(desc = "会员类型" , demo = "INNER" , constraint = "")
    private String userType;
    /**
     * 银行卡号
     */
    @NotNull
    @Length(min = 15, max = 20)
    @OpenApiField(desc = "银行卡号" , demo = "6221455498874556" , constraint = "")
    private String cardNo;
    /**
     * 真实姓名
     */
    @Length(min = 2, max = 60)
    @OpenApiField(desc = "真实姓名" , demo = "熊本熊" , constraint = "")
    private String realName;
    /**
     * 身份证号
     */
    @Length(min = 15, max = 18)
    @OpenApiField(desc = "身份证号" , demo = "522101199202241215" , constraint = "")
    private String certNo;
    /**
     * 手机号
     */
    @NotNull
    @Length(min = 11, max = 11)
    @OpenApiField(desc = "手机号" , demo = "13618451234" , constraint = "")
    private String mobileNo;
    /**
     * cvv
     */
    @Length(max = 4)
    @OpenApiField(desc = "cvv" , demo = "" , constraint = "只有招商银行信用卡才传")
    private String cvv;
    /**
     * 有效期
     */
    @Length(max = 6)
    @OpenApiField(desc = "有效期" , demo = "2020-05-23" , constraint = "只有招商银行信用卡才传")
    private String valiDate;

    @OpenApiField(desc = "签约用途" , demo = "DEDUCT" , constraint = "签约用途 :DEDUCT、WITHDRAW。默认为DEDUCT")
    private PurposeEnum purpose = PurposeEnum.DEDUCT;

    public PurposeEnum getPurpose() {
        return purpose;
    }

    public void setPurpose(PurposeEnum purpose) {
        this.purpose = purpose;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getValiDate() {
        return valiDate;
    }

    public void setValiDate(String valiDate) {
        this.valiDate = valiDate;
    }
}
