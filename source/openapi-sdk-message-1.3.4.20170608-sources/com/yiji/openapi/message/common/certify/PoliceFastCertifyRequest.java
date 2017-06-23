/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-27 15:46 创建
 *
 */
package com.yiji.openapi.message.common.certify;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-27
 */
@OpenApiMessage(service = "policeFastCertify", type = ApiMessageType.Request)
public class PoliceFastCertifyRequest extends ApiRequest {

    /**
     * 用户id
     */
    @NotBlank
    @OpenApiField(desc = "用户id" , demo = "20130310bj3700000037" , constraint = "")
    private String userId;

    /**
     * 用户真实姓名
     */
    @NotBlank
    @OpenApiField(desc = "用户真实姓名" , demo = "熊本熊" , constraint = "")
    private String realName;

    /**
     * 证件号
     */
    @NotBlank
    @OpenApiField(desc = "证件号" , demo = "522101199502241218" , constraint = "")
    private String certNo;

    @OpenApiField(desc = "证件类型" , demo = "ID" , constraint = "")
    private String certType = "ID";

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

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }
}
