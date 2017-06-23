package com.yiji.openapi.message.mpay.query;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-14 13:55.
 */
@OpenApiMessage(service = "mpayQueryCertifyStatus", type = ApiMessageType.Request)
public class MpayQueryCertifyStatusRequest extends ApiRequest {
    @NotBlank
    @Length(max = 20,min = 20)
    @OpenApiField(desc = "用户ID",demo = "用户登录易极付ID")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
