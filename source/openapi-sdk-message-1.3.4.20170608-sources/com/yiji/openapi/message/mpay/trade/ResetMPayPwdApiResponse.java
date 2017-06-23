package com.yiji.openapi.message.mpay.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 找回易手富密码 响应报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "resetMPayPwd", type = ApiMessageType.Response)
public class ResetMPayPwdApiResponse extends ApiResponse {
	
}
