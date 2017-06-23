package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-17 11:04.
 */
@OpenApiMessage(service = "ZBJExcessUserQuery", type = ApiMessageType.Request)
public class ZBJExcessUserQueryRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "用户ID",constraint = "用户登录易极付ID",demo = "12345697801465798")
    private String userId;

    @NotNull
    @OpenApiField(desc = "交易金额",demo = "88.66")
    private Money eventAccount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Money getEventAccount() {
        return eventAccount;
    }

    public void setEventAccount(Money eventAccount) {
        this.eventAccount = eventAccount;
    }
}
