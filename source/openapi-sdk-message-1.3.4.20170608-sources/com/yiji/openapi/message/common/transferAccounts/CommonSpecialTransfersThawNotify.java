/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-08-11 17:42 创建
 *
 */
package com.yiji.openapi.message.common.transferAccounts;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "commonSpecialTransfersThaw", type = ApiMessageType.Notify)
public class CommonSpecialTransfersThawNotify extends ApiNotify {

    @OpenApiField(desc = "商户订单号",demo = "12346579801456")
    private String merchantOrderNo;

    @OpenApiField(desc = "业务订单号",demo = "12313646584658")
    private String bizNo;

    @OpenApiField(desc = "金额",demo = "88.66")
    private Money amount;

    @OpenApiField(desc = "失败原因",demo = "金额不足")
    private String failReason;

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }
}
