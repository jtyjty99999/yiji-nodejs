package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * Created by hgeshu@yiji.com on 2016/8/26.
 */
@OpenApiMessage(service = "commandPayTradeCreatePay", type = ApiMessageType.Notify)
public class CommandPayTradeCreatePayNotify extends ApiNotify {

    @OpenApiField(desc = "交易流水号", demo = "52341468547685")
    private String tradeNo;

    @OpenApiField(desc = "交易付款金额", demo = "45.12")
    private String tradeAmount;

    @OpenApiField(desc = "收款人实收金额", demo = "45")
    private String tradeAmountIn;

    @OpenApiField(desc = "业务状态", demo = "FINISHED", constraint = "{\"data\":[\"INIT:初始化状态\",\"WAIT_PAY:等待付款\",\"CONFIRM_PAY:等待确认打款\",\"WAIT_WITHDRAW_ACK:等待提现回执\",\"PAY_PROCESSING:付款处理中\",\"CONFIRM_PAY_PROCESSING:确认打款处理中\",\"APPLY_WITHDRAW_PROCESSING:申请提现处理中\",\"FINISHED:成功\",\"CLOSED:关闭\"],\"name\":\"业务状态\"}")
    private String commandPayStatus;

    @OpenApiField(desc = "付款类型", demo = "BALANCE", constraint = "{\"data\":[\"BALANCE：余额支付\",\"ONLINEBANK:网银支付\",\"DEDUCT:代扣支付\",\"QUICKPAY:快捷支付\",\"THIRDPUBLICPAY:第三方公众号支付中\",\"THIRDSCANPAY:第三方扫码支付\",\"THIRDSCANNEDPAY:第三方条码支付\",\"UNIONPLUGINPAY:控件支付\",\"TRANSFERPAY:联名卡转账支付\",\"OFFLINEPAY:线下支付\"],\"name\":\"业务状态\"}")
    private String payMethod;

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

    public String getCommandPayStatus() {
        return commandPayStatus;
    }

    public void setCommandPayStatus(String commandPayStatus) {
        this.commandPayStatus = commandPayStatus;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }
}
