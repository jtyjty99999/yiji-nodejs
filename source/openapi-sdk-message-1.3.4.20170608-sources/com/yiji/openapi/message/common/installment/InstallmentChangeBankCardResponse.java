/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-15 09:43 创建
 *
 */
package com.yiji.openapi.message.common.installment;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "installmentChangeBankCard", type = ApiMessageType.Response)
public class InstallmentChangeBankCardResponse extends ApiResponse {
}
