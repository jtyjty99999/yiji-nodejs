/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-20 13:55 创建
 *
 */
package com.yiji.openapi.message.product.yrt;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-20
 */
@OpenApiMessage(service = "fundFreezeOrUnFreeze", type = ApiMessageType.Response)
public class FundFreezeOrUnFreezeResponse extends ApiResponse {

    /** 冻结(解冻)金额*/
    @OpenApiField(desc = "冻结(解冻)金额" , demo = "200000" , constraint = "")
    private Money freezeAmount;

    public Money getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(Money freezeAmount) {
        this.freezeAmount = freezeAmount;
    }
}
