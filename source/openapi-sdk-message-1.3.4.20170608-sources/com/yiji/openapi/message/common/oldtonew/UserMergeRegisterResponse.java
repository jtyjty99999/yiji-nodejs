package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by tyongfu@yiji.com on 2016/2/25.
 */
@OpenApiMessage(service = "userMergeRegister", type = ApiMessageType.Response)
public class UserMergeRegisterResponse extends ApiResponse {

    @OpenApiField(demo = "会员号",desc = "20160225001111111111",constraint = "")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
