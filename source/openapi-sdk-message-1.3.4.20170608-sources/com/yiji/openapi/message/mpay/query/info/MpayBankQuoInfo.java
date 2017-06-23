/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午2:29:02 创建
 */
package com.yiji.openapi.message.mpay.query.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class MpayBankQuoInfo {
	 /** 物理主键 ID */
    private Long id;

    /** 银行编码 */
    @OpenApiField(desc = "银行简称",demo = "ABC")
    private String bankCode;

    /** 银行名称 */
    @OpenApiField(desc = "银行名称",demo = "中国农业银行")
    private String bankName;

    /** 卡类型 */
    @OpenApiField(desc = "银行卡类型",demo = "DEBIT_CARD")
    private String cardType;

    /** 单笔限额(分) */
    @OpenApiField(desc = "单笔限额",constraint = "单位：分",demo = "11")
    private long singleMaxAmount;

    /** 每日限额(分) */
    @OpenApiField(desc = "每日限额",demo = "11",constraint = "单位：分")
    private long dailyMaxAmount;

    @OpenApiField(desc = "每日交易次数",demo = "10")
    private int dailyMaxCount;
    /** 备注 */
    private String memo;

    private String smallIcon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public long getSingleMaxAmount() {
        return singleMaxAmount;
    }

    public void setSingleMaxAmount(long singleMaxAmount) {
        this.singleMaxAmount = singleMaxAmount;
    }

    public long getDailyMaxAmount() {
        return dailyMaxAmount;
    }

    public void setDailyMaxAmount(long dailyMaxAmount) {
        this.dailyMaxAmount = dailyMaxAmount;
    }

    public int getDailyMaxCount() {
        return dailyMaxCount;
    }

    public void setDailyMaxCount(int dailyMaxCount) {
        this.dailyMaxCount = dailyMaxCount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getSmallIcon() {
        return smallIcon;
    }

    public void setSmallIcon(String smallIcon) {
        this.smallIcon = smallIcon;
    }
}

    