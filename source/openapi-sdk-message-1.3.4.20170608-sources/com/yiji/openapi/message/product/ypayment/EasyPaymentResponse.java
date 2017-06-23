/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-29 09:26 创建
 *
 */
package com.yiji.openapi.message.product.ypayment;

import java.util.List;

import com.yiji.openapi.message.product.ypayment.info.PayOrderInfoApi;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-29
 */
@OpenApiMessage(service = "easyPayment", type = ApiMessageType.Response)
public class EasyPaymentResponse extends ApiResponse {

    /**
     * 缴费结果
     */
    @OpenApiField(desc = "缴费结果",demo = "",constraint = "")
    List<PayOrderInfoApi> payOrderInfos;

    public List<PayOrderInfoApi> getPayOrderInfos() {
        return payOrderInfos;
    }

    public void setPayOrderInfos(List<PayOrderInfoApi> payOrderInfos) {
        this.payOrderInfos = payOrderInfos;
    }
}
