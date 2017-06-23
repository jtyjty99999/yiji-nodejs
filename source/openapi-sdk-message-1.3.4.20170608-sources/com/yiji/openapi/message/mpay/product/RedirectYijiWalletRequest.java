package com.yiji.openapi.message.mpay.product;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-15 14:30.
 */
@OpenApiMessage(service = "redirectYijiWallet", type = ApiMessageType.Request)
public class RedirectYijiWalletRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "易极付用户ID",demo = "1234567980134657980")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
