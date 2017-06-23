package com.yiji.openapi.message.mpay.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 银行卡鉴权 响应报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "validateBankCard", type = ApiMessageType.Response)
public class ValidateBankCardApiResponse extends ApiResponse {
	
}
