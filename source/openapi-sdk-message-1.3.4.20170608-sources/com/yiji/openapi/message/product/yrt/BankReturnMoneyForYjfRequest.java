/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-20 10:52 创建
 *
 */
package com.yiji.openapi.message.product.yrt;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-20
 */
@OpenApiMessage(service = "bankReturnMoneyForYjf", type = ApiMessageType.Request)
public class BankReturnMoneyForYjfRequest extends ApiRequest {

    /** 银行简称 <code>bankCode</code> */
    @NotBlank(message = "银行简称不能为空")
    @OpenApiField(desc = "银行简称" , demo = "BC" , constraint = "")
    private String bankCode;

    /** 银行账户开户名<code>bankAccountName</code> */
    @OpenApiField(desc = "银行账户开户名" , demo = "熊本熊" , constraint = "")
    private String bankAccountName;

    /** 开户行地址 <code>bankAddress</code> */
    @OpenApiField(desc = "开户行地址" , demo = "重庆市江北区黄龙路黄龙花园" , constraint = "")
    private String bankAddress;

    /**充值账号 <code>userId</code> */
    @NotBlank(message = "充值账号不能为空")
    @OpenApiField(desc = "充值账号" , demo = "20160418010011058184" , constraint = "")
    private String userId;

    /** 充值金额 <code>amount</code> */
    @NotNull(message = "充值金额不能为空")
    @OpenApiField(desc = "充值金额" , demo = "2000" , constraint = "")
    private Money amount;

    /** 业务类型 <code>bizCode</code> */
    @NotNull(message = "业务类型不能为空")
    @OpenApiField(desc = "业务类型" , demo = "CONSUME" , constraint = "")
    private String busiType;

    /** 业务校验码 <code>bussineeCode</code> */
    @NotBlank(message = "业务校验码不能为空")
    @OpenApiField(desc = "业务校验码" , demo = "ACB56415ED" , constraint = "")
    private String bussineeCode;

    /**
     * 易极付备付金账户
     */
    @NotBlank(message = "易极付备付金账户不能为空")
    @Length(min = 5, max = 128)
    @OpenApiField(desc = "易极付备付金账户" , demo = "0051482158415145841" , constraint = "")
    private String yjfBankAccountNo;

    /** 外部商户号 <code>outMerchantNo</code> */
    @NotBlank(message = "外部商户号不能为空")
    @OpenApiField(desc = "外部商户号" , demo = "20140730020001144381" , constraint = "")
    private String outMerchantNo;

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getBussineeCode() {
        return bussineeCode;
    }

    public void setBussineeCode(String bussineeCode) {
        this.bussineeCode = bussineeCode;
    }

    public String getYjfBankAccountNo() {
        return yjfBankAccountNo;
    }

    public void setYjfBankAccountNo(String yjfBankAccountNo) {
        this.yjfBankAccountNo = yjfBankAccountNo;
    }

    public String getOutMerchantNo() {
        return outMerchantNo;
    }

    public void setOutMerchantNo(String outMerchantNo) {
        this.outMerchantNo = outMerchantNo;
    }
}
