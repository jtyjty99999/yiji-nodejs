/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-22 14:26 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/22
 */
@OpenApiMessage(service = "sms", type = ApiMessageType.Request)
public class SmsRequest extends ApiRequest{

    @NotBlank
    @OpenApiField(desc="短信接收号码列表",constraint = "用 | 分隔号码",demo = "13812345678|15587654321")
    private String phoneNos;

    @NotBlank
    @OpenApiField(desc="短信内容",constraint = "短信内容",demo = "订单发货通知：XXXXX")
    private String smsContext;

    @OpenApiField(desc="短信后缀",constraint = "传入值必须为商户信息配置其中的一个",demo = "猪八戒")
    private String suffix;

    public String getPhoneNos() {
        return phoneNos;
    }

    public void setPhoneNos(String phoneNos) {
        this.phoneNos = phoneNos;
    }

    public String getSmsContext() {
        return smsContext;
    }

    public void setSmsContext(String smsContext) {
        this.smsContext = smsContext;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
