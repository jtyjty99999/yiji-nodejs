/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-06 17:07 创建
 *
 */
package com.yiji.openapi.message.mpay.sdk;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-06
 */
@OpenApiMessage(service = "mpayApplyWithdraw", type = ApiMessageType.Response)
public class MpayApplyWithdrawResponse extends ApiResponse {

    /**
     * 提现申请流水号
     */
    @NotBlank
    @OpenApiField(desc = "提现申请流水号" , demo = "2015105515a21515a2" , constraint = "")
    private String token;

    /**
     * 申请提现金额
     */
    @OpenApiField(desc = "申请提现金额" , demo = "25888" , constraint = "")
    private Money applyAmount;

    /**
     * 手续费
     */
    @OpenApiField(desc = "手续费" , demo = "288" , constraint = "")
    private Money charge;

    /**
     * 实际到账金额
     */
    @OpenApiField(desc = "实际到账金额" , demo = "256666" , constraint = "")
    private Money realAmount;

    /**
     * 预计到账时间
     */
    @OpenApiField(desc = "预计到账时间" , demo = "2016-07-06" , constraint = "")
    private String expectTime;

    /**
     * 银行
     */
    @OpenApiField(desc = "银行" , demo = "中国银行" , constraint = "")
    private String bankCode;

    /**
     * 银行卡卡号：mask
     */
    @OpenApiField(desc = "银行卡卡号" , demo = "6221244622516" , constraint = "")
    private String cardNo;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Money getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(Money applyAmount) {
        this.applyAmount = applyAmount;
    }

    public Money getCharge() {
        return charge;
    }

    public void setCharge(Money charge) {
        this.charge = charge;
    }

    public Money getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Money realAmount) {
        this.realAmount = realAmount;
    }

    public String getExpectTime() {
        return expectTime;
    }

    public void setExpectTime(String expectTime) {
        this.expectTime = expectTime;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
