/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-09-01 15:00 创建
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
@OpenApiMessage(service = "commonReTexting", type = ApiMessageType.Response)
public class CommonReTextingResponse extends ApiResponse {
    /** 短信倒计时剩余时间 */
    @OpenApiField(desc = "短信倒计时剩余时间",demo = "59")
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
