/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-07-14 16:02 创建
 *
 */
package com.yiji.openapi.message.product.yrt;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author zhike@yiji.com
 */
@OpenApiMessage(service = "studentLoanPayment", type = ApiMessageType.Response)
public class StudentLoanPaymentResponse extends ApiResponse {

    @OpenApiField(desc = "充值流水ID" , demo = "000q00101fzemz95fo00" , constraint = "充值流水ID")
    private String payNo;

    @NotBlank
    @OpenApiField(desc = "结果状态" , demo = "SUCCESS" , constraint = "结果状态")
    private String status;

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
