/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-08-11 17:41 创建
 *
 */
package com.yiji.openapi.message.common.transferAccounts;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "commonSpecialTransfersThaw", type = ApiMessageType.Request)
public class CommonSpecialTransfersThawRequest extends ApiRequest{

    @NotBlank
    @OpenApiField(desc = "用户ID",constraint = "用户ID",demo = "20140809010000051239")
    private String userId;

    @NotNull
    @OpenApiField(desc = "解冻金额",constraint = "解冻金额",demo = "88.66")
    private Money amount;

    /** 商户订单号 */
    @NotBlank
    @Length(max = 64, min = 1)
    @OpenApiField(desc = "商户订单号",demo = "1234569780245664")
    private String merchantOrderNo;

    @Length(max = 128)
    @OpenApiField(desc = "交易备注",demo = "备注")
    private String memo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
