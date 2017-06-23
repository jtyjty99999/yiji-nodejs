package com.yiji.openapi.message.product.ewpay.info;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-23 17:52.
 */
public class EwpayTradeInfo {
    /**
     * 交易订单号
     */
    @OpenApiField(desc = "交易订单号",demo = "1235644879132")
    private String tradeNo;

    /**
     * 外部订单号
     */
    @OpenApiField(desc = "外部订单号",demo = "13246583126854")
    private String outOrderNo;

    /**
     * 交易名称
     */
    @OpenApiField(desc = "交易名称",demo = "交易")
    private String outTradeTitle;

    /**
     * 交易渠道
     */
    @OpenApiField(desc = "交易渠道",demo = "GATEWAY")
    private String tradeChannel;

    /**
     * 交易类型
     */
    @OpenApiField(desc = "交易类型",demo = "TRADE")
    private String tradeType;

    /**
     * 交易金额
     */
    @OpenApiField(desc = "交易金额",demo = "88.66")
    private Money money;

    /**
     * 红包
     */
    @OpenApiField(desc = "红包",demo = "88.66")
    private Money moneyGift;

    /**
     * 收费金额
     */
    @OpenApiField(desc = "收费金额",demo = "88.66")
    private Money chargeMoney;

    /**
     * 收费方式
     */
    @OpenApiField(desc = "收费方式",demo = "TRADER")
    private String chargeParty;

    /**
     * 备注
     */
    @OpenApiField(desc = "备注",demo = "交易备注")
    private String mome;

    /**
     * 买家外部会员id
     */
    @OpenApiField(desc = "买家会员id（商户）",demo = "1326547981")
    private String outPayerShopId;

    /**
     * 买家外部会员姓名
     */
    @OpenApiField(desc = "买家会员姓名",demo = "企富通")
    private String payerName;

    /**
     * 买家会员id
     */
    @OpenApiField(desc = "买家会员id（易极付）",demo = "12345678901234567890")
    private String payerUserId;

    /**
     * 卖家外部会员id
     */
    @OpenApiField(desc = "卖家会员id（商户）",demo = "1384976132564")
    private String outPayeeShopId;

    /**
     * 卖家外部会员姓名
     */
    @OpenApiField(desc = "卖家会员姓名",demo = "企富通")
    private String payeeName;

    /**
     * 卖家会员id
     */
    @OpenApiField(desc = "卖家会员id（易极付）",demo = "12345679801324567890")
    private String payeeUserId;

    /**
     * 交易状态
     */
    @OpenApiField(desc = "交易状态",demo = "RECHARGEFAILURE")
    private String tradeStatus;

    /**
     * 创建时间
     */
    @OpenApiField(desc = "创建时间",demo = "2015-12-24 12:32:45")
    private Date rawAddTime;

    /**
     * 更新时间
     */
    @OpenApiField(desc = "更新时间",demo = "2015-12-24 13:12:21")
    private Date rawUpdateTime;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getOutTradeTitle() {
        return outTradeTitle;
    }

    public void setOutTradeTitle(String outTradeTitle) {
        this.outTradeTitle = outTradeTitle;
    }

    public String getTradeChannel() {
        return tradeChannel;
    }

    public void setTradeChannel(String tradeChannel) {
        this.tradeChannel = tradeChannel;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public Money getMoneyGift() {
        return moneyGift;
    }

    public void setMoneyGift(Money moneyGift) {
        this.moneyGift = moneyGift;
    }

    public Money getChargeMoney() {
        return chargeMoney;
    }

    public void setChargeMoney(Money chargeMoney) {
        this.chargeMoney = chargeMoney;
    }

    public String getChargeParty() {
        return chargeParty;
    }

    public void setChargeParty(String chargeParty) {
        this.chargeParty = chargeParty;
    }

    public String getMome() {
        return mome;
    }

    public void setMome(String mome) {
        this.mome = mome;
    }

    public String getOutPayerShopId() {
        return outPayerShopId;
    }

    public void setOutPayerShopId(String outPayerShopId) {
        this.outPayerShopId = outPayerShopId;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayerUserId() {
        return payerUserId;
    }

    public void setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId;
    }

    public String getOutPayeeShopId() {
        return outPayeeShopId;
    }

    public void setOutPayeeShopId(String outPayeeShopId) {
        this.outPayeeShopId = outPayeeShopId;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getPayeeUserId() {
        return payeeUserId;
    }

    public void setPayeeUserId(String payeeUserId) {
        this.payeeUserId = payeeUserId;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Date getRawAddTime() {
        return rawAddTime;
    }

    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }
}
