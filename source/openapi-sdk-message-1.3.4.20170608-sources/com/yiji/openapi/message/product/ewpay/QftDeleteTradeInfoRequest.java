package com.yiji.openapi.message.product.ewpay;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-24 13:55.
 */
@OpenApiMessage(service = "qftDeleteTradeInfo", type = ApiMessageType.Request)
public class QftDeleteTradeInfoRequest extends ApiRequest {
    /** 用户id（付款人） */
    @NotNull
    @Size(min = 20, max = 20)
    @OpenApiField(desc = "用户易极付ID",demo = "12346578901234569870")
    private String userId;

    /**外部订单号*/
    @NotNull
    @Size(min = 1, max = 32)
    @OpenApiField(desc = "外部订单号",demo = "1235648970123")
    private String outOrderNo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }
}
