/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-06 17:06 创建
 *
 */
package com.yiji.openapi.message.mpay.sdk;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-06
 */
@OpenApiMessage(service = "mpayApplyWithdraw", type = ApiMessageType.Request)
public class MpayApplyWithdrawRequest extends ApiRequest {


    /**
     * 内部会员号
     */
    @NotBlank
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "内部会员号", demo = "20160521010011618407", constraint = "内部会员号")
    private String userId;
    /**
     * 签约号 如果是新卡检验的话，不传改参数
     */
    @NotBlank
    @Length(max = 32, min = 1)
    @OpenApiField(desc = "签约编号", demo = "FrnuBRi400252z", constraint = "签约编号")
    private String pactNo;

    @NotNull
    @OpenApiField(desc = "提现金额", demo = "66.66", constraint = "提现金额")
    private Money amount;

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

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }
}
