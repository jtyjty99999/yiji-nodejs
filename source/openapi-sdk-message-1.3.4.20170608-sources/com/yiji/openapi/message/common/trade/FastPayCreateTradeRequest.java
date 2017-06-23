/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-26 10:54 创建
 *
 */
package com.yiji.openapi.message.common.trade;

import javax.validation.constraints.DecimalMin;
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
 * @since 2016-05-26
 */
@OpenApiMessage(service = "fastPayCreateTrade", type = ApiMessageType.Request)
public class FastPayCreateTradeRequest extends ApiRequest {
    /**
     * 终端类型
     */
    @OpenApiField(desc = "终端类型" , demo = "pc" , constraint = "默认为pc")
    private String userTerminalType;

    /** 商品类型 */
    @Size(max = 64)
    @OpenApiField(desc = "商品类型" , demo = "食品类" , constraint = "")
    private String goodsType;

    /** 商品名称 */
    @Size(max = 64)
    @NotBlank
    @OpenApiField(desc = "商品名称" , demo = "辣条" , constraint = "")
    private String goodsName;

    @Length(max = 128)
    @OpenApiField(desc = "备注" , demo = "猪肉100g..." , constraint = "")
    private String memo;

    /**
     * 买家会员号
     */
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "买家会员号" , demo = "20141023010002156122" , constraint = "")
    private String buyerUserId;

    /**
     * 卖家会员号
     */
    @Length(max = 20, min = 20)
    @NotBlank
    @OpenApiField(desc = "卖家会员号" , demo = "20141023010002156122" , constraint = "")
    private String sellerUserId;

    @NotNull
    @OpenApiField(desc = "交易金额" , demo = "58888" , constraint = "")
    private Money tradeAmount;
    /**
     * 未付款自动关闭时间，单位为分钟，默认10天
     */
    @DecimalMin("1")
    @OpenApiField(desc = "未付款自动关闭时间" , demo = "14400" , constraint = "未付款自动关闭时间，单位为分钟，默认10天")
    private long autoCloseDuration = 10 * 24 * 60L;

    /**
     * 收费扩展维度
     */
    @OpenApiField(desc = "收费扩展维度" , demo = "0" ,
            constraint = "外部商户传入的收费扩展字段，比如当做Vip标识，用户对特殊角色进行收费，0:非VIP，1:VIP")
    private String chargeExtends;
    /**
     * 请求mac地址
     */
    @Length(max = 48)
    @OpenApiField(desc = "请求mac地址" , demo = "14-DD-A9-DE-FF-87" , constraint = "")
    private String macAddress;

    @OpenApiField(desc = "用户客户端ip" , demo = "192.168.45.23" , constraint = "")
    private String userEndIp;



    public String getChargeExtends() {
        return chargeExtends;
    }

    public void setChargeExtends(String chargeExtends) {
        this.chargeExtends = chargeExtends;
    }

    public String getUserEndIp() {
        return userEndIp;
    }

    public void setUserEndIp(String userEndIp) {
        this.userEndIp = userEndIp;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public String getUserTerminalType() {
        return userTerminalType;
    }

    public void setUserTerminalType(String userTerminalType) {
        this.userTerminalType = userTerminalType;
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
}
