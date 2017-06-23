/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-06 18:19 创建
 *
 */
package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-06
 */
@OpenApiMessage(service = "aggregatePay", type = ApiMessageType.Request)
public class AggregatePayRequest extends ApiRequest {

    @OpenApiField(desc = "交易号" , demo = "201500010000005150a" , constraint = "tradeNo为空时，goodsName、sellerUserId不能为空")
    @Length(max = 64, min = 10)
    private String tradeNo;

    @OpenApiField(desc = "会员Id" , demo = "201500010000005150234" , constraint = "")
    @Length(max = 64, min = 1)
    private String buyerUserId;

    /**
     * 终端类型
     */
    @OpenApiField(desc = "终端类型" , demo = "MOBILE" , constraint = "默认为MOBILE")
    private String userTerminalType;

    @OpenApiField(desc = "交易名称",demo = "交易")
    private String tradeName;

    /** 商品类型 */
    @Size(max = 64)
    @OpenApiField(desc = "商品类型" , demo = "食品类" , constraint = "")
    private String goodsType;

    /** 商品名称 */
    @Size(max = 64)
    @OpenApiField(desc = "商品名称" , demo = "辣条" , constraint = "tradeNo为空时，tradeAmount、goodsName、sellerUserId不能为空")
    private String goodsName;

    @Length(max = 128)
    @OpenApiField(desc = "备注" , demo = "猪肉100g..." , constraint = "")
    private String memo;

    /**
     * 卖家会员号
     */
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "卖家会员号" , demo = "20141023010002156122" , constraint = "tradeNo为空时，tradeAmount、goodsName、sellerUserId不能为空")
    private String sellerUserId;

    @OpenApiField(desc = "交易金额" , demo = "58888" , constraint = "tradeNo为空时，tradeAmount、goodsName、sellerUserId不能为空")
    private Money tradeAmount;

    /** 公众号用户标示 是微信公众号和用户加起来生成的一个标识 */
    @OpenApiField(desc = "公众号用户标示",demo = "12346216312",constraint = "微信公众号与用户生成的一个标识,移动专属参数，paymentType = PAYMENT_TYPE_WECHAT时，此参数必填")
    private String openid;

    @OpenApiField(desc = "收费扩展维度" , demo = "0" ,
            constraint = "外部商户传入的收费扩展字段，比如当做Vip标识，用户对特殊角色进行收费，0:非VIP，1:VIP")
    private String chargeExtends;

    /**
     * 未付款自动关闭时间，单位为分钟，默认10天
     */
    @DecimalMin("1")
    @OpenApiField(desc = "未付款自动关闭时间" , demo = "14400" , constraint = "未付款自动关闭时间，单位为分钟，默认10天")
    private long autoCloseDuration = 10 * 24 * 60L;

    /**
     * 请求mac地址
     */
    @Length(max = 48)
    @OpenApiField(desc = "请求mac地址" , demo = "14-DD-A9-DE-FF-87" , constraint = "")
    private String macAddress;

    @OpenApiField(desc = "用户客户端ip" , demo = "192.168.45.23" , constraint = "")
    private String userEndIp;

    @OpenApiField(desc = "支付类型",
            constraint = "{\"data\":[\"PAYMENT_TYPE_SUPER:聚合支付（移动支付）\",\"PAYMENT_TYPE_YJ:易手富支付（移动支付）\",\"PAYMENT_TYPE_WECHAT:微信支付（移动支付）\",\"BALANCE:余额支付（PC支付）\",\"QUICKPAY:快捷支付（PC支付）\",\"ONLINEBANK:网银支付（PC支付）\",\"THIRDSCANPAY:扫码支付（PC支付）\",\"OFFLINEPAY:线下支付（PC支付）\"],\"name\":\"支付类型\"}",
            demo = "PAYMENT_TYPE_SUPER")
    private String paymentType;

    @OpenApiField(desc = "会员类型",
            constraint = "{\"data\":[\"MEMBER_TYPE_YIJI:易极付会员\",\"MEMBER_TYPE_PATERN:商户会员\",\"MEMBER_TYPE_CARD:收单\"],\"name\":\"移动专属参数\"}",
            demo = "PAYMENT_TYPE_SUPER")
    private String memberType;

    @OpenApiField(desc = "用户姓名",demo = "熊本熊",constraint = "移动专属参数")
    private String name;

    @OpenApiField(desc = "用户姓名是否固定",demo = "true" ,constraint = "移动专属参数")
    private String stable;

    @OpenApiField(desc = "手机号码",demo = "13618456512" ,constraint = "移动专属参数")
    private String mobileNo;

    @OpenApiField(desc = "手机号码是否固定",demo = "true" ,constraint = "移动专属参数")
    private String mobileNoStable;

    @OpenApiField(desc = "用户银行卡号",demo = "6225445545654758" ,constraint = "")
    private String cardNo;

    @OpenApiField(desc = "用户银行卡号是否固定",demo = "true" ,constraint = "移动专属参数")
    private String cardNoStable;

    @OpenApiField(desc = "身份证号码",demo = "510231245415645" ,constraint = "移动专属参数")
    private String certNo;

    @OpenApiField(desc = "身份证号码是否固定",demo = "true" ,constraint = "移动专属参数")
    private String certNoStable;

    @OpenApiField(desc = "银行简称",demo = "ABC" ,constraint = "PC专属参数，微信扫码请传入WEIXIN，支付宝扫码请传入ALIPAY")
    private String bankCode;

    @OpenApiField(desc = "对公对私",demo = "PERSONAL" ,constraint = "PC专属参数")
    private String personalCorporateType;

    @OpenApiField(desc = "银行卡类型",demo = "DEBIT" ,constraint = "PC专属参数")
    private String cardType;

    @OpenApiField(desc = "分润信息",constraint = "分润最多支持10笔,单笔分润格式:userId1~amount1~memo1^userId2~amount2~memo2",demo = "2012658947952258175214~88.66~分润^45631541323241~65.21~fenrun")
    private String shareProfits;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
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

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getChargeExtends() {
        return chargeExtends;
    }

    public void setChargeExtends(String chargeExtends) {
        this.chargeExtends = chargeExtends;
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

    public String getUserEndIp() {
        return userEndIp;
    }

    public void setUserEndIp(String userEndIp) {
        this.userEndIp = userEndIp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStable() {
        return stable;
    }

    public void setStable(String stable) {
        this.stable = stable;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMobileNoStable() {
        return mobileNoStable;
    }

    public void setMobileNoStable(String mobileNoStable) {
        this.mobileNoStable = mobileNoStable;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNoStable() {
        return cardNoStable;
    }

    public void setCardNoStable(String cardNoStable) {
        this.cardNoStable = cardNoStable;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCertNoStable() {
        return certNoStable;
    }

    public void setCertNoStable(String certNoStable) {
        this.certNoStable = certNoStable;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getShareProfits() {
        return shareProfits;
    }

    public void setShareProfits(String shareProfits) {
        this.shareProfits = shareProfits;
    }

    public String getUserTerminalType() {
        return userTerminalType;
    }

    public void setUserTerminalType(String userTerminalType) {
        this.userTerminalType = userTerminalType;
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
}
