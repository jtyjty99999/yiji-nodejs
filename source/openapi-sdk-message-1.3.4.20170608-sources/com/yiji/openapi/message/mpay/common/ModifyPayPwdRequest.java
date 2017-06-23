/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-30 15:10 创建
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
 * @since 2016-05-30
 */
@OpenApiMessage(service = "modifyPayPwd", type = ApiMessageType.Request)
public class ModifyPayPwdRequest extends ApiRequest {

    /**
     * 内部会员号
     */
    @NotBlank
    @Length(min = 20, max = 20)
    @OpenApiField(desc = "内部会员号" , demo = "20130310bj3114833131" , constraint = "")
    private String userId;
    /**
     * 老密码
     */

    @NotBlank
    @Length(max = 256)
    @OpenApiField(desc = "老密码" , demo = "123456" , constraint = "" , security = true)
    private String oldPassword;
    /**
     * 新密码
     */
    @NotBlank
    @Length(max = 256)
    @OpenApiField(desc = "新密码" , demo = "654321" , constraint = "" , security = true)
    private String newPassword;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
