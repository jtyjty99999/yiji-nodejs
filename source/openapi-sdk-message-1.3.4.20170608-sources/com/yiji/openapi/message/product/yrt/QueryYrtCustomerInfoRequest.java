/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-16 18:02 创建
 *
 */
package com.yiji.openapi.message.product.yrt;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-16
 */
@OpenApiMessage(service = "queryYrtCustomerInfo", type = ApiMessageType.Request)
public class QueryYrtCustomerInfoRequest extends ApiRequest {

    /** 易极付用户id号 <code>userId</code> */
    @OpenApiField(desc = "易极付用户id号" , demo = "20150619020005982079" , constraint = "易极付用户Id号")
    private String userId;

    /** 易极付用户名 <code>userName</code> */
    @OpenApiField(desc = "易极付用户名" , demo = "重庆万达通讯" , constraint = "")
    private String userName;

    /** 外部商户号 <code>outMerchantNo</code> */
    @NotBlank(message = "外部商户号不能为空")
    @OpenApiField(desc = "外部商户号不能为空" , demo = "250187415693112" , constraint = "")
    private String outMerchantNo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getOutMerchantNo() {
        return outMerchantNo;
    }

    public void setOutMerchantNo(String outMerchantNo) {
        this.outMerchantNo = outMerchantNo;
    }
}
