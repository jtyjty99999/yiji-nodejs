package com.yiji.openapi.message.mpay.query;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-16 14:06.
 */
@OpenApiMessage(service = "mpayInitCertifyStatus", type = ApiMessageType.Response)
public class MpayInitCertifyStatusResponse extends ApiResponse {
}
