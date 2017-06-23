/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-23 17:06 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-23
 */
@OpenApiMessage(service = "mpayFourElementVerify", type = ApiMessageType.Request)
public class MpayFourElementVerifyRequest extends ApiRequest {

    /**
     * 交易号
     */
    @NotNull
    @Length(max = 20, min = 1)
    @OpenApiField(desc = "交易号" , demo = "2016052330408796" , constraint = "")
    private String tradeNo;
    /**
     * 银行卡号
     */
    @NotNull
    @Length(max = 20, min = 1)
    @OpenApiField(desc = "银行卡号" , demo = "6448481234875612" , constraint = "")
    private String cardNo;
    /**
     * 真实姓名
     */
    @NotNull
    @Length(max = 60, min = 1)
    @OpenApiField(desc = "真实姓名" , demo = "熊笨熊" , constraint = "")
    private String realName;
    /**
     * 身份证号
     */
    @NotNull
    @Length(max = 18, min = 15)
    @OpenApiField(desc = "身份证号" , demo = "522101199502241215" , constraint = "")
    private String certNo;
    /**
     * 手机号
     */
    @NotNull
    @Length(max = 11, min = 11)
    @OpenApiField(desc = "手机号" , demo = "13502586541" , constraint = "")
    private String mobileNo;

    public String getTradeNo() {

        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
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
}
