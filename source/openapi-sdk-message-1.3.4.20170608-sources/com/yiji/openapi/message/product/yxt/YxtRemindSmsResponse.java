package com.yiji.openapi.message.product.yxt;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-07 15:57.
 */
@OpenApiMessage(service = "yxtRemindSms", type = ApiMessageType.Response)
public class YxtRemindSmsResponse extends ApiResponse {
}
