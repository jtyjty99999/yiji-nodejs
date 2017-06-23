/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-04 10:16 创建
 *
 */
package com.yiji.openapi.message.common.bankcard;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-04
 */
@OpenApiMessage(service = "fourVerifyBankCard", type = ApiMessageType.Notify)
public class FourVerifyBankCardNotify extends ApiNotify {

    @OpenApiField(desc = "签约流水号", demo = "205120210250205102" , constraint = "")
    private String pactNo;

    @OpenApiField(desc = "校验状态", demo = "VERIFY_SUCCESS" , constraint = "")
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
