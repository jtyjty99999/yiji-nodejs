/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-29 16:20 创建
 *
 */
package com.yiji.openapi.message.product.ypayment;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-29
 */
@OpenApiMessage(service = "checkPaymentUser", type = ApiMessageType.Response)
public class CheckPaymentUserResponse extends ApiResponse {


    @NotNull
    @OpenApiField(desc = "缴费用户是否存在",constraint = "true:存在，false：不存在")
    private Boolean isExist;

    public Boolean getExist() {
        return isExist;
    }

    public void setExist(Boolean exist) {
        isExist = exist;
    }
}
