package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by tyongfu@yiji.com on 2016/1/27.
 */
@OpenApiMessage(service = "ccpEasySpeedLoanApply", type = ApiMessageType.Response)
public class CcpEasySpeedLoanApplyRespose extends ApiResponse {

    @OpenApiField(desc = "业务流水号",constraint = "业务流水号",demo = "20160127001111111111")
    private String bizNo;

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }
}
