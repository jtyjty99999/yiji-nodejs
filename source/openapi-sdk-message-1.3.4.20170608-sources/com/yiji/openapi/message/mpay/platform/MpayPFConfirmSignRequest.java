/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-09-10 14:53 创建
 *
 */
package com.yiji.openapi.message.mpay.platform;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mpayPFConfirmSign", type = ApiMessageType.Request)
public class MpayPFConfirmSignRequest extends ApiRequest {

    /**
     * 签约流水号
     */
    @NotBlank
    @Length(max = 20, min = 1, message = "签约流水号不能为空")
    @OpenApiField(desc = "签约流水号",demo = "213564789021565")
    private String pactNo;

    /**
     * 外部会员id
     */
    @NotBlank
    @Length(max = 200, min = 1, message = "外部会员id不能为空")
    @OpenApiField(desc = "外部会员id",demo = "12345678901234567890")
    private String partnerUserId;

    /**
     * 支付密码
     */
    @OpenApiField(desc = "支付密码", security = true,demo = "212456123",constraint = "请加密之后传输")
    private String payPassword;

    /**
     * 短信验证码
     */
    @NotBlank
    @Length(max = 10, min = 1, message = "短信验证码不能为空")
    @OpenApiField(desc = "短信验证码",demo = "123456")
    private String verifyCode;

    public String getPactNo() {
        return this.pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    @JSONField(serialize = false)
    public String getPayPassword() {
        return this.payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getPartnerUserId() {
        return this.partnerUserId;
    }

    public void setPartnerUserId(String partnerUserId) {
        this.partnerUserId = partnerUserId;
    }
}
