package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-11 11:03.
 */
@OpenApiMessage(service = "commonBindCard", type = ApiMessageType.Response)
public class CommonBindCardResponse extends ApiResponse {

    /** 协议号 */
    @OpenApiField(desc = "协议号",demo = "5456454658")
    private String protocolNo;
    /** 子协议号 */
    @OpenApiField(desc = "子协议号",demo = "1256346534861232")
    private String protocolChildNo;

    public String getProtocolNo() {
        return protocolNo;
    }

    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
    }

    public String getProtocolChildNo() {
        return protocolChildNo;
    }

    public void setProtocolChildNo(String protocolChildNo) {
        this.protocolChildNo = protocolChildNo;
    }
}
