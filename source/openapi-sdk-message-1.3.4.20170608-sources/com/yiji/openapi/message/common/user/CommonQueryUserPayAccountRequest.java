package com.yiji.openapi.message.common.user;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/20 11:11.
 */
@OpenApiMessage(service = "commonQueryUserPayAccount", type = ApiMessageType.Request)
public class CommonQueryUserPayAccountRequest extends ApiRequest {

    /**
     * 用户ID
     */
    @OpenApiField(desc = "用户易极付ID",demo = "2017548596541784536",constraint = "userId与userName不能同时为空")
    private String userId;

    /**
     * 用户登录名
     */
    @OpenApiField(desc = "用户易极付登录名",demo = "14655145",constraint = "userId与userName不能同时为空")
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
