package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Administrator on 2016/8/26.
 */
@OpenApiMessage(service = "multipleTradeMergeQuery", type = ApiMessageType.Request)
public class MultipleTradeMergeQueryRequest extends ApiRequest {
    @OpenApiField(desc = "多笔的交易流水号，以“，”隔开", demo = "000s01u01g6nkxnzlw00,000s01u01g6nkxnzlw01,000s01u01g6nkxnzlw02", constraint = "最大100笔")
    private String tradeNos;

    @OpenApiField(desc = "多笔业务订单号，以“，”隔开", demo = "0011472203888919,0011472203888918,0011472203888916", constraint = "最大100笔")
    private String merchantOrderNos;

    public String getTradeNos() {
        return tradeNos;
    }

    public void setTradeNos(String tradeNos) {
        this.tradeNos = tradeNos;
    }

    public String getMerchantOrderNos() {
        return merchantOrderNos;
    }

    public void setMerchantOrderNos(String merchantOrderNos) {
        this.merchantOrderNos = merchantOrderNos;
    }

}
