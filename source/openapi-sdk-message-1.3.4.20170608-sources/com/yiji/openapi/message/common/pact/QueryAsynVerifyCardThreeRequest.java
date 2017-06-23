/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-22 17:46 创建
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
@OpenApiMessage(service = "queryAsynVerifyCardThree", type = ApiMessageType.Request)
public class QueryAsynVerifyCardThreeRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "校验流水号" , demo = "6151421051514" , constraint = "流水号")
    private String pactNo;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }
}
