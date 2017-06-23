package com.yiji.openapi.message.product.common;

import com.yiji.openapi.message.product.common.info.CreatTradeInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

import java.util.List;

/**
 * Created by hgeshu@yiji.com on 2016/8/26.
 */
@OpenApiMessage(service = "commandPayTradeCreatePay", type = ApiMessageType.Notify,version = "2.0")
public class CommandPayTradeCreateNotifyV2 extends ApiNotify {

    @OpenApiField(desc = "交易流水号",demo = "52341468547685")
    private String tradeNo;

    @OpenApiField(desc = "交易付款金额",demo = "45.12")
    private String tradeAmount;

    @OpenApiField(desc = "收款人实收金额",demo = "45")
    private String tradeAmountIn;

    @OpenApiField(desc = "业务状态",demo = "FINISHED",constraint = "{\"data\":[\"CONFIRM_PAY:等待确认打款\",\"FINISHED:成功\",\"CLOSED:关闭\"],\"name\":\"业务状态\"}")
    private String commandPayStatus;

    @OpenApiField(desc = "付款类型",demo = "BALANCE",constraint = "{\"data\":[\"BALANCE：余额支付\",\"ONLINEBANK:网银支付\",\"DEDUCT:代扣支付\",\"QUICKPAY:快捷支付\",\"THIRDPUBLICPAY:第三方公众号支付中\",\"THIRDSCANPAY:第三方扫码支付\",\"THIRDSCANNEDPAY:第三方条码支付\",\"UNIONPLUGINPAY:控件支付\",\"TRANSFERPAY:联名卡转账支付\",\"OFFLINEPAY:线下支付\"],\"name\":\"业务状态\"}")
    private String payMethod;

    @OpenApiField(desc = "平台商手续费")
    private Money merchantChargeAmount;

    @OpenApiField(desc = "支付结果集")
    private List<CreatTradeInfo> creatTradeResult;

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

    public Money getMerchantChargeAmount() {
        return merchantChargeAmount;
    }

    public void setMerchantChargeAmount(Money merchantChargeAmount) {
        this.merchantChargeAmount = merchantChargeAmount;
    }

    public List<CreatTradeInfo> getCreatTradeResult() {
        return creatTradeResult;
    }

    public void setCreatTradeResult(List<CreatTradeInfo> creatTradeResult) {
        this.creatTradeResult = creatTradeResult;
    }
}
