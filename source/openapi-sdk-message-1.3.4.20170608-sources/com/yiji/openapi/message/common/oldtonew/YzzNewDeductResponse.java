/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-19 14:53 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/19
 */
@OpenApiMessage(service = "yzzNewDeduct", type = ApiMessageType.Response)
public class YzzNewDeductResponse extends ApiResponse {

    @OpenApiField(desc = "充值流水ID",demo = "20130812020055285248")
    private String depositId;

    @OpenApiField(desc = "外部订单号",demo = "20130812020055285248")
    private String outBizNo;

    @OpenApiField(desc = "应付实收额",demo = "20130812020055285248")
    private Money amountIn;

    @OpenApiField(desc = "应付额",demo = "20130812020055285248")
    private Money amount;

    @OpenApiField(desc = "用户ID",demo = "20130812020055285248")
    private String userId;

    @OpenApiField(desc = "银行卡号",demo = "20130812020055285248")
    private String bankAccountNo;

    @OpenApiField(desc = "银行名",demo = "20130812020055285248")
    private String bankName;

    @OpenApiField(desc = "时间",demo = "2005-06-30 15:50")
    private String rawAddTime;

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId;
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public Money getAmountIn() {
        return amountIn;
    }

    public void setAmountIn(Money amountIn) {
        this.amountIn = amountIn;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getRawAddTime() {
        return rawAddTime;
    }

    public void setRawAddTime(String rawAddTime) {
        this.rawAddTime = rawAddTime;
    }
}
