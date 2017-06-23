/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-20 15:13 创建
 *
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-20
 */
@OpenApiMessage(service = "mpayBindCardAndSetPwd", type = ApiMessageType.Response)
public class MpayBindCardAndSetPwdResponse extends ApiResponse {
    /**
     * 内部会员号
     */
    @NotBlank
    @OpenApiField(desc = "内部会员号" , demo = "20150923010008041887" , constraint = "")
    private String userId;
    /**
     * 签约号
     */
    @NotBlank
    @OpenApiField(desc = "签约号" , demo = "F1Zb3XDG00251r" , constraint = "")
    private String pactNo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }
}
