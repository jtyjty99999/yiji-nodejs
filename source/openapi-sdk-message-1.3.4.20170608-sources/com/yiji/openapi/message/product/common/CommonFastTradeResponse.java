package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-11 11:08.
 */
@OpenApiMessage(service = "commonFastTrade", type = ApiMessageType.Response)
public class CommonFastTradeResponse extends ApiResponse {

    /**
     * 业务流水号
     */
    @OpenApiField(desc = "业务流水号",demo = "1265123.4156")
    private String bizNo;

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }
}
