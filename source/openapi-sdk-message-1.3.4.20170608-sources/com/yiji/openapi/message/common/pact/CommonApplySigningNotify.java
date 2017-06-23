/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-09-01 11:19 创建
 *
 */
package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "commonApplySigning", type = ApiMessageType.Notify)
public class CommonApplySigningNotify extends ApiNotify {
    /** 会员号 */
    @OpenApiField(desc = "会员号")
    private String userId;

    /** 流水号 */
    @OpenApiField(desc = "流水号")
    private String pactNo;

    /** 卡号 */
    @OpenApiField(desc = "卡号")
    private String cardNo;

    /** 卡类型，DEBIT 借记卡 CREDIT 贷记卡 */
    @OpenApiField(desc = "卡类型")
    private String cardType;

    /** 银行简称 */
    @OpenApiField(desc = "银行简称")
    private String bankCode;

    /** 银行名称 */
    @OpenApiField(desc = "银行名称")
    private String bankName;

    /** 签约状态 */
    @OpenApiField(desc = "签约状态")
    private String pactStatus;

    @OpenApiField(desc = "消息")
    private String message;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getCardNo() {
        return cardNo;
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

    public String getPactStatus() {
        return pactStatus;
    }

    public void setPactStatus(String pactStatus) {
        this.pactStatus = pactStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
