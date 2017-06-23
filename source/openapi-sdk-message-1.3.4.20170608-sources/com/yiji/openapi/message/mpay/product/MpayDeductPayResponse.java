/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-23 11:00 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-23
 */
@OpenApiMessage(service = "mpayDeductPay", type = ApiMessageType.Response)
public class MpayDeductPayResponse extends ApiResponse {

    /**
     * 交易号
     */
    @OpenApiField(desc = "交易号" , demo = "20150729020006847500" , constraint = "")
    private String tradeNo;

    /**
     * 交易状态
     */
    @OpenApiField(desc = "交易状态" , demo = "fail" , constraint = "")
    private String tradeStatus;

    /**
     * 交易金额
     */
    @OpenApiField(desc = "交易金额" , demo = "52888" , constraint = "")
    private Money tradeAmount;

    /**
     * 交易金额
     */
    @OpenApiField(desc = "是否建议提升等级" , demo = "1" , constraint = "1:是，0:否")
    private String promoteAccount;

    @OpenApiField(desc = "余额限额" , demo = "52888" , constraint = "余额支付时返回")
    private Money balanceQuota;

    public String getPromoteAccount() {
        return promoteAccount;
    }

    public void setPromoteAccount(String promoteAccount) {
        this.promoteAccount = promoteAccount;
    }

    public Money getBalanceQuota() {
        return balanceQuota;
    }

    public void setBalanceQuota(Money balanceQuota) {
        this.balanceQuota = balanceQuota;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }
}
