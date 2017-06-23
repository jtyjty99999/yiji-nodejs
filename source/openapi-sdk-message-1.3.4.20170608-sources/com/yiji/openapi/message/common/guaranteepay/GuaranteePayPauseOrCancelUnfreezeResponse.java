/**
 * 
 */
package com.yiji.openapi.message.common.guaranteepay;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mayansen
 * @date 20140827
 *
 */
@OpenApiMessage(service = "guaranteePayFreezeUnfreeze", type = ApiMessageType.Response)
public class GuaranteePayPauseOrCancelUnfreezeResponse extends ApiResponse {
	
}
