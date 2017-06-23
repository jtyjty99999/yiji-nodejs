package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by tyongfu@yiji.com on 2016/1/21.
 */
@OpenApiMessage(service = "forwardYJFSit", type = ApiMessageType.Response)
public class ForwardYJFSitResponse extends ApiResponse {

    @OpenApiField(desc = "用户名称", constraint = "最大50字符",demo = "aaa@126.com")
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
