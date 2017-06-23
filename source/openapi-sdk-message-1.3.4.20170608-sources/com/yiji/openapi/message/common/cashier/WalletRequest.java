package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

/**
 * Created by hgeshu@yiji.com on 2016/7/26.
 */
@OpenApiMessage(service = "wallet", type = ApiMessageType.Request)
public class WalletRequest extends ApiRequest {

    @NotBlank
    @Size(min = 20, max = 20)
    @OpenApiField(desc = "易极付用户ID", demo = "21345678901234567980")
    private String userId;

    @OpenApiField(desc = "终端类型", constraint = "默认取agent类型")
    private String termnalType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTermnalType() {
        return termnalType;
    }

    public void setTermnalType(String termnalType) {
        this.termnalType = termnalType;
    }
}
