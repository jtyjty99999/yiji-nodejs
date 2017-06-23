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

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-20
 */
@OpenApiMessage(service = "bankReturnMoneyForYjf", type = ApiMessageType.Response)
public class BankReturnMoneyForYjfResponse extends ApiResponse {

    /**支付流水*/
    @OpenApiField(desc = "支付流水" , demo = "000f00000100000000016052" , constraint = "")
    private String payNo;

    /**金额*/
    @OpenApiField(desc = "金额" , demo = "20000" , constraint = "")
    private Money amount;

    /**备注*/
    @OpenApiField(desc = "备注" , demo = "该交易完成" , constraint = "")
    private String memo;


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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

}
