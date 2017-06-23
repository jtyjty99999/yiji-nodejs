package com.yiji.openapi.message.product.common.info;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/27 16:00.
 */
public class EnchashmentInfo {

    /**
     * 订单号
     */
    @OpenApiField(desc = "取现订单号",demo = "23169851698168165")
    private String tradeNo;

    /**
     * 商户订单号
     */
    @OpenApiField(desc = "商户订单号",demo = "4563168432162135")
    private String merchOrderNo;

    /**
     * 取现状态
     */
    @OpenApiField(desc = "取现状态",demo = "FINISHED")
    private String tradeStatus;

    /**
     * 用户ID
     */
    @OpenApiField(desc = "易极付用户ID",demo = "20159658524524859635")
    private String userId;

    /**
     * 取现金额
     */
    @OpenApiField(desc = "取现金额",demo = "10000.00")
    private Money tradeAmount;

    /**
     * 分润金额
     */
    @OpenApiField(desc = "分润金额",demo = "8.66")
    private Money shareAmount;

    /**
     * 手续费金额
     */
    @OpenApiField(desc = "手续费金额",demo = "88.66")
    private Money chargeAmount;

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

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public Money getShareAmount() {
        return shareAmount;
    }

    public void setShareAmount(Money shareAmount) {
        this.shareAmount = shareAmount;
    }

    public Money getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(Money chargeAmount) {
        this.chargeAmount = chargeAmount;
    }
}
