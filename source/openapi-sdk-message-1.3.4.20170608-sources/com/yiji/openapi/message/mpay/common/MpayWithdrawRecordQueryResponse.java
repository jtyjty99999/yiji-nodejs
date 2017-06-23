package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by mliao on 2015/8/4.
 */
@OpenApiMessage(service = "mpayWithdrawRecordQuery", type = ApiMessageType.Response)
public class MpayWithdrawRecordQueryResponse extends ApiResponse {

    @OpenApiField(desc = "gid",constraint="gid",demo="20151016000451549430")
    private String gid;

    @OpenApiField(desc = "用户id",constraint="用户id",demo="20151016000451549430")
    private String userId;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
