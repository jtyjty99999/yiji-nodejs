package com.yiji.openapi.message.mpay.sdk;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by hgeshu@yiji.com on 2016/7/14.
 */
@OpenApiMessage(service = "mpayQueryProfessions", type = ApiMessageType.Request)
public class MpayQueryProfessionsRequest extends ApiRequest {
}
