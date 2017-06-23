/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-17 14:54 创建
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
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-17
 */
@OpenApiMessage(service = "queryYrtTrade", type = ApiMessageType.Request)
public class QueryYrtTradeRequest extends ApiRequest {

    /** 交易流水号 <code>tradeNo</code> */
    @NotBlank(message = "交易流水号不能为空")
    @OpenApiField(desc = "交易流水号" , demo = "000g00301fvi0zvjjg23" , constraint = "")
    private String tradeNo;

    /**归还金额*/
    @NotNull(message = "归还金额不能为空")
    @OpenApiField(desc = "归还金额" , demo = "8000" , constraint = "")
    private Money amount;

    /** 外部商户号 <code>outMerchantNo</code> */
    @NotBlank(message = "外部商户号不能为空")
    @OpenApiField(desc = "外部商户号" , demo = "20140730020001144381" , constraint = "")
    private String outMerchantNo;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getOutMerchantNo() {
        return outMerchantNo;
    }

    public void setOutMerchantNo(String outMerchantNo) {
        this.outMerchantNo = outMerchantNo;
    }
}
