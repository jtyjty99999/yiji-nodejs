/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-25 14:16 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.message.common.oldtonew.info.BillOrderItemV2Info;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

import java.util.List;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/25
 */
@Deprecated
@OpenApiMessage(service = "queryOrderStatusV2", type = ApiMessageType.Response)
public class QueryOrderStatusV2Response extends ApiResponse {
    @OpenApiField(desc="订单明细列表",demo="[订单1，订单2]")
    private List<BillOrderItemV2Info> info;

    @OpenApiField(desc="订单状态",demo="SUCCESS")
    private String status;

    public List<BillOrderItemV2Info> getInfo() {
        return info;
    }

    public void setInfo(List<BillOrderItemV2Info> info) {
        this.info = info;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
