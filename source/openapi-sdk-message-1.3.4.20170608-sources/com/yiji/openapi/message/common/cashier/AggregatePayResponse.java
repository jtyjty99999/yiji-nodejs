/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-06 18:20 创建
 *
 */
package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.message.common.cashier.info.ShareProfitOrder;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-06
 */
@OpenApiMessage(service = "aggregatePay", type = ApiMessageType.Response)
public class AggregatePayResponse extends ApiResponse {

    @NotBlank
    @OpenApiField(desc = "gid" , demo = "201500010000005150a" , constraint = "")
    private String gid;

    @NotBlank
    @OpenApiField(desc = "入口" , demo = "01" , constraint = "")
    private String inlet;

    @OpenApiField(desc = "交易号" , demo = "201500010000005150a" , constraint = "")
    private String tradeNo;

    @OpenApiField(desc = "会员Id" , demo = "201500010000005150234" , constraint = "")
    private String userId;

    /**
     * 终端类型
     */
    @OpenApiField(desc = "终端类型" , demo = "MOBILE" , constraint = "默认为MOBILE")
    private String userTerminalType;

    /** 商品类型 */
    @Size(max = 64)
    @OpenApiField(desc = "商品类型" , demo = "食品类" , constraint = "")
    private String goodsType;

    /** 商品名称 */
    @Size(max = 64)
    @OpenApiField(desc = "商品名称" , demo = "辣条" , constraint = "")
    private String goodsName;

    @Length(max = 128)
    @OpenApiField(desc = "备注" , demo = "猪肉100g..." , constraint = "")
    private String memo;

    /**
     * 卖家会员号
     */
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "卖家会员号" , demo = "20141023010002156122" , constraint = "")
    private String sellerUserId;

    @OpenApiField(desc = "交易金额" , demo = "58888" , constraint = "")
    private Money tradeAmount;

    @NotBlank
    @OpenApiField(desc = "支付类型",
            constraint = "{\"data\":[\"PAYMENT_TYPE_SUPER:聚合支付\",\"PAYMENT_TYPE_YJ:易手富支付\",\"PAYMENT_TYPE_WECHAT:微信支付\"],\"name\":\"支付类型\"}",
            demo = "PAYMENT_TYPE_SUPER")
    private String paymentType;

    @NotBlank
    @OpenApiField(desc = "支付类型",
            constraint = "{\"data\":[\"MEMBER_TYPE_YIJI:易极付会员\",\"MEMBER_TYPE_PATERN:商户会员\",\"MEMBER_TYPE_CARD:收单\"],\"name\":\"会员类型\"}",
            demo = "PAYMENT_TYPE_SUPER")
    private String memberType;

    /** 公众号用户标示 是微信公众号和用户加起来生成的一个标识 */
    @NotBlank(message = "公众号用户标示不能为空")
    @OpenApiField(desc = "公众号用户标示",demo = "12346216312",constraint = "微信公众号与用户生成的一个标识")
    private String openId;

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

    @OpenApiField(desc = "用户姓名",demo = "熊本熊")
    private String name;

    @OpenApiField(desc = "用户姓名是否固定",demo = "true" ,constraint = "")
    private String stable;

    @OpenApiField(desc = "手机号码",demo = "13618456512" ,constraint = "")
    private String mobileNo;

    @OpenApiField(desc = "手机号码是否固定",demo = "true" ,constraint = "")
    private String mobileNoStable;

    @OpenApiField(desc = "用户银行卡号",demo = "6225445545654758" ,constraint = "")
    private String cardNo;

    @OpenApiField(desc = "用户银行卡号是否固定",demo = "true" ,constraint = "")
    private String cardNoStable;

    @OpenApiField(desc = "身份证号码",demo = "510231245415645" ,constraint = "")
    private String certNo;

    @OpenApiField(desc = "身份证号码是否固定",demo = "true" ,constraint = "")
    private String certNoStable;

    @OpenApiField(desc = "dubbo分组")
    private String dubboGroup;

    @OpenApiField(desc = "dubboGroup临时")
    private String group;

    @OpenApiField(desc = "dubbo版本号")
    private String dubboVersion;

    //PC参数

    @OpenApiField(desc = "交易名称",demo = "交易")
    private String tradeName;

    @OpenApiField(desc = "会员Id" , demo = "201500010000005150234" , constraint = "")
    private String buyerUserId;

    @OpenApiField(desc = "交易号")
    private String bizNo;

    @OpenApiField(desc = "商品类型" , demo = "食品类" , constraint = "")
    private String goodsTypeName;

    @OpenApiField(desc = "收费扩展维度" , demo = "0" ,
            constraint = "外部商户传入的收费扩展字段，比如当做Vip标识，用户对特殊角色进行收费，0:非VIP，1:VIP")
    private String chargeExtend;

    @OpenApiField(desc = "银行简称" ,constraint = "PC专属参数")
    private String bankCode;

    @OpenApiField(desc = "对公对私" ,constraint = "PC专属参数")
    private String personalCorporateType;

    @OpenApiField(desc = "银行卡类型",constraint = "PC专属参数")
    private  String debitCreditType;

    @OpenApiField(desc = "支付方式（PC）")
    private String methodType;

    @OpenApiField(desc = "分润信息")
    private List<ShareProfitOrder> shareProfits;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getInlet() {
        return inlet;
    }

    public void setInlet(String inlet) {
        this.inlet = inlet;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
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

    public String getDubboGroup() {
        return dubboGroup;
    }

    public void setDubboGroup(String dubboGroup) {
        this.dubboGroup = dubboGroup;
    }

    public String getDubboVersion() {
        return dubboVersion;
    }

    public void setDubboVersion(String dubboVersion) {
        this.dubboVersion = dubboVersion;
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public String getChargeExtend() {
        return chargeExtend;
    }

    public void setChargeExtend(String chargeExtend) {
        this.chargeExtend = chargeExtend;
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
    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<ShareProfitOrder> getShareProfits() {
        return shareProfits;
    }

    public void setShareProfits(List<ShareProfitOrder> shareProfits) {
        this.shareProfits = shareProfits;
    }


}
