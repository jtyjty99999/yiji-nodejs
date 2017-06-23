/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-19 14:53 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 易周转新代扣请求
 *
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/19
 */
@OpenApiMessage(service = "yzzNewDeduct", type = ApiMessageType.Request)
public class YzzNewDeductRequest extends ApiRequest {

    @NotBlank
    @Length(min = 20,max = 20)
	@OpenApiField(desc = "用户ID",constraint = "用户ID",demo = "20130812020055285248")
    private String userId;

    @OpenApiField(desc = "银行省名",constraint = "银行省名",demo = "四川省")
	private String bankProvName;

    @OpenApiField(desc = "银行市名",constraint = "银行市名",demo = "成都市")
	private String bankCityName;

    @NotBlank
    @OpenApiField(desc = "银行简称",constraint = "银行简称",demo = "ABC")
	private String bankCode;

    @NotBlank
    @OpenApiField(desc = "银行账户号",constraint = "银行账户号",demo = "6222123412341234")
	private String bankAccountNo;

    @NotNull
    @OpenApiField(desc = "代扣金额",constraint = "代扣金额",demo = "1030")
	private Money money;

    @OpenApiField(desc = "代扣令牌 ",constraint = "重银必传",demo = "1234")
	private String deductToken;

    @OpenApiField(desc = "代扣",constraint = "代扣",demo = "yjf")
	private String owner;

    @OpenApiField(desc = "渠道信息",constraint = "渠道信息",demo = "easy_eight")
	private String subOwner;

    @OpenApiField(desc = "商户编号",constraint = "商户编号",demo = "CP1")
	private String bizNo;

    @OpenApiField(desc = "业务类型",constraint = "业务类型",demo = "CQCB_P2P")
	private String bizIdentity;

    @OpenApiField(desc = "支付模型",constraint = "支付模型",demo = "P")
	private String payMode;

    @OpenApiField(desc = "身份证号",constraint = "身份证号",demo = "20130812020055285248")
	private String certNo;

    @OpenApiField(desc = "用户客户端IP",constraint = "用户客户端IP",demo = "10.182.19.12")
	private String userEndIp;

    @OpenApiField(desc = "用户终端类型",constraint = "用户终端类型",demo = "01")
	private String userTemunalType;

    @OpenApiField(desc = "交易类别",constraint = "交易类别",demo = "20130812020055285248")
	private String tradeCategory;

    @OpenApiField(desc = "商品类别Code",constraint = "商品类别Code",demo = "20130812020055285248")
	private String goodsTypeCode;

    @OpenApiField(desc = "商品类别名",constraint = "商品类别名",demo = "20130812020055285248")
	private String goodsTypeName;

    @OpenApiField(desc = "商品名",constraint = "商品名",demo = "20130812020055285248")
	private String goodsName;

    @OpenApiField(desc = "商户名",constraint = "商户名",demo = "20130812020055285248")
	protected String merchantName;

    @OpenApiField(desc = "商户类别",constraint = "商户类别",demo = "20130812020055285248")
	protected String mercCategoryName;

    @OpenApiField(desc = "商户类别Code",constraint = "商户类别Code",demo = "20130812020055285248")
	protected String mercCategoryCode;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBankProvName() {
        return bankProvName;
    }

    public void setBankProvName(String bankProvName) {
        this.bankProvName = bankProvName;
    }

    public String getBankCityName() {
        return bankCityName;
    }

    public void setBankCityName(String bankCityName) {
        this.bankCityName = bankCityName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public String getDeductToken() {
        return deductToken;
    }

    public void setDeductToken(String deductToken) {
        this.deductToken = deductToken;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSubOwner() {
        return subOwner;
    }

    public void setSubOwner(String subOwner) {
        this.subOwner = subOwner;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getBizIdentity() {
        return bizIdentity;
    }

    public void setBizIdentity(String bizIdentity) {
        this.bizIdentity = bizIdentity;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getUserEndIp() {
        return userEndIp;
    }

    public void setUserEndIp(String userEndIp) {
        this.userEndIp = userEndIp;
    }

    public String getUserTemunalType() {
        return userTemunalType;
    }

    public void setUserTemunalType(String userTemunalType) {
        this.userTemunalType = userTemunalType;
    }

    public String getTradeCategory() {
        return tradeCategory;
    }

    public void setTradeCategory(String tradeCategory) {
        this.tradeCategory = tradeCategory;
    }

    public String getGoodsTypeCode() {
        return goodsTypeCode;
    }

    public void setGoodsTypeCode(String goodsTypeCode) {
        this.goodsTypeCode = goodsTypeCode;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMercCategoryName() {
        return mercCategoryName;
    }

    public void setMercCategoryName(String mercCategoryName) {
        this.mercCategoryName = mercCategoryName;
    }

    public String getMercCategoryCode() {
        return mercCategoryCode;
    }

    public void setMercCategoryCode(String mercCategoryCode) {
        this.mercCategoryCode = mercCategoryCode;
    }
}
