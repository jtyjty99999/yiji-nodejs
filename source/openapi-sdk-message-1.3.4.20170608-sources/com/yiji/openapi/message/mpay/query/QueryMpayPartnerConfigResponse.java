/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-30 15:19 创建
 *
 */
package com.yiji.openapi.message.mpay.query;

import java.util.List;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-30
 */
@OpenApiMessage(service = "queryMpayPartnerConfig", type = ApiMessageType.Response)
public class QueryMpayPartnerConfigResponse extends ApiResponse {

    /**
     * 大额金额基准额度
     */
    @OpenApiField(desc = "大额金额基准额度" , demo = "28888" , constraint = "")
    private Money baseAmount;

    /**
     * 商户配色
     */
    @OpenApiField(desc = "商户配色" , demo = "RED" , constraint = "")
    private String color;

    /**
     * 用户单笔限额
     */
    @OpenApiField(desc = "用户单笔限额" , demo = "18888" , constraint = "")
    private Money singleMaxAmount;

    /**
     * 是否支持nfc支付, "1"是, "0"否
     * */
    @OpenApiField(desc = "是否支持nfc支付" , demo = "1" , constraint = "是否支持nfc支付, 1:是, 0:否")
    private int nfcPay;

    /**
     * 余额支付状态,"1"是, "0"否
     */
    @OpenApiField(desc = "余额支付状态" , demo = "1" , constraint = "")
    private String balanceStatus;

    /**
     * 支持的支付渠道
     */
    @OpenApiField(desc = "支持的支付渠道" , demo = "weChantScanPay" , constraint = "")
    private List<String> payChannel;

    public List<String> getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(List<String> payChannel) {
        this.payChannel = payChannel;
    }

    public Money getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(Money baseAmount) {
        this.baseAmount = baseAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Money getSingleMaxAmount() {
        return singleMaxAmount;
    }

    public void setSingleMaxAmount(Money singleMaxAmount) {
        this.singleMaxAmount = singleMaxAmount;
    }

    public int getNfcPay() {
        return nfcPay;
    }

    public void setNfcPay(int nfcPay) {
        this.nfcPay = nfcPay;
    }

    public String getBalanceStatus() {
        return balanceStatus;
    }

    public void setBalanceStatus(String balanceStatus) {
        this.balanceStatus = balanceStatus;
    }
}
