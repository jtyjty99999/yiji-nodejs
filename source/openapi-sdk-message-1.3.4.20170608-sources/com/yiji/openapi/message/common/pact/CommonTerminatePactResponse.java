package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/3/1 11:44.
 */
@OpenApiMessage(service = "commonTerminatePact", type = ApiMessageType.Response)
public class CommonTerminatePactResponse extends ApiResponse {
}
