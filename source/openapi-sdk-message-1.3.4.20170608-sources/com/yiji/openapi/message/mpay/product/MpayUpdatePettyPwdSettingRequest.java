/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-23 16:56 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-23
 */
@OpenApiMessage(service = "mpayUpdatePettyPwdSetting", type = ApiMessageType.Request)
public class MpayUpdatePettyPwdSettingRequest extends ApiRequest {

    /**
     * 内部会员号
     */
    @NotNull
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "内部会员号" , demo = "20151130010009440067" , constraint = "")
    private String userId;
    /**
     * 是否开通小额免密支付 1开通、0不开通
     */
    @NotNull
    @Length(max = 1)
    @OpenApiField(desc = "是否开通小额免密支付" , demo = "20151130010009440067" , constraint = "\"{\"data\":[\"1:开通\",\"0:不开通\"],\"name\":\"是否开通小额免密支付\"}\"")
    private String microPayStatus;
    /**
     * 小额免密额度
     */
    @OpenApiField(desc = "小额免密额度" , demo = "200000" , constraint = "")
    private Money microMaxAmount;
    /**
     * 支付密码
     */
    @Length(max = 256)
    @OpenApiField(desc = "支付密码" , demo = "455623" , constraint = "" , security = true)
    private String payPassword;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMicroPayStatus() {
        return microPayStatus;
    }

    public void setMicroPayStatus(String microPayStatus) {
        this.microPayStatus = microPayStatus;
    }

    public Money getMicroMaxAmount() {
        return microMaxAmount;
    }

    public void setMicroMaxAmount(Money microMaxAmount) {
        this.microMaxAmount = microMaxAmount;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }
}
