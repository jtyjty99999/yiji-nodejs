package com.yiji.openapi.message.product.pmp;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-13 17:12.
 */
@OpenApiMessage(service = "pmpSyncOrder", type = ApiMessageType.Response)
public class PmpSyncOrderResponse extends ApiResponse {

    @OpenApiField(desc = "商户订单号", constraint = "订单号不超过20字节",demo = "31256478901234567890")
    private String outOrderId;

    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }
}
