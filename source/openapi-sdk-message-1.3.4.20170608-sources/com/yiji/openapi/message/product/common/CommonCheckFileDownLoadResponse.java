/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-06 10:43 创建
 *
 */
package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-06
 */
@OpenApiMessage(service = "commonCheckFileDownLoad", type = ApiMessageType.Response)
public class CommonCheckFileDownLoadResponse extends ApiResponse {

    @OpenApiField(desc = "gid" , demo = "2015215251262545841" , constraint = "")
    private String gid;

    @OpenApiField(desc = "商户卡号" , demo = "2015620100045158" , constraint = "")
    private String merchantCardNo;

    @OpenApiField(desc = "商户用户号" , demo = "2015620100045158" , constraint = "")
    private String merchantUserId;

    @OpenApiField(desc = "商户资金账号" , demo = "2015620100045158" , constraint = "")
    private String merchantAccountNo;

    @OpenApiField(desc = "入口" , demo = "01" , constraint = "")
    private String inlet;

    @OpenApiField(desc = "会员id" , demo = "201606210000584145812" , constraint = "")
    private String userId;

    @OpenApiField(desc = "账期" , demo = "20150623" , constraint = "yyyyMMdd")
    private String accountDay;

    @OpenApiField(desc = "请求对象" , demo = "" , constraint = "COMMON_OUT_DOWNLOAD_RECONCILIATION")
    private String requestTarget;

    @OpenApiField(desc = "请求时间" , demo = "20150623" , constraint = "yyyyMMdd")
    private String requestDate;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getAccountDay() {
        return accountDay;
    }

    public void setAccountDay(String accountDay) {
        this.accountDay = accountDay;
    }

    public String getRequestTarget() {
        return requestTarget;
    }

    public void setRequestTarget(String requestTarget) {
        this.requestTarget = requestTarget;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo;
    }

    public String getMerchantUserId() {
        return merchantUserId;
    }

    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
    }

    public String getMerchantAccountNo() {
        return merchantAccountNo;
    }

    public void setMerchantAccountNo(String merchantAccountNo) {
        this.merchantAccountNo = merchantAccountNo;
    }

    public String getInlet() {
        return inlet;
    }

    public void setInlet(String inlet) {
        this.inlet = inlet;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
