/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-23 10:59 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

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
@OpenApiMessage(service = "mpayDeductPay", type = ApiMessageType.Request)
public class MpayDeductPayRequest extends ApiRequest {

    /**
     * 签约号
     */
    @Length(max = 20, min = 1)
    @OpenApiField(desc = "签约号" , demo = "FrnuBRi400252z" , constraint = "")
    private String pactNo;
    /**
     * 交易号
     */
    @NotBlank
    @Length(max = 20, min = 1)
    @OpenApiField(desc = "交易号" , demo = "" , constraint = "")
    private String tradeNo;
    /**
     * 短信验证码
     */
    @Length(max = 6, min = 6)
    @OpenApiField(desc = "短信验证码" , demo = "568912" , constraint = "如果超过一万则需要短信验证码")
    private String verifyCode;
    /**
     * 易极付会员编号
     */
    @NotBlank
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "易极付会员编号" , demo = "20150729020006847500" , constraint = "")
    private String userId;
    /**
     * 支付密码
     */
    @Length(max = 256)
    @OpenApiField(desc = "支付密码" , demo = "568923" , constraint = "" , security = true)
    private String payPassword;
    /**
     * 支付方式
     */
    @NotBlank
    @OpenApiField(desc = "支付方式" , demo = "CARD" , constraint = "")
    private String paymentMethod;
    /**
     * 支付类型
     */
    @NotBlank
    @OpenApiField(desc = "支付类型" , demo = "NORMAL" , constraint = "")
    private String paymentType;


    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
