package com.yiji.openapi.message.common.certify;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/20 14:37.
 */
@OpenApiMessage(service = "queryUserCertifyChannelStatus", type = ApiMessageType.Request)
public class QueryUserCertifyChannelStatusRequest extends ApiRequest {


    /**
     * 用户id
     */
    @NotBlank
    @OpenApiField(desc = "易极付用户ID", demo = "201754859635854125485")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
