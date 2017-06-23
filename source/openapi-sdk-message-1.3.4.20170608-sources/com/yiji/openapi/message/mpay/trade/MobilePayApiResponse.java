package com.yiji.openapi.message.mpay.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 易手富 响应报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "mobilePay", type = ApiMessageType.Response)
public class MobilePayApiResponse extends ApiResponse {
	
}
