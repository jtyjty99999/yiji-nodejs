package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by tyongfu@yiji.com on 2016/2/25.
 */
@Deprecated
@OpenApiMessage(service = "userRegister", type = ApiMessageType.Response)
public class UserRegisterResponse extends ApiResponse {

    @OpenApiField(demo = "20160225001111111111",desc = "会员号",constraint = "会员号")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
