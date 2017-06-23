/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-23 15:38 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-23
 */
@OpenApiMessage(service = "mpayVerifyPayPwd", type = ApiMessageType.Request)
public class MpayVerifyPayPwdRequest extends ApiRequest {

    /**
     * 会员号
     */
    @NotNull
    @Length(max = 64, min = 1)
    @OpenApiField(desc = "会员号" , demo = "20150729020006847500" , constraint = "")
    private String userId;
    /**
     * 会员类型
     */
    @NotBlank
    @OpenApiField(desc = "会员类型" , demo = "INNER" , constraint = "")
    private String userType;
    /**
     * 支付密码
     */
    @NotNull
    @Length(max = 256)
    @OpenApiField(desc = "支付密码" , demo = "568923" , constraint = "" , security = true)
    private String payPassword;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }
}
