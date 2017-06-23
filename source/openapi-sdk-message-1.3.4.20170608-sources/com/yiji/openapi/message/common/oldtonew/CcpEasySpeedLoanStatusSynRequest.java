package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by tyongfu@yiji.com on 2016/1/26.
 */
@OpenApiMessage(service = "ccpEasySpeedLoanStatusSyn", type = ApiMessageType.Request)
public class CcpEasySpeedLoanStatusSynRequest extends ApiRequest {

    @OpenApiField(desc = "调用系统平台id",demo = "",constraint = "调用系统平台id")
    private String platformId;

    @OpenApiField(desc = "外部订单号",demo = "213716801",constraint = "外部订单号")
    private String outBizNo;

    @OpenApiField(desc = "融资订单id",demo = "20160221000000152671",constraint = "融资订单id")
    private String bizNo;

    @OpenApiField(desc = "外部系统（易房保）状态中文名称 ",demo = "",constraint = "外部系统（易房保）状态中文名称 ")
    private String outStatusName;

    @OpenApiField(desc = "外部系统（易房保）状态CODE",demo = "",constraint = "外部系统（易房保）状态CODE")
    private String outStatus;

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

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getOutStatusName() {
        return outStatusName;
    }

    public void setOutStatusName(String outStatusName) {
        this.outStatusName = outStatusName;
    }

    public String getOutStatus() {
        return outStatus;
    }

    public void setOutStatus(String outStatus) {
        this.outStatus = outStatus;
    }
}
