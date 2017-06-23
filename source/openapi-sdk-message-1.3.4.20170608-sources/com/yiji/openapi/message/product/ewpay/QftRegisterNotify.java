/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-07 15:10 创建
 *
 */
package com.yiji.openapi.message.product.ewpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-07
 */
@OpenApiMessage(service = "qftRegister", type = ApiMessageType.Notify)
public class QftRegisterNotify extends ApiNotify {
    /** 外部会员ID */
    @OpenApiField(desc = "外部会员ID" , demo = "20152300001510258415" , constraint = "")
    private String partnerShopId;
    /** 外部会员名 */
    @OpenApiField(desc = "外部会员名" , demo = "熊本熊" , constraint = "")
    private String partnerShopName;
    /** 用户名 */
    @OpenApiField(desc = "用户名" , demo = "熊本熊" , constraint = "")
    private String userName;
    /** 用户ID */
    @OpenApiField(desc = "用户ID" , demo = "20152300001510258415" , constraint = "")
    private String userId;
    /** 用户类型 PERSON:个人，BUSINESS:企业 */
    @OpenApiField(desc = "用户类型" , demo = "PERSON" , constraint = "")
    private String userType;
    /** 请求客户客户端类型 PC：pc端 MOBILE：移动端 */
    @OpenApiField(desc = "请求客户客户端类型" , demo = "PC" , constraint = "PC：pc端 MOBILE：移动端")
    private String clientType;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

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

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
}
