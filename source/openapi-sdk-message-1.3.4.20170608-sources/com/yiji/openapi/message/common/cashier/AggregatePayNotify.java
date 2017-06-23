package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * Created by hgeshu@yiji.com on 2016/7/12.
 */
@OpenApiMessage(service = "aggregatePay", type = ApiMessageType.Notify)
public class AggregatePayNotify extends ApiNotify {
    @OpenApiField(desc = "支付流水号",demo = "201500515252525625")
    private String tradeNo;

    @OpenApiField(desc = "交易金额",demo = "26.54")
    private String tradeAmount;

    @OpenApiField(desc = "实收金额",demo = "26.50")
    private String tradeAmountIn;

    @OpenApiField(desc = "业务状态",demo = "SUCCESS")
    private String tradeStatus;

    @OpenApiField(desc = "支付方式" , demo = "THIRDPUBLICPAY" , constraint = "{\"data\":[\"THIRDPUBLICPAY:第三方公众号支付\",\"THIRDSCANPAY:第三方扫码支付\",\"THIRDSCANNEDPAY:第三方条码支付\",\"BALANCE:余额支付\",\"ONLINEBANK:网银支付\",\"DEDUCT:代扣支付\",\"QUICKPAY:快捷支付\",\"UNIONPLUGINPAY:控件支付\",\"TRANSFERPAY:联名卡转账支付\",\"OFFLINEPAY:线下支付\"],\"name\":\"支付方式\"}")
    private String  payMethod;

    @OpenApiField(desc = "平台商手续费",demo = "88.66")
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

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getMerchantChargeAmount() {
        return merchantChargeAmount;
    }

    public void setMerchantChargeAmount(String merchantChargeAmount) {
        this.merchantChargeAmount = merchantChargeAmount;
    }
}
