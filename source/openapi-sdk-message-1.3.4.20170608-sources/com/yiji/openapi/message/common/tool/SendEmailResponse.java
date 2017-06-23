package com.yiji.openapi.message.common.tool;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/1/15.
 */
@OpenApiMessage(service = "sendEmail", type = ApiMessageType.Response)
public class SendEmailResponse extends ApiResponse {
}
