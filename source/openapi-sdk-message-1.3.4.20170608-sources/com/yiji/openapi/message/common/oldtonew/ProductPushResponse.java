package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-27<br>
 */
@OpenApiMessage(service = "productPushApiService", type = ApiMessageType.Response)
public class ProductPushResponse extends ApiResponse {
}
