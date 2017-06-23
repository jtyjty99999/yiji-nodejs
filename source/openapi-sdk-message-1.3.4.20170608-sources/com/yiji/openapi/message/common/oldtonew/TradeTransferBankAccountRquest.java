package com.yiji.openapi.message.common.oldtonew;

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
 * @author hgeshu@yiji.com
 * @since 2016-03-14 14:37.
 */
@Deprecated
@OpenApiMessage(service = "trade_transfer_bank_account", type = ApiMessageType.Request)
public class TradeTransferBankAccountRquest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "买家会员ID",demo = "123456789123564")
    private String buyerUserId;

    /** 交易名称 */
    @Size(max = 64)
    @OpenApiField(desc = "交易名称",demo = "交易")
    private String tradeName;

    @OpenApiField(desc = "手续费是否包含在本金中",demo = "true",constraint = "默认包含")
    private boolean isContainInTradeAmount = true;

    @NotNull
    @OpenApiField(desc = "交易金额",demo = "88.66")
    private Money tradeAmount;

    /** 交易备注 */
    @Length(max = 1024)
    @OpenApiField(desc = "交易备注",demo = "备注")
    private String tradeMemo;

    /** 转到的银行卡号 */
    @NotBlank
    @Length(max = 30)
    @OpenApiField(desc = "转到的银行卡号",demo = "62414852145261")
    private String bankAccountNo;

    /** 银行账户开户名 */
    @NotBlank
    @Length(max = 128)
    @OpenApiField(desc = "银行账户开户名",demo = "张三")
    private String bankAccountName;

    /** 开户行地址 */
    @Length(max = 256)
    @OpenApiField(desc = "开户行地址",demo = "重庆市")
    private String bankAddress;

    /** 银行省名 */
    @OpenApiField(desc = "银行省名",demo = "重庆")
    private String provName;

    /** 银行市名 */
    @OpenApiField(desc = "银行市名",demo = "重庆")
    private String cityName;

    /** 银行代码 */
    @NotNull
    @OpenApiField(desc = "银行代码",demo = "ICBC")
    private String bankCode;

    /** 银行卡类型 */
    @NotNull
    @OpenApiField(desc = "银行卡类型",demo = "DEBIT_CARD",constraint = "默认借记卡")
    private String bankCardTypeEnum;

    /** 是否对公 */
    @OpenApiField(desc = "是否对公",demo = "Y",constraint = "默认对私")
    private String publicTag;

    /** 真实姓名 */
    @NotNull
    @Length(max = 128)
    @OpenApiField(desc = "真实姓名",demo = "张三")
    private String realName;

    @OpenApiField(desc = "字符集",demo = "UTF-8")
    private String inputCharset;

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public boolean isContainInTradeAmount() {
        return isContainInTradeAmount;
    }

    public void setContainInTradeAmount(boolean containInTradeAmount) {
        isContainInTradeAmount = containInTradeAmount;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getTradeMemo() {
        return tradeMemo;
    }

    public void setTradeMemo(String tradeMemo) {
        this.tradeMemo = tradeMemo;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankCardTypeEnum() {
        return bankCardTypeEnum;
    }

    public void setBankCardTypeEnum(String bankCardTypeEnum) {
        this.bankCardTypeEnum = bankCardTypeEnum;
    }

    public String getPublicTag() {
        return publicTag;
    }

    public void setPublicTag(String publicTag) {
        this.publicTag = publicTag;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getInputCharset() {
        return inputCharset;
    }

    public void setInputCharset(String inputCharset) {
        this.inputCharset = inputCharset;
    }
}
