package com.yiji.openapi.message.common.register;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Jason Ma on 2015/3/30.
 */
@Deprecated
@OpenApiMessage(service = "ppmRedirectRegister", type = ApiMessageType.Request)
public class PpmRedirectRegisterRequest extends ApiRequest {
	
}
