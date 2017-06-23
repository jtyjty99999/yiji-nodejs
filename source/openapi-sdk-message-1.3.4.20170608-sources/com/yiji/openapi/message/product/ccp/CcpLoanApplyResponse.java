package com.yiji.openapi.message.product.ccp;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Administrator on 2016/3/25.
 */
@OpenApiMessage(service = "ccpLoanApply", type = ApiMessageType.Response)
public class CcpLoanApplyResponse extends ApiResponse {
    @OpenApiField(desc = "融资订单号",demo = "201603084545487")
    private String bizNo;

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }
}
