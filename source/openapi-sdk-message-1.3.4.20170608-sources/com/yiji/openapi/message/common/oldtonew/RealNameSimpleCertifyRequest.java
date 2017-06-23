/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-19 15:02 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/19
 */
@Deprecated
@OpenApiMessage(service = "realNameSimpleCertify", type = ApiMessageType.Request)
public class RealNameSimpleCertifyRequest extends ApiRequest {

    @NotBlank
    @Length(min = 20,max = 20)
    @OpenApiField(desc = "用户ID",constraint = "用户ID",demo = "6222021234512345164")
    private String userId;

    @NotBlank
    @OpenApiField(desc = "真实姓名",constraint = "真实姓名",demo = "金正恩")
    private String realName;

    @NotBlank
    @OpenApiField(desc = "证件号码",constraint = "证件号码",demo = "500222198212123456")
    private String certNo;

    @NotNull
    @OpenApiField(desc = "证件有效期",constraint = "格式YYYYMMDD",demo = "20190819")
    private Integer certValidTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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

    public Integer getCertValidTime() {
        return certValidTime;
    }

    public void setCertValidTime(Integer certValidTime) {
        this.certValidTime = certValidTime;
    }
}
