package com.yiji.openapi.message.product.common;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * Created by qianli on 2017/1/4.
 */
@OpenApiMessage(service = "commonAuthorizationCheck", type = ApiMessageType.Notify)
public class CommonAuthorizationCheckNotify extends ApiNotify {
    /**
     * 总收益
     */
    @OpenApiField(desc = "易极付会员id",demo = "20165489625847153698")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
