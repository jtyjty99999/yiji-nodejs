/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-29 17:05 创建
 *
 */
package com.yiji.openapi.message.product.ypayment;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-29
 */
@OpenApiMessage(service = "queryUserDebtMoney", type = ApiMessageType.Request)
public class QueryUserDebtMoneyRequest extends ApiRequest {

    /** 用户缴费代码 */
    @NotBlank
    @OpenApiField(desc = "用户缴费代码",constraint = "话费充值时，为手机号；水电气缴费，为卡号",demo = "00503011295")
    private String userCode;

    /** 请求类型 */
    @NotNull
    @OpenApiField(desc = "缴费类型",demo = "WATER")
    private String paymentType;

    /** 资源代码 */
    @NotBlank
    @OpenApiField(desc = "资源代码",demo = "002300001")
    private String resourceCode;

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

    /**
     * 门店号(易生活门店缴电费必传)
     */
    @Length(max=35)
    @OpenApiField(desc = "门店号",demo = "2058523555",constraint = "易生活门店缴电费必传")
    private String storeId;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

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
}
