package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/5/3 15:08.
 */
@OpenApiMessage(service = "commonEnchashmentCloseOrder", type = ApiMessageType.Request)
public class CommonEnchashmentCloseOrderRequest extends ApiRequest {

    /**
     * 订单号
     */
    @NotBlank
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
