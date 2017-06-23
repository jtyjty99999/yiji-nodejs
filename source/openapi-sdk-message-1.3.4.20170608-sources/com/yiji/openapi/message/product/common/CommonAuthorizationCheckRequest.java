package com.yiji.openapi.message.product.common;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by qianli on 2017/1/4.
 * 跳转易极付验权
 */
@OpenApiMessage(service = "commonAuthorizationCheck", type = ApiMessageType.Request)
public class CommonAuthorizationCheckRequest extends ApiRequest {
    @NotBlank
    @OpenApiField(desc = "易极付会员id", demo = "20165489625847153698")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
