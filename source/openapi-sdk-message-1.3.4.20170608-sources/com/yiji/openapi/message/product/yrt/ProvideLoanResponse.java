/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-17 16:43 创建
 *
 */
package com.yiji.openapi.message.product.yrt;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-17
 */
@OpenApiMessage(service = "provideLoan", type = ApiMessageType.Response)
public class ProvideLoanResponse extends ApiResponse{

    /** 结果状态 */
    @NotBlank
    @OpenApiField(desc = "结果状态" , demo = "SUCCESS" , constraint = "")
    protected String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
