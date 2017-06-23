/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-18 10:10 创建
 *
 */
package com.yiji.openapi.message.product.ewpay;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-18
 */
@OpenApiMessage(service = "qftSupplierApply", type = ApiMessageType.Response)
public class QftSupplierApplyResponseV2 extends ApiResponse {
    @NotBlank
    @OpenApiField(desc = "平台商会员ID", constraint = "平台商会员ID", demo = "20150619010000072320")
    private String partnerShopId;

    @NotBlank
    @OpenApiField(desc = "平台商会员名称", constraint = "平台商会员名称", demo = "企富通")
    private String partnerShopName;

    @OpenApiField(desc = "是否需要自动生成用户名", constraint = "{\"data\":[\"YES:需要\",\"NO:不需要\"],\"name\":\"是否需要自动生成用户名\"}", demo = "YES")
    private String autoCreate;

    @OpenApiField(desc = "是否显示抬头", constraint = "{\"data\":[\"YES:显示\",\"NO:不显示\"],\"name\":\"是否显示抬头\"}", demo = "YES")
    private String display;

    @OpenApiField(desc = "客户端类型", constraint = "{\"data\":[\"MOBILE:手机\",\"PC:PC电脑\",\"SDK:SDK\"],\"name\":\"客户端类型\"}",
            demo = "PC")
    private String clientType;

    @OpenApiField(desc = "gid", demo = "20150122020000063895")
    private String gid;

    @OpenApiField(desc = "请求时间" ,demo = "20160232143022")
    private Date requestDate=new Date();

    @OpenApiField(desc = "用户类型",demo = "")
    private String userType;

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getPartnerShopId() {
        return this.partnerShopId;
    }

    public void setPartnerShopId(String partnerShopId) {
        this.partnerShopId = partnerShopId;
    }

    public String getPartnerShopName() {
        return this.partnerShopName;
    }

    public void setPartnerShopName(String partnerShopName) {
        this.partnerShopName = partnerShopName;
    }


    public String getDisplay() {
        return this.display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getClientType() {
        return this.clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getGid() {
        return this.gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getAutoCreate() {
        return autoCreate;
    }

    public void setAutoCreate(String autoCreate) {
        this.autoCreate = autoCreate;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}

