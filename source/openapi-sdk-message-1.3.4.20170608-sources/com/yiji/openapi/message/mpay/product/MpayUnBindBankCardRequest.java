/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-23 16:44 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-23
 */
@OpenApiMessage(service = "mpayUnBindBankCard", type = ApiMessageType.Request)
public class MpayUnBindBankCardRequest extends ApiRequest {

    /**
     * 内部会员号
     */
    @NotNull
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "内部会员号" , demo = "20160331010010694658" , constraint = "")
    private String userId;
    /**
     * 签约号
     */
    @NotNull
    @Length(max = 20, min = 1)
    @OpenApiField(desc = "签约号" , demo = "F8PEFXsM00284b" , constraint = "")
    private String pactNo;
    /**
     * 支付密码
     */
    @NotNull
    @Length(max = 256)
    @OpenApiField(desc = "支付密码" , demo = "457812" , constraint = "" , security = true)
    private String payPassword;

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

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }
}
