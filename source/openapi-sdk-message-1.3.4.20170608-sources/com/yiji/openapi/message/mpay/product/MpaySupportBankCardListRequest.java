/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-24 10:01 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

import javax.validation.constraints.NotNull;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-24
 */
@OpenApiMessage(service = "mpaySupportBankCardList", type = ApiMessageType.Request)
public class MpaySupportBankCardListRequest extends ApiRequest {
    /**
     * 签约用户 :DEDUCT、WITHDRAW
     */
    @NotNull
    @OpenApiField(desc = "签约目的" , demo = "DEDUCT" , constraint = "")
    private String purpose;

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
