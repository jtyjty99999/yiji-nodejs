package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-02 9:55.
 */
@OpenApiMessage(service = "zbjCreditlogin", type = ApiMessageType.Request)
public class ZbjCreditloginRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "易极付用户ID",demo = "214586158125151")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
