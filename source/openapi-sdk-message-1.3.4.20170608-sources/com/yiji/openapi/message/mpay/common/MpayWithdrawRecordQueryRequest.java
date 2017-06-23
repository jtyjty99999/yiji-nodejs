package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by mliao on 2015/8/4.
 */
@OpenApiMessage(service = "mpayWithdrawRecordQuery", type = ApiMessageType.Request)
public class MpayWithdrawRecordQueryRequest extends ApiRequest {

	@NotBlank
    @OpenApiField(desc = "用户id",constraint="用户id",demo="20151016000451549430")
    private String userId;

    public String getUserId() {

        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
