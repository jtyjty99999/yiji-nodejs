package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by hgeshu@yiji.com on 2016/8/26.
 */
@OpenApiMessage(service = "commandPayConfirm", type = ApiMessageType.Response)
public class CommandPayConfirmResponse extends ApiResponse {

    /**
     * 交易流水号
     */
    @OpenApiField(desc = "交易流水号",demo = "654321856154")
    private String tradeNo;

    /**
     * 付款总金额
     */
    @OpenApiField(desc = "付款总金额",demo = "888.65")
    private Money payAmount;

    /**
     * 失败原因
     */
    @OpenApiField(desc = "失败原因",demo = "银行失败")
    private String failReason;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Money getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Money payAmount) {
        this.payAmount = payAmount;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }
}
