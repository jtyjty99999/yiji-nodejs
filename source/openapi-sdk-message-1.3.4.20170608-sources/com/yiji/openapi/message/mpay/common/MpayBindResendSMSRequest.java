/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-20 14:54 创建
 *
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-20
 */
@OpenApiMessage(service = "mpayBindResendSMS", type = ApiMessageType.Request)
public class MpayBindResendSMSRequest extends ApiRequest {

    /**
     * 签约号
     */
    @NotBlank
    @Length(max = 20, min = 1)
    @OpenApiField(desc = "签约号" , demo = "F1Zb3XDG00251r" , constraint = "")
    private String pactNo;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }
}
