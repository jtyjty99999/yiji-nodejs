package com.yiji.openapi.message.common.register;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/3/30.
 */
@Deprecated
@OpenApiMessage(service = "ppmRedirectRegister", type = ApiMessageType.Response)
public class PpmRedirectRegisterResponse extends ApiResponse {

    @OpenApiField(desc = "gid")
    private String gid;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }
}
