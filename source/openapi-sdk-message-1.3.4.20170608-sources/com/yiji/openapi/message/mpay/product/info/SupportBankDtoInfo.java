/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-24 10:06 创建
 *
 */
package com.yiji.openapi.message.mpay.product.info;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-24
 */
public class SupportBankDtoInfo {

    /**
     * 银行编码
     */
    @NotBlank
    @OpenApiField(desc = "银行编码" , demo = "ABC" , constraint = "")
    private String bankCode;
    /**
     * 银行名称
     */
    @NotBlank
    @OpenApiField(desc = "银行名称" , demo = "农业银行" , constraint = "")
    private String bankName;
    /**
     * 卡类型
     * 借记卡:DEBIT
     * 信用卡: CREDIT
     */
    @NotBlank
    @OpenApiField(desc = "卡类型" , demo = "DEBIT" , constraint = "{\"data\":[\"DEBIT:借记卡\",\"CREDIT:信用卡\"],\"name\":\"卡类型\"}")
    private String cardType;
    /**
     * 单笔限额(分)
     */
    @OpenApiField(desc = "单笔限额(分)" , demo = "2500000" , constraint = "")
    private Money singleAmount;
    /**
     * 每日限额(分)
     */
    @OpenApiField(desc = "每日限额(分)" , demo = "6500000" , constraint = "")
    private Money dailyAmount;

    @OpenApiField(desc = "银行图标地址" , demo = "" , constraint = "")
    private String smallIcon;

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
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

    public String getSmallIcon() {
        return smallIcon;
    }

    public void setSmallIcon(String smallIcon) {
        this.smallIcon = smallIcon;
    }
}
