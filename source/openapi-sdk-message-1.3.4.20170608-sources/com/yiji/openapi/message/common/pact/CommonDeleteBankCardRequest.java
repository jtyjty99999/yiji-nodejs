/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-22 10:52 创建
 *
 */
package com.yiji.openapi.message.common.pact;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-22
 */
@OpenApiMessage(service = "commonDeleteBankCard", type = ApiMessageType.Request)
public class CommonDeleteBankCardRequest extends ApiRequest {
    /** 协议号 */
    @NotBlank
    @OpenApiField(desc = "协议号",demo = "1232432423456")
    private String protocolNo;
    /** 子协议号 */
    @NotBlank
    @OpenApiField(desc = "子协议号",demo = "1213245353457")
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
