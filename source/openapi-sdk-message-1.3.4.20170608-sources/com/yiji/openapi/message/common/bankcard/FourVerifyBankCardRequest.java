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

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-04
 */
@OpenApiMessage(service = "fourVerifyBankCard", type = ApiMessageType.Request)
public class FourVerifyBankCardRequest extends ApiRequest {

    @NotBlank
    @Length(max = 32)
    @OpenApiField(desc = "用户真实姓名", demo = "熊本熊" , constraint = "")
    private String realName;

    @NotBlank
    @Length(max = 64)
    @OpenApiField(desc = "证件号", demo = "52210119900241215" , constraint = "对应证件类型的证件号")
    private String certNo;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }
}
