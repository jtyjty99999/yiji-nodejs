/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午2:27:06 创建
 */
package com.yiji.openapi.message.mpay.query.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class MpayBindCardInfo {
	 /** 物理主键 ID */
    private Long id;
    /** 银行名称 */
    @OpenApiField(desc = "银行名称",demo = "中国银行")
    private String bankName;

    /** 卡类型 */
    @OpenApiField(desc = "卡类型",demo = "DEBIT_CARD")
    private String cardType;

    /** 卡号 */
    @OpenApiField(desc = "银行卡号",demo = "213564789123321")
    private String bankAccountNo;
    /** 省略卡号 */
    private String cardNo;
    /** 手机号 */
    @OpenApiField(desc = "手机号码",demo = "10086100101")
    private String mobileNo;
    /** 银行代码 */
    private String bankCode;

    private String realName;

    private String pactNo;

    /** 银行图片 */
    private String smallIcon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getSmallIcon() {
        return smallIcon;
    }

    public void setSmallIcon(String smallIcon) {
        this.smallIcon = smallIcon;
    }
}

    