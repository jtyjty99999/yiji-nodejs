/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-07-14 16:02 创建
 *
 */
package com.yiji.openapi.message.product.yrt;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author zhike@yiji.com
 */
@OpenApiMessage(service = "studentLoanPayment", type = ApiMessageType.Request)
public class StudentLoanPaymentRequest extends ApiRequest {

    @NotBlank(message = "外部商户号不能为空")
    @OpenApiField(desc = "外部商户号" , demo = "201603102222254" , constraint = "外部商户号")
    private String outMerchantNo;

    @NotNull(message = "充值金额不能为空")
    @OpenApiField(desc = "充值金额" , demo = "66.66" , constraint = "充值金额")
    private Money amount;

    @NotBlank(message = "外部商户号不能为空")
    @OpenApiField(desc = "签约流水号" , demo = "000q00101fzemz95fo00" , constraint = "签约流水号")
    private String pactNo;

    public String getOutMerchantNo() {
        return outMerchantNo;
    }

    public void setOutMerchantNo(String outMerchantNo) {
        this.outMerchantNo = outMerchantNo;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }
}
