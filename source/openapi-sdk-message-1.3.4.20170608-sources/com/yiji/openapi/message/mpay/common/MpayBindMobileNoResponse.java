package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 易手富 绑定手机号码 响应报文
 * 
 * @author zhangpu
 *
 */
@OpenApiMessage(service = "mpayBindMobileNo", type = ApiMessageType.Response)
public class MpayBindMobileNoResponse extends ApiResponse {
	
}
