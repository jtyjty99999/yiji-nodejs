package com.yiji.openapi.message.product.yxt;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by tt on 2015/10/9.
 */
@OpenApiMessage(service = "yxtDeductEncrypt", type = ApiMessageType.Request)
public class YxtDeductEncryptRequest extends ApiRequest {
    /**
     * 业务类型，通过此字段进行业务路由
     */
    @NotNull
    @OpenApiField(desc = "业务类型",demo = "GENERAL_WITHHOLD_SIGN")
    private String serviceType;

    /**
     * 请求数据JSON字符串，具体字段定义详见具体业务接口
     */
    @NotEmpty
    @OpenApiField(desc = "请求数据JSON字符串",constraint = "JSON字符串加密之后再传输",security = true,demo = "[\"yijifu\":\"yijifu\",\"yijifu\":\"yijifu\"]")
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
