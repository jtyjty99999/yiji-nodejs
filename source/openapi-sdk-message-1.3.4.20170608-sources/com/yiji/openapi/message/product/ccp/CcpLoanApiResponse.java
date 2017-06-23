package com.yiji.openapi.message.product.ccp;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Administrator on 2016/3/25.
 */
@OpenApiMessage(service = "ccpLoan", type = ApiMessageType.Response)
public class CcpLoanApiResponse extends ApiResponse {
}
