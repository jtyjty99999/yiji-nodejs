/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-23 10:08 创建
 *
 */
package com.yiji.openapi.message.product.common;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-23
 */
@OpenApiMessage(service = "fastPayCreateTradeDeduct", type = ApiMessageType.Request)
public class FastPayCreateTradeDeductRequest extends ApiRequest{

    /**
     * 用户客户端ip
     */
    @Size(max = 128)
    @OpenApiField(desc = "用户客户端ip" , demo = "192.168.22.33" , constraint = "")
    private String userEndIp;

    /**
     * 终端类型
     * 01:pc端),
     * 02:移动端);
     *
     */
    @OpenApiField(desc = "终端类型" , demo = "01" , constraint = "")
    private String userTerminalType;

    /** 商品类型名称 */
    @Size(max = 64)
    @OpenApiField(desc = "商品类型" , demo = "食品" , constraint = "")
    private String goodsType;

    /** 商品名称 */
    @Size(max = 64)
    @OpenApiField(desc = "商品名称" , demo = "大熊" , constraint = "")
    private String goodsName;



    @Length(max = 128)
    @OpenApiField(desc = "备注" , demo = "食品类" , constraint = "")
    private String memo;

    /**
     * 收费扩展维度
     */
    @OpenApiField(desc = "收费扩展维度" , demo = "\"CHANNEL\": \"PSBC\",\n" +
            "            \"PUBLICPRIVATE\": \"N\",\n" +
            "            \"SERVICECODE\": \"netbankPay\",\n" +
            "            \"CARDTYPE\": \"DEBIT\"" , constraint = "")
    private String chargeExtends;

    /**
     * 买家会员号
     */
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "买家会员号" , demo = "205110515125145125145" , constraint = "")
    private String buyerUserId;

    /**
     * 卖家会员号
     */
    @Length(max = 20, min = 20)
    @NotBlank
    @OpenApiField(desc = "卖家会员号" , demo = "205110515125145125145" , constraint = "")
    private String sellerUserId;

    /**
     * 交易金额
     */
    @NotNull
    @OpenApiField(desc = "交易金额" , demo = "258888" , constraint = "")
    private Money tradeAmount;

    /**
     * 未付款自动关闭时间，单位为分钟，默认10天
     */
    @OpenApiField(desc = "未付款自动关闭时间" , demo = "14400" , constraint = "单位为分钟，默认10天")
    private long autoCloseDuration = 10 * 24 * 60L;

    /**
     * 请求mac地址
     */
    @Length(max = 48)
    @OpenApiField(desc = "请求mac地址" , demo = "00-50-56-C0-00-08" , constraint = "")
    private String macAddress;

    /**
     * 协议号，空中签约里面标示某个人</br>
     * 代扣支付，空中签约时不能为空
     */
    @Length(max = 32)
    @OpenApiField(desc = "协议号" , demo = "20162012400001515469" , constraint = "")
    private String protocolNo;

    /**
     * 绑卡流水号，代扣支付时不能为空
     */
    @NotBlank
    @Length(max = 32)
    @OpenApiField(desc = "绑卡流水号" , demo = "20162012400001515469" , constraint = "")
    private String pactNo;

    public String getUserEndIp() {
        return userEndIp;
    }

    public void setUserEndIp(String userEndIp) {
        this.userEndIp = userEndIp;
    }

    public String getUserTerminalType() {
        return userTerminalType;
    }

    public void setUserTerminalType(String userTerminalType) {
        this.userTerminalType = userTerminalType;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getChargeExtends() {
        return chargeExtends;
    }

    public void setChargeExtends(String chargeExtends) {
        this.chargeExtends = chargeExtends;
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public long getAutoCloseDuration() {
        return autoCloseDuration;
    }

    public void setAutoCloseDuration(long autoCloseDuration) {
        this.autoCloseDuration = autoCloseDuration;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getProtocolNo() {
        return protocolNo;
    }

    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
    }

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }
}
