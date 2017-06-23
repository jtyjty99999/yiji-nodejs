package com.yiji.openapi.message.mpay.query;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-16 14:07.
 */
@OpenApiMessage(service = "mpayInitCertifyStatus", type = ApiMessageType.Request)
public class MpayInitCertifyStatusRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "用户ID",constraint = "用户登录易极付ID",demo = "12346574980123465789")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
