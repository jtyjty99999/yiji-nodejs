package com.yiji.openapi.message.mpay.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 新增银行卡 响应报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "validateVerifyCode", type = ApiMessageType.Response)
public class ValidateVerifyCodeApiResponse extends ApiResponse {
	
}
