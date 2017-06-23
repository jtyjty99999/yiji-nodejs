package com.yiji.openapi.message.product.yxt;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2015-10-10 17:43.
 */
@OpenApiMessage(service = "yxtQuicklyRemittance", type = ApiMessageType.Response)
public class YxtQuicklyRemittanceResponse extends ApiResponse {
}
