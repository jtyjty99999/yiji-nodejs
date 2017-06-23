/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-22 15:00 创建
 *
 */
package com.yiji.openapi.message.common.pact;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-22
 */
@OpenApiMessage(service = "asynVerifyCardThree", type = ApiMessageType.Response)
public class AsynVerifyCardThreeResponse extends ApiResponse {

    @NotBlank
    @OpenApiField(desc = "校验流水号" , demo = "6151421051514" , constraint = "流水号")
    private String pactNo;

    @OpenApiField(desc = "校验状态" , demo = "VERIFY_SUCCESS")
    private String verifyStatus;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
    }
}
