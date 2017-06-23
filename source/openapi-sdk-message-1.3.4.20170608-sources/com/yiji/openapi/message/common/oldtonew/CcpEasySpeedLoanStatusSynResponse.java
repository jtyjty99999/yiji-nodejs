package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by tyongfu@yiji.com on 2016/1/26.
 */
@OpenApiMessage(service = "ccpEasySpeedLoanStatusSyn", type = ApiMessageType.Response)
public class CcpEasySpeedLoanStatusSynResponse extends ApiResponse {

    @OpenApiField(desc = "融资订单id",demo = "20160221000000152671",constraint = "融资订单id")
    private String bizNo;

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }
}
