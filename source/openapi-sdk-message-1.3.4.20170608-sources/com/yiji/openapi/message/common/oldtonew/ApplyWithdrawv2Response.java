/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-25 14:12 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.message.common.oldtonew.info.WithdrawInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/25
 */
@OpenApiMessage(service = "applyWithdrawv2", type = ApiMessageType.Response)
public class ApplyWithdrawv2Response extends ApiResponse {
    @OpenApiField(desc = "提现信息",demo = "XXX")
    WithdrawInfo info;

    public WithdrawInfo getInfo() {
        return info;
    }

    public void setInfo(WithdrawInfo info) {
        this.info = info;
    }
}
