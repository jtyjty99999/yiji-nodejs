package com.yiji.openapi.message.mpay.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 发送交易验证码 响应报文
 * 
 * @author zhangpu
 * 
 */
@OpenApiMessage(service = "getVerifyCode", type = ApiMessageType.Response)
public class GetVerifyCodeApiResponse extends ApiResponse {
	
}
