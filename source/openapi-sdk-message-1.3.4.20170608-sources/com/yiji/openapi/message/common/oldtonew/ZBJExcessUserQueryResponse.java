package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-17 11:05.
 */
@OpenApiMessage(service = "ZBJExcessUserQuery", type = ApiMessageType.Response)
public class ZBJExcessUserQueryResponse extends ApiResponse {

    @OpenApiField(desc = "是否超额",constraint = "true:超额<br>false:未超额",demo = "true")
    private String hasExcess;

    @OpenApiField(desc = "原因",constraint = "超额原因",demo = "金额超限")
    private String reason;

    public String getHasExcess() {
        return hasExcess;
    }

    public void setHasExcess(String hasExcess) {
        this.hasExcess = hasExcess;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
