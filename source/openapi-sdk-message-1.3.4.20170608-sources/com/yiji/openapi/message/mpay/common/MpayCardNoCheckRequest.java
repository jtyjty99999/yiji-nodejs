/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-20 09:15 创建
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
@OpenApiMessage(service = "mpayCardNoCheck", type = ApiMessageType.Request)
public class MpayCardNoCheckRequest extends ApiRequest {
    /**
     * 银行卡卡号
     */
    @NotNull
    @Length(max = 20, min = 1)
    @OpenApiField(desc = "银行卡卡号", demo = "6212199235569444", constraint = "")
    private String cardNo;

    @OpenApiField(desc = "用途", demo = "DEDUCT", constraint = "传入时校验是否支持，不传的时候不校验")
    private PurposeEnum purpose;

    @OpenApiField(desc = "内部会员号", demo = "20151123020000082860", constraint = "用途是VERIFY（校验）的时候才有用 ，用途是VERIFY（校验）的时候必传")
    private String userId;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public PurposeEnum getPurpose() {
        return this.purpose;
    }

    public void setPurpose(PurposeEnum purpose) {
        this.purpose = purpose;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
