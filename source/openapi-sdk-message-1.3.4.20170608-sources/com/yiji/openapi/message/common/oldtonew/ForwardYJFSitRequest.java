package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by tyongfu@yiji.com on 2016/1/21.
 */
@OpenApiMessage(service = "forwardYJFSit", type = ApiMessageType.Request)
public class ForwardYJFSitRequest extends ApiRequest {

    @Length(max = 20,min = 20)
    @NotBlank
    @OpenApiField(desc = "用户ID",constraint = "只能是20位",demo = "20160121001111111111")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
