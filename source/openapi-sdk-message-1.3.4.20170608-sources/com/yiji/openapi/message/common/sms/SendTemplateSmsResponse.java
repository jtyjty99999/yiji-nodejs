package com.yiji.openapi.message.common.sms;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-02-23 14:45.
 */
@OpenApiMessage(service = "sendTemplateSms", type = ApiMessageType.Response)
public class SendTemplateSmsResponse extends ApiResponse {
}
