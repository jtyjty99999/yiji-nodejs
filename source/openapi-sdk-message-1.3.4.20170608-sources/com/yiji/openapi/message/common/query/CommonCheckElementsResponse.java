/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-09-17 10:34 创建
 *
 */
package com.yiji.openapi.message.common.query;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "commonCheckElements", type = ApiMessageType.Response)
public class CommonCheckElementsResponse extends ApiResponse {

    /**
     * complete 用户要素齐全
     * auditing 用户要素不齐，在补全审核中
     * incomplete 用户要素不齐全
     * */
    @OpenApiField(desc = "用户要素完整状态",constraint = "complete 用户要素齐全\n" +
            "auditing 用户要素不齐，在补全审核中\n" +
            "incomplete 用户要素不齐全")
    private String  completeStatus;

    public String getCompleteStatus() {
        return completeStatus;
    }

    public void setCompleteStatus(String completeStatus) {
        this.completeStatus = completeStatus;
    }
}
