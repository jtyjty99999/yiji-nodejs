package com.yiji.openapi.message.mpay.sdk;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by hgeshu@yiji.com on 2016/7/14.
 */
@OpenApiMessage(service = "mpayPromoteAccount", type = ApiMessageType.Response)
public class MpayPromoteAccountResponse extends ApiResponse {
}
