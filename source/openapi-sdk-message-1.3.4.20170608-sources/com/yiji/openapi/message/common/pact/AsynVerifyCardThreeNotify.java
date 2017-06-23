/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-22 17:07 创建
 *
 */
package com.yiji.openapi.message.common.pact;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-22
 */
@OpenApiMessage(service = "asynVerifyCardThree", type = ApiMessageType.Notify)
public class AsynVerifyCardThreeNotify extends ApiNotify {
    @NotBlank
    @OpenApiField(desc = "通用签约流水号", demo = "6151421051514", constraint = "流水号")
    private String pactNo;

    @NotBlank
    @OpenApiField(desc = "校验状态", demo = "VERIFY_SUCCESS")
    private String verifyStatus;

    @OpenApiField(desc = "错误码code", demo = "cn00012452")
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

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
