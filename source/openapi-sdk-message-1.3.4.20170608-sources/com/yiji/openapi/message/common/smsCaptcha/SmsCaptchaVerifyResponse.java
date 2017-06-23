/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 上午10:58:10 创建
 */
package com.yiji.openapi.message.common.smsCaptcha;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author lvchen@yiji.com
 *
 */
@OpenApiMessage(service = "smsCaptchaVerify", type = ApiMessageType.Response)
public class SmsCaptchaVerifyResponse extends ApiResponse {
	
}
