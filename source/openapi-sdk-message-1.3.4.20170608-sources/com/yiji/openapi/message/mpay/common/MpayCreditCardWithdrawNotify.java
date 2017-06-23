package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/24 15:48.
 */
@OpenApiMessage(service = "mpayCreditCardWithdraw", type = ApiMessageType.Notify)
public class MpayCreditCardWithdrawNotify extends ApiNotify {

    @OpenApiField(desc = "取现状态",demo = "{\"data\":[\"FINISHED:成功\",\"CLOSED:失败\"],\"name\":\"取现状态\"}")
    private String tradeStatus;

    @OpenApiField(desc = "取现金额",demo = "8.66")
    private String tradeAmount;

    @OpenApiField(desc = "取现流水号",demo = "156413574157")
    private String tradeNo;

    @OpenApiField(desc = "失败原因",demo = "提现失败")
    private String failReason;

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }
}
