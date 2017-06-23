/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-09-01 14:04 创建
 *
 */
package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "commonApplySigning", type = ApiMessageType.Response)
public class CommonApplySigningResponse extends ApiResponse {
    /** 签约流水号 */
    @OpenApiField(desc = "签约流水号")
    private String pactNo;

    /** 签约状态 */
    @OpenApiField(desc = "签约状态")
    private String pactStatus;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getPactStatus() {
        return pactStatus;
    }

    public void setPactStatus(String pactStatus) {
        this.pactStatus = pactStatus;
    }
}
