package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-08 10:48.
 */
@OpenApiMessage(service = "mpayManageCard", type = ApiMessageType.Response)
public class MpayManageCardResponse extends ApiResponse {

    @OpenApiField(desc = "用户ID")
    private String userId;

    @OpenApiField(desc = "签约目的",constraint = "默认代扣(DEDUCT)")
    private String purpose;

    @OpenApiField(desc = "gid")
    private String gid;

    @OpenApiField(desc = "是否显示标题")
    private int title = 1;

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }
}
