package com.yiji.openapi.message.mpay.sdk;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by hgeshu@yiji.com on 2016/7/14.
 */
@OpenApiMessage(service = "mpayQueryVerifyChannelInfo", type = ApiMessageType.Request)
public class MpayQueryVerifyChannelInfoRequest extends ApiRequest {

    /**
     * 内部会员号
     */
    @NotBlank
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "易极付用户ID")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
