package com.yiji.openapi.message.mpay.product;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-15 14:30.
 */
@OpenApiMessage(service = "redirectYijiWallet", type = ApiMessageType.Response)
public class RedirectYijiWalletResponse extends ApiResponse {

    @OpenApiField(desc = "易极付用户ID",demo = "1234567980134657980")
    private String userId;

    @OpenApiField(desc = "gid")
    private String gid;

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

