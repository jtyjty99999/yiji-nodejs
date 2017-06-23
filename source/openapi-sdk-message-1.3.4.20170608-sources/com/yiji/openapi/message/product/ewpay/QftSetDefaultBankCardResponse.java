/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-07 10:37 创建
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
 * @since 2016-06-07
 */
@OpenApiMessage(service = "qftSetDefaultBankCard", type = ApiMessageType.Response)
public class QftSetDefaultBankCardResponse extends ApiResponse {

    @OpenApiField(desc = "外部会员ID" , demo = "2015091219191650972" , constraint = "")
    private String partnerShopId;

    @OpenApiField(desc = "易极付ID" , demo = "2015091219191650972" , constraint = "")
    private String userId;

    @OpenApiField(desc = "gid" , demo = "20150625120004515415" , constraint = "")
    private String gid;

    @OpenApiField(desc = "请求时间" ,demo = "20160232143022")
    private Date requestDate=new Date();

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getPartnerShopId() {
        return partnerShopId;
    }

    public void setPartnerShopId(String partnerShopId) {
        this.partnerShopId = partnerShopId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }
}
