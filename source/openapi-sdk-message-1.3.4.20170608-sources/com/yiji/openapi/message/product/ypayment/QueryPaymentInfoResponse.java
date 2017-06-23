package com.yiji.openapi.message.product.ypayment;

import java.util.List;

import com.yiji.openapi.message.product.ypayment.info.PayOrderInfoApi;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-13 10:11.
 */
@OpenApiMessage(service = "queryPaymentInfo", type = ApiMessageType.Response)
public class QueryPaymentInfoResponse extends ApiResponse {


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
