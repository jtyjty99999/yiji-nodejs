/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-03 08:58 创建
 *
 */
package com.yiji.openapi.message.product.ypayment;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-03
 */
@OpenApiMessage(service = "queryResourceInfo", type = ApiMessageType.Request)
public class QueryResourceInfoRequest extends ApiRequest {
    /**
     * 易极付用户（必填）
     */
    @NotBlank
    @OpenApiField(desc = "易极付会员用户",demo = "20150804020006971060")
    private String userId;

    /**
     * 平台类型
     */
    @NotBlank
    @OpenApiField(desc = "商户平台标识",demo = "YiPinHui")
    private String platformType;


    /** 请求类型 */
    @NotNull
    @OpenApiField(desc = "缴费类型",demo = "WATER")
    private String paymentType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }


}
