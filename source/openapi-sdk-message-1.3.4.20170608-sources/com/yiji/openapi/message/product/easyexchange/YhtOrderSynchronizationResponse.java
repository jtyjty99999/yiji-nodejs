/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-05 14:58 创建
 *
 */
package com.yiji.openapi.message.product.easyexchange;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-05
 */
@OpenApiMessage(service = "yhtOrderSynchronization", type = ApiMessageType.Response)
public class YhtOrderSynchronizationResponse extends ApiResponse {


    @OpenApiField(desc = "错误源" , demo = "网络错误" , constraint = "")
    private String source;


    @OpenApiField(desc = "错误详情" , demo = "下载错误" , constraint = "")
    private String failReason;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }
}
