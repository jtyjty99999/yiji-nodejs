/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-18 17:27 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/18
 */
@OpenApiMessage(service = "yzzBankCardBin", type = ApiMessageType.Request)
public class YzzBankCardBinRequest extends ApiRequest {

    @NotBlank
    @Length(max = 32)
    @OpenApiField(desc = "银行卡号",constraint = "银行卡号",demo = "6222021234512345164")
    private String bankCardNo;

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }
}
