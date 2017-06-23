/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-23 15:48 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-23
 */
@OpenApiMessage(service = "mpayFindBackPayPwd", type = ApiMessageType.Request)
public class MpayFindBackPayPwdRequest extends ApiRequest {

    /**
     * 内部会员号
     */
    @NotNull
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "内部会员号" , demo = "20160521010011618407" , constraint = "")
    private String userId;
    /**
     * 签约号 如果是新卡检验的话，不传改参数
     */
    @Length(max = 20, min = 1)
    @OpenApiField(desc = "签约号" , demo = "FrnuBRi400252z" , constraint = "如果是新卡检验的话，不传改参数")
    private String pactNo;
    /**
     * 找回支付密码的类型 1新卡、0老卡
     */
    @NotNull
    @Length(max = 1, min = 1)
    @OpenApiField(desc = "找回支付密码的类型" , demo = "1" , constraint = "{\"data\":[\"1:新卡\",\"0:老卡\"],\"name\":\"找回支付密码的类型\"}")
    private String type;
    /**
     * 真实姓名
     */
    @NotNull
    @Length(max = 60, min = 1)
    @OpenApiField(desc = "真实姓名" , demo = "熊本熊" , constraint = "")
    private String realName;
    /**
     * 身份证号码
     */
    @NotNull
    @Length(max = 18, min = 15)
    @OpenApiField(desc = "身份证号码" , demo = "522101199502241215" , constraint = "")
    private String certNo;
    /**
     * 手机号
     */
    @NotNull
    @Length(max = 11, min = 11)
    @OpenApiField(desc = "手机号" , demo = "13365467894" , constraint = "")
    private String mobileNo;

    /**
     * 卡号
     * @return
     */
    @NotBlank
    @Length(min = 1, max = 20)
    @OpenApiField(desc = "卡号" , demo = "644848047012148" , constraint = "")
    private String cardNo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
