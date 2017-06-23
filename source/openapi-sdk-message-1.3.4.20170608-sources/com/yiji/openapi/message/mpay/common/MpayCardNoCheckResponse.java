/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-20 09:15 创建
 *
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-20
 */
@OpenApiMessage(service = "mpayCardNoCheck", type = ApiMessageType.Response)
public class MpayCardNoCheckResponse extends ApiResponse {
    /**
     * 银行代码
     */
    @NotBlank
    @OpenApiField(desc = "银行代码" , demo = "ABOCCNBJ310" , constraint = "")
    private String bankCode;
    /**
     * 银行名称
     */
    @NotBlank
    @OpenApiField(desc = "银行名称" , demo = "中国银行" , constraint = "")
    private String bankName;
    /**
     * 银行卡号
     */
    @OpenApiField(desc = "银行卡号" , demo = "6212199235569444" , constraint = "")
    private String cardNo;
    /**
     * 卡类型 借记卡: DEBIT 信用卡: CREDIT
     */
    @NotBlank
    @OpenApiField(desc = "卡类型" , demo = "CREDIT" , constraint = "{\"data\":[\"DEBIT:借记卡\",\"CREDIT:信用卡\"],\"name\":\"卡类型\"}")
    private String cardType;
    /**
     * 卡号长度
     */
    @OpenApiField(desc = "卡号长度" , demo = "16" , constraint = "")
    private String numbers;

    /**
     * 图标url
     */
    @OpenApiField(desc = "图标url" , demo = "http://picture.com?pho=123" , constraint = "")
    private String smallIcon;

    public String getSmallIcon() {
        return smallIcon;
    }

    public void setSmallIcon(String smallIcon) {
        this.smallIcon = smallIcon;
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

    public String getCardNo() {
        return cardNo;
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

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }
}
