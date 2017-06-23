package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-08 14:33.
 */
@OpenApiMessage(service = "mpayModifyLoginPwd", type = ApiMessageType.Response)
public class MpayModifyLoginPwdResponse extends ApiResponse {

    @OpenApiField(desc = "用户ID")
    private String userId;

    @OpenApiField(desc = "gid")
    private String gid;

    @OpenApiField(desc = "是否显示标题")
    private int title = 1;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

}
