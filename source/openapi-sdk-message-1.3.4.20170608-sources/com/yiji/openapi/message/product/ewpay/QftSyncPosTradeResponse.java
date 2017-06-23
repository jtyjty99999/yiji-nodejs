/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-19 11:35 创建
 *
 */
package com.yiji.openapi.message.product.ewpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-19
 */
@OpenApiMessage(service = "qftSyncPosTrade", type = ApiMessageType.Response)
public class QftSyncPosTradeResponse extends ApiResponse {

    @OpenApiField(desc = "同步结果状态", constraint = "{\"data\":[\"00:成功\",\"01:失败\"],\"name\":\"同步结果状态\"}", demo = "syncStatus")
    private String syncStatus;

    @OpenApiField(desc = "同步结果描述")
    private String syncMessage;


    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    public String getSyncMessage() {
        return syncMessage;
    }

    public void setSyncMessage(String syncMessage) {
        this.syncMessage = syncMessage;
    }
}
