package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by tyongfu@yiji.com on 2016/1/27.
 */
@OpenApiMessage(service = "bankCodeBindingQuery", type = ApiMessageType.Request)
public class BankCodeBindingQueryRequest  extends ApiRequest{

    @NotBlank
    @OpenApiField(desc = "易极付用户ID",demo = "201603984857743285872")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
