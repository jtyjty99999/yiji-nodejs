/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-08-25 17:47 创建
 *
 */
package com.yiji.openapi.message.product.yjr;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "yjrBankCard4ElementsCheck", type = ApiMessageType.Request)
public class YjrBankCard4ElementsCheckRequest extends ApiRequest {
    /**
     * 账户名
     */
    @NotEmpty
    @Size(min = 1, max = 64)
    @OpenApiField(desc = "账户名", constraint = "账户名")
    private String accName;
    /**
     * 账号
     */
    @NotEmpty
    @Size(min = 6, max = 64)
    @OpenApiField(desc = "账号", constraint = "账号")
    private String accNum;
    /**
     * 账户类型
     */
    @NotNull
    @OpenApiField(desc = "账户类型", constraint = "账户类型")
    private String accType;
    /**
     * 证件类型
     */
    @OpenApiField(desc = "证件类型", constraint = "证件类型")
    private String certType;
    /**
     * 证件号
     */
    @NotBlank
    @OpenApiField(desc = "证件号", constraint = "证件号")
    private String certNo;
    /**
     * 交易日期
     */
    @NotNull
    @OpenApiField(desc = "交易日期", constraint = "交易日期")
    private Date transDate;
    /**
     * 客户银行代码
     */
    @NotBlank
    @OpenApiField(desc = "客户银行代码", constraint = "客户所在银行代码")
    private String bankCode;

    /**
     * 账户银行预留手机号
     */
    @NotBlank
    @OpenApiField(desc = "预留手机号", constraint = "客户在银行预留的手机号")
    private String accPhoneNum;

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getAccPhoneNum() {
        return accPhoneNum;
    }

    public void setAccPhoneNum(String accPhoneNum) {
        this.accPhoneNum = accPhoneNum;
    }
}
