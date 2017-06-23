/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-19 14:59 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/19
 */
@OpenApiMessage(service = "ccpEasySpeedLoanRepayment", type = ApiMessageType.Request)
public class CcpEasySpeedLoanRepaymentRequest extends ApiRequest {

    @OpenApiField(desc = "流水号",constraint = "流水号",demo = "12345678901234567890")
    private String bizNo;

    @NotBlank
    @OpenApiField(desc = "平台ID",constraint = "平台ID",demo = "1234567890")
    private String platformId;

    @NotBlank
    @OpenApiField(desc = "外部订单号",constraint = "外部订单号",demo = "12345678901234567890")
    private String outBizNo;

    @OpenApiField(desc = "受理时间",constraint = "格式：yyyy-MM-dd",demo = "2011-01-21")
    private String loanDate;

    @OpenApiField(desc = "归垫时间",constraint = "格式：yyyy-MM-dd",demo = "2011-01-21")
    private String backDate;

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getBackDate() {
        return backDate;
    }

    public void setBackDate(String backDate) {
        this.backDate = backDate;
    }
}
