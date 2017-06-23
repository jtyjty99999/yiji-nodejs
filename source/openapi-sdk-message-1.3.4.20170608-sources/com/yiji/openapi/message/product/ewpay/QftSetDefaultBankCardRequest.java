/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-07 10:36 创建
 *
 */
package com.yiji.openapi.message.product.ewpay;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-07
 */
@OpenApiMessage(service = "qftSetDefaultBankCard", type = ApiMessageType.Request)
public class QftSetDefaultBankCardRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "外部会员ID" , demo = "2015091219191650972" , constraint = "")
    private String partnerShopId;

    @NotBlank
    @OpenApiField(desc = "易极付ID" , demo = "2015091219191650972" , constraint = "")
    private String userId;

    public String getPartnerShopId() {
        return partnerShopId;
    }

    public void setPartnerShopId(String partnerShopId) {
        this.partnerShopId = partnerShopId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
