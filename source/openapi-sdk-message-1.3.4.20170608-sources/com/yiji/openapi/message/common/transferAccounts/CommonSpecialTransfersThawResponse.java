/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-08-11 17:42 创建
 *
 */
package com.yiji.openapi.message.common.transferAccounts;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "commonSpecialTransfersThaw", type = ApiMessageType.Response)
public class CommonSpecialTransfersThawResponse extends ApiResponse {

    /**
     * 业务流水号
     */
    @OpenApiField(desc = "业务流水号",demo = "1234569780123465")
    private String bizNo;

    /** 结果状态 */
    @OpenApiField(desc = "结果状态",demo = "SUCCESS")
    protected String status;

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
