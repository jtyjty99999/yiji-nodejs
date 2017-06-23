package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by tyongfu@yiji.com on 2016/1/28.
 */
@Deprecated
@OpenApiMessage(service = "yzzActivate", type = ApiMessageType.Response)
public class BasicForwardOpenResponse extends ApiResponse {

    @OpenApiField(desc = "key",constraint="key",demo = "")
    private String key;

    @OpenApiField(desc = "系统来源",constraint="系统来源",demo = "")
    private String systemFrom;

    @OpenApiField(desc = "用户ID",constraint="用户ID",demo = "")
    private String userId;

    @OpenApiField(desc = "请求时间",constraint="请求时间",demo = "")
    private String requestTime;

    @OpenApiField(desc = "异步通知地址",demo = "")
    private String notifyUrl;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSystemFrom() {
        return systemFrom;
    }

    public void setSystemFrom(String systemFrom) {
        this.systemFrom = systemFrom;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
}
