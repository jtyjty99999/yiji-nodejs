package com.yiji.openapi.message.product.common.info;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

import java.util.Date;

/**
 * Created by Administrator on 2016/8/26.
 */
public class SingleTradeInfos {

    @OpenApiField(desc = "交易流水号")
    private String tradeNo;

    @OpenApiField(desc = "外部商户业务订单号")
    private String merchOrderNo;

    @OpenApiField(desc = "商品名称")
    private String goodsName;

    @OpenApiField(desc = "卖家用户id")
    private String sellerUserId;

    @OpenApiField(desc = "卖家真实姓名")
    private String sellerRealName;

    @OpenApiField(desc = "买家实际付款金额")
    private Money payAmount;

    @OpenApiField(desc = "交易状态", constraint = "{\"data\":[\"WAIT_PAY:等待付款\",\"CONFIRM_PAY:等待确认打款\",\"PAY_PROCESSING:付款处理中\",\"CONFIRM_PAY_PROCESSING:确认打款处理中\",\"APPLY_WITHDRAW_PROCESSING:申请提现处理中\",\"FINISHED:成功\",\"CLOSED:关闭\"],\"name\":\"业务状态\"}\n")
    private String fastPayStatus;

    @OpenApiField(desc = "完成时间")
    private Date finishTime;

    @OpenApiField(desc = "买家手续费")
    private Money buyerChargeAmount;

    @OpenApiField(desc = "卖家手续费")
    private Money sellerChargeAmount;

    @OpenApiField(desc = "平台商手续费")
    private Money merchantChargeAmount;

    @OpenApiField(desc = "付款类型", demo = "BALANCE", constraint = "{\"data\":[\"BALANCE：余额支付\",\"ONLINEBANK:网银支付\",\"DEDUCT:代扣支付\",\"QUICKPAY:快捷支付\",\"THIRDPUBLICPAY:第三方公众号支付中\",\"THIRDSCANPAY:第三方扫码支付\",\"THIRDSCANNEDPAY:第三方条码支付\",\"UNIONPLUGINPAY:控件支付\",\"TRANSFERPAY:联名卡转账支付\",\"OFFLINEPAY:线下支付\"],\"name\":\"业务状态\"}")
    private String payMethod;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public String getSellerRealName() {
        return sellerRealName;
    }

    public void setSellerRealName(String sellerRealName) {
        this.sellerRealName = sellerRealName;
    }

    public Money getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Money payAmount) {
        this.payAmount = payAmount;
    }

    public String getFastPayStatus() {
        return fastPayStatus;
    }

    public void setFastPayStatus(String fastPayStatus) {
        this.fastPayStatus = fastPayStatus;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Money getBuyerChargeAmount() {
        return buyerChargeAmount;
    }

    public void setBuyerChargeAmount(Money buyerChargeAmount) {
        this.buyerChargeAmount = buyerChargeAmount;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public Money getSellerChargeAmount() {
        return sellerChargeAmount;
    }

    public void setSellerChargeAmount(Money sellerChargeAmount) {
        this.sellerChargeAmount = sellerChargeAmount;
    }

    public Money getMerchantChargeAmount() {
        return merchantChargeAmount;
    }

    public void setMerchantChargeAmount(Money merchantChargeAmount) {
        this.merchantChargeAmount = merchantChargeAmount;
    }
}
