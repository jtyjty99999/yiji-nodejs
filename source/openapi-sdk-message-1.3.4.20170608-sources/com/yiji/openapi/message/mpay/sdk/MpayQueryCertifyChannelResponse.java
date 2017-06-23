/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-07-11 09:32 创建
 *
 */
package com.yiji.openapi.message.mpay.sdk;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.message.mpay.sdk.info.OpenapiChannelInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author zhike@yiji.com
 */
@OpenApiMessage(service = "mpayQueryCertifyChannel", type = ApiMessageType.Response)
public class MpayQueryCertifyChannelResponse extends ApiResponse {

    @NotNull
    @OpenApiField(desc = "渠道信息", constraint = "渠道信息", demo = "")
    private List<OpenapiChannelInfo> openapiChannelInfos;

    public List<OpenapiChannelInfo> getOpenapiChannelInfos() {
        return openapiChannelInfos;
    }

    public void setOpenapiChannelInfos(List<OpenapiChannelInfo> openapiChannelInfos) {
        this.openapiChannelInfos = openapiChannelInfos;
    }
}
