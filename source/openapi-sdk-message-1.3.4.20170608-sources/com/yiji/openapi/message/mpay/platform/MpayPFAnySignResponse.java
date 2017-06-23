/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-09-10 11:06 创建
 *
 */
package com.yiji.openapi.message.mpay.platform;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mpayPFAnySign", type = ApiMessageType.Response)
public class MpayPFAnySignResponse extends ApiResponse {

    /*签约流水号*/
    @OpenApiField(desc = "签约流水号",demo = "12345697801465")
    private String pactNo;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }
}
