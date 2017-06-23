package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-16 9:49.
 */
@OpenApiMessage(service = "depositBack", type = ApiMessageType.Response)
public class DepositBackReaponse extends ApiResponse{
}
