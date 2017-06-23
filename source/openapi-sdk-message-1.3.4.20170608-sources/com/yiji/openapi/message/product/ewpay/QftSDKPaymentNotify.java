package com.yiji.openapi.message.product.ewpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-19 9:32.
 */
@OpenApiMessage(service = "qftSDKPayment", type = ApiMessageType.Notify)
public class QftSDKPaymentNotify extends ApiNotify {

    @OpenApiField(desc = "交易流水号",demo = "123456789013245000")
    private String tradeNo;

    @OpenApiField(desc = "交易状态",constraint = "trade_finished：交易完成<br>trade_closed：交易关闭",demo = "trade_finished")
    private String tradeStatus;

    @OpenApiField(desc = "外部订单号",demo = "outorderno1443068550641")
    private String outOrderNo;

    @OpenApiField(desc = "执行动作",demo = "ESCOW_TRADE_BUYER_ESCOW_PAY")
    private String executeAction;

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

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getExecuteAction() {
        return executeAction;
    }

    public void setExecuteAction(String executeAction) {
        this.executeAction = executeAction;
    }
}
