package com.yiji.openapi.message.product.common;

import com.yiji.openapi.message.product.common.info.CreatTradeInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

import java.util.List;

/**
 * Created by hgeshu@yiji.com on 2016/8/22.
 */
@OpenApiMessage(service = "fastPayTradeMergePay", type = ApiMessageType.Notify,version = "2.0")
public class FastPayTradeMergePayNotifyV2 extends ApiNotify {

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

    @OpenApiField(desc = "支付结果集")
    private List<CreatTradeInfo> creatTradeResult;

    @OpenApiField(desc = "银行简称",demo = "ALIPAY",constraint = "微信与支付宝将通过此参数展示")
    private String bankCode;

    @OpenApiField(desc = "对公对私",demo = "PERSONAL")
    private String personalCorporateType;

    @OpenApiField(desc = "银行卡类型",demo = "DEBIT")
    private String cardType;

    @OpenApiField(desc = "支付方式" , demo = "THIRDPUBLICPAY" , constraint = "{\"data\":[\"THIRDPUBLICPAY:第三方公众号支付\",\"THIRDSCANPAY:第三方扫码支付\",\"THIRDSCANNEDPAY:第三方条码支付\",\"BALANCE:余额支付\",\"ONLINEBANK:网银支付\",\"DEDUCT:代扣支付\",\"QUICKPAY:快捷支付\",\"UNIONPLUGINPAY:控件支付\",\"TRANSFERPAY:联名卡转账支付\",\"OFFLINEPAY:线下支付\"],\"name\":\"支付方式\"}")
    private String  payMethod;

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

    public List<CreatTradeInfo> getCreatTradeResult() {
        return creatTradeResult;
    }

    public void setCreatTradeResult(List<CreatTradeInfo> creatTradeResult) {
        this.creatTradeResult = creatTradeResult;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getPersonalCorporateType() {
        return personalCorporateType;
    }

    public void setPersonalCorporateType(String personalCorporateType) {
        this.personalCorporateType = personalCorporateType;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }
}
