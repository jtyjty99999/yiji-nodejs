package com.yiji.openapi.message.product.ccp;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-23 16:10.
 */
@OpenApiMessage(service = "ccpSendLetter", type = ApiMessageType.Response)
public class CcpSendLetterResponse extends ApiResponse {
}
