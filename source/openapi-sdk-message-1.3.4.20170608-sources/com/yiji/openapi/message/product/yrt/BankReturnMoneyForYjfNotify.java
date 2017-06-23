/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-20 11:09 创建
 *
 */
package com.yiji.openapi.message.product.yrt;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-20
 */
@OpenApiMessage(service = "bankReturnMoneyForYjf", type = ApiMessageType.Notify)
public class BankReturnMoneyForYjfNotify extends ApiNotify {
    /**支付流水*/
    @OpenApiField(desc = "支付流水" , demo = "000f00000100000000016052" , constraint = "")
    private String payNo;

    /**金额*/
    @OpenApiField(desc = "金额" , demo = "20000" , constraint = "")
    private Money amount;

    /** 结果状态 */
    @NotBlank
    @OpenApiField(desc = "结果状态" , demo = "fail" , constraint = "")
    protected String status;

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
