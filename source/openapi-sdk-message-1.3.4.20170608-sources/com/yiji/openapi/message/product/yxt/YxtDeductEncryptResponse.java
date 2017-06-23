package com.yiji.openapi.message.product.yxt;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by tt on 2015/10/9.
 */
@OpenApiMessage(service = "yxtDeductEncrypt", type = ApiMessageType.Response)
public class YxtDeductEncryptResponse extends ApiResponse {

    /**
     * 返回结果内容JSON字符串，详见具体业务接口定义
     */
    @OpenApiField(desc = "结果数据JSON字符串",constraint = "JSON字符串需要解密",security = true,demo = "[\"yijifu\":\"yijifu\",\"yijifu\":\"yijifu\"]")
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
