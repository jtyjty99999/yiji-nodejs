package com.yiji.openapi.message.common.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-16 15:47.
 */
@OpenApiMessage(service = "tradeOrderCreate", type = ApiMessageType.Notify)
public class tradeOrderCreateNotify extends ApiNotify {

    @OpenApiField(desc = "外部订单号",demo = "123645879123")
    private String outOrderNo;

    @OpenApiField(desc = "交易号",demo = "32146523465")
    private String tradeNo;

    @OpenApiField(desc = "交易状态",constraint = "trade_finished：交易完成<br>trade_closed：交易关闭",demo = "TRADE_FINISHED")
    private String tradeStatus;

    @OpenApiField(desc = "交易金额",demo = "8.66")
    private String tradeAmount;

    public String getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
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
}
