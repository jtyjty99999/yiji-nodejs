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

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-18
 */
@OpenApiMessage(service = "qftDealerRegister", type = ApiMessageType.Notify)
public class QftDealerRegisterNotifyV2 extends ApiNotify{
    @OpenApiField(desc = "平台商的会员ID" ,demo = "500237199008287628")
    private String partnerShopId;

    @OpenApiField(desc = "平台商的会员名称" ,demo = "易极付科技有限公司")
    private String partnerShopName;

    @OpenApiField(desc = "易极付的会员ID" ,demo = "123456789013245678")
    private String userId;

    @OpenApiField(desc = "易极付的会员名称" ,demo = "摇钱树科技有限公司")
    private String userName;

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

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

