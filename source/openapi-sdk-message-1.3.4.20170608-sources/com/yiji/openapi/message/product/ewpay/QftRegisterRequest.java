/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-07 11:23 创建
 *
 */
package com.yiji.openapi.message.product.ewpay;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-07
 */
@OpenApiMessage(service = "qftRegister", type = ApiMessageType.Request)
public class QftRegisterRequest extends ApiRequest {

    /** 外部会员ID */
    @NotBlank
    @OpenApiField(desc = "外部会员ID" , demo = "201523000514252454" , constraint = "")
    private String partnerShopId;

    /** 外部会员名 */
    @OpenApiField(desc = "外部会员名" , demo = "熊本熊" , constraint = "")
    private String partnerShopName;

    /** 手机号 */
    @NotBlank
    @OpenApiField(desc = "手机号" , demo = "13502584561" , constraint = "")
    @Length(min = 11, max = 11, message = "手机号长度为11位")
    private String mobile;

    /** 用户类型 PERSON:个人，BUSINESS:企业 */
    @NotBlank
    @OpenApiField(desc = "用户类型" , demo = "BUSINESS" , constraint = "用户类型 PERSON:个人，BUSINESS:企业")
    private String userType;

    /** 请求客户客户端类型 PC：pc端 MOBILE：移动端 默认为PC端 */
    @OpenApiField(desc = "请求客户客户端类型" , demo = "PC" , constraint = "pc端 MOBILE：移动端 默认为PC端")
    private String clientType = "PC";

    public String getPartnerShopId() {
        return partnerShopId;
    }

    public void setPartnerShopId(String partnerShopId) {
        this.partnerShopId = partnerShopId;
    }

    public String getPartnerShopName() {
        return partnerShopName;
    }

    public void setPartnerShopName(String partnerShopName) {
        this.partnerShopName = partnerShopName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
}
