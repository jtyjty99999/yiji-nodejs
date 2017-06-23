/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-19 18:49 创建
 *
 */
package com.yiji.openapi.message.mpay.common.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-19
 */
public class BindCardDtoInfo {

    /**
     * 签约号
     */
    @NotBlank
    @OpenApiField(desc = "签约号" , demo = "000k00201fuuftgb9400" , constraint = "")
    private String pactNo;

    /**
     * 银行名称
     */
    @OpenApiField(desc = "银行名称" , demo = "中国银行" , constraint = "")
    private String bankName;
    /**
     * 卡类型 借记卡: DEBIT 信用卡: CREDIT
     */
    @OpenApiField(desc = "卡类型" , demo = "DEBIT" , constraint = "{\"data\":[\"DEBIT:借记卡\",\"CREDIT:信用卡\"],\"name\":\"卡类型\"}")
    private String cardType;
    /**
     * 银行卡号(mask)
     */
    @NotBlank
    @OpenApiField(desc = "银行卡号" , demo = "6442566645587442" , constraint = "")
    private String cardNo;

    /**
     * 手机号
     */
    @OpenApiField(desc = "手机号" , demo = "13545475656" , constraint = "")
    private String mobileNo;
    /**
     * 银行代码
     */
    @NotBlank
    @OpenApiField(desc = "银行代码" , demo = "ABOCCNBJ310" , constraint = "")
    private String bankCode;
    /**
     * 银行logo
     */
    @OpenApiField(desc = "" , demo = "" , constraint = "")
    private String smallIcon;
    /**
     * 单笔限额
     */
    @OpenApiField(desc = "单笔限额" , demo = "50000" , constraint = "")
    private Money singleAmount;
    /**
     * 每日限额
     */
    @OpenApiField(desc = "每日限额" , demo = "5000" , constraint = "")
    private Money dailyAmount;
    /**
     * 是否可用 1可用，0不可用
     */
    @OpenApiField(desc = "是否可用" , demo = "1" , constraint = "{\"data\":[\"1:可用\",\"0:不可用\"],\"name\":\"是否显示抬头\"}")
    private String available;

    @NotNull
    @OpenApiField(desc = "签约目的" , demo = "DEDUCT" , constraint = "")
    private String purpose;

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getSmallIcon() {
        return smallIcon;
    }

    public void setSmallIcon(String smallIcon) {
        this.smallIcon = smallIcon;
    }

    public Money getSingleAmount() {
        return singleAmount;
    }

    public void setSingleAmount(Money singleAmount) {
        this.singleAmount = singleAmount;
    }

    public Money getDailyAmount() {
        return dailyAmount;
    }

    public void setDailyAmount(Money dailyAmount) {
        this.dailyAmount = dailyAmount;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}
