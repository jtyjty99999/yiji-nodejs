package com.yiji.openapi.message.product.ccp;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Administrator on 2016/3/21.
*/
@OpenApiMessage(service = "ccpLoanCancel", type = ApiMessageType.Response)
public class CcpLoanCancelResponse extends ApiResponse {
}

