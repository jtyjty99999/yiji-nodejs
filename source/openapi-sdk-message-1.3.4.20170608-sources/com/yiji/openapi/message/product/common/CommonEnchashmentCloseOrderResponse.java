package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import org.hibernate.validator.constraints.Length;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/5/3 15:09.
 */
@OpenApiMessage(service = "commonEnchashmentCloseOrder", type = ApiMessageType.Response)
public class CommonEnchashmentCloseOrderResponse extends ApiResponse {

    @Length(max = 20, min = 20)
    @OpenApiField(desc = "取现订单号",demo = "456329681523643164")
    private String tradeNo;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
