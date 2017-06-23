package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-10 12:09.
 */
@OpenApiMessage(service = "mpayModifyPayPwd", type = ApiMessageType.Notify)
public class MpayModifyPayPwdNotify extends ApiNotify {
    @OpenApiField(desc = "用户ID",constraint = "用户登录易极付ID",demo = "12345697801324659870")
    private String userId;

    @OpenApiField(desc = "修改状态",constraint = "success:成功<br>fail:失败",demo = "success")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
