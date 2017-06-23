package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * Created by hgeshu@yiji.com on 2016/8/22.
 */
@OpenApiMessage(service = "fastPayMergeCreateTrade", type = ApiMessageType.Notify)
public class FastPayMergeCreateTradeNotify extends ApiNotify {

    @OpenApiField(desc = "交易流水号",demo = "52341468547685")
    private String tradeNo;

    @OpenApiField(desc = "交易付款金额",demo = "45.12")
    private String tradeAmount;

    @OpenApiField(desc = "收款人实收金额",demo = "45")
    private String tradeAmountIn;

    @OpenApiField(desc = "业务状态",demo = "FINISHED",constraint = "{\"data\":[\"INIT:初始化状态\",\"WAIT_PAY:等待付款\",\"CONFIRM_PAY:等待确认打款\",\"WAIT_WITHDRAW_ACK:等待提现回执\",\"PAY_PROCESSING:付款处理中\",\"CONFIRM_PAY_PROCESSING:确认打款处理中\",\"APPLY_WITHDRAW_PROCESSING:申请提现处理中\",\"FINISHED:成功\",\"CLOSED:关闭\"],\"name\":\"业务状态\"}")
    private String fastPayStatus;

    @OpenApiField(desc = "平台商手续费")
    private String merchantChargeAmount;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getTradeAmountIn() {
        return tradeAmountIn;
    }

    public void setTradeAmountIn(String tradeAmountIn) {
        this.tradeAmountIn = tradeAmountIn;
    }

    public String getFastPayStatus() {
        return fastPayStatus;
    }

    public void setFastPayStatus(String fastPayStatus) {
        this.fastPayStatus = fastPayStatus;
    }

    public String getMerchantChargeAmount() {
        return merchantChargeAmount;
    }

    public void setMerchantChargeAmount(String merchantChargeAmount) {
        this.merchantChargeAmount = merchantChargeAmount;
    }
}
