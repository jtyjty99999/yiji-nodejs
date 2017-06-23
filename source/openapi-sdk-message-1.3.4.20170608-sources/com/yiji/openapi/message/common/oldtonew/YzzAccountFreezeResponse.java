package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by tyongfu@yiji.com on 2016/2/14.
 */
@OpenApiMessage(service = "yzzAccountFreeze", type = ApiMessageType.Response)
public class YzzAccountFreezeResponse extends ApiResponse {

    @OpenApiField(desc = "备注", demo = "备注")
    private String memo;

    @OpenApiField(desc = "用户ID", demo = "20150519020005491913")
    private String userId;

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
