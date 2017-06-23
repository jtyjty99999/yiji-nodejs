package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/3/1 11:44.
 */
@OpenApiMessage(service = "commonTerminatePact", type = ApiMessageType.Request)
public class CommonTerminatePactRequest extends ApiRequest {

    @NotBlank(message = "签约编号不能为空")
    @OpenApiField(desc = "签约编号",demo = "52196812654")
    private String pactNo;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }
}
