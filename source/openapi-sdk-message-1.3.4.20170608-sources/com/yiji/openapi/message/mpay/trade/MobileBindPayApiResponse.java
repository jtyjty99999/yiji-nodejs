package com.yiji.openapi.message.mpay.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 绑卡支付 响应报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "mobileBindPay", type = ApiMessageType.Response)
public class MobileBindPayApiResponse extends ApiResponse {
	
}
