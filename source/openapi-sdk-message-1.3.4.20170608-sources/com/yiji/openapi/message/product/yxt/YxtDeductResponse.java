package com.yiji.openapi.message.product.yxt;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月22日
 */
@OpenApiMessage(service = "yxtDeduct", type = ApiMessageType.Response)
public class YxtDeductResponse extends ApiResponse {
}
