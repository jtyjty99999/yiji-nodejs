/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-18 10:31 创建
 *
 */
package com.yiji.openapi.message.product.ewpay;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-18
 */
@OpenApiMessage(service = "qftDealerRegister", type = ApiMessageType.Response)
public class QftDealerRegisterResponseV2 extends ApiResponse {
    @OpenApiField(desc = "用户ID" ,demo = "dhb033298")
    private String partnerShopId;

    @OpenApiField(desc = "用户名称" ,demo = "测试商家")
    private String partnerShopName;

    @OpenApiField(desc = "客户端类型" ,demo = "PC")
    private String clientType;

    @OpenApiField(desc = "gid" ,demo = "20150122020000063895")
    private String gid;

    @OpenApiField(desc = "是否需要自动生成用户名",demo = "YES",constraint = "{\"data\":[\"需要:YES\",\"不需要:NO\",\"不传默认为NO\"],\"name\":\"是否需要自动生成用户名\"}")
    private String autoCreate;

    @OpenApiField(desc = "是否显示抬头",demo = "YES",constraint = "{\"data\":[\"显示:YES\",\"不显示:NO\",\"不传默认为YES\"],\"name\":\"只限移动端\"}")
    private String display;

    @OpenApiField(desc = "请求时间" ,demo = "20160232143022")
    private Date requestDate=new Date();

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getAutoCreate() {
        return autoCreate;
    }

    public void setAutoCreate(String autoCreate) {
        this.autoCreate = autoCreate;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
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

}

