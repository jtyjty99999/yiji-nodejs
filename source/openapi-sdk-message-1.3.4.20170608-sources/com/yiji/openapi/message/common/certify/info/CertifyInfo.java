package com.yiji.openapi.message.common.certify.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

import java.util.Date;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/20 14:46.
 */
public class CertifyInfo {

    /**
     * 用户ID
     */
    @OpenApiField(desc = "易极付用户ID", demo = "20158948589635621548")
    private String userId;

    /**
     * 渠道编码 请参考
     */
    @OpenApiField(desc = "认证渠道编码", demo = "POLICE")
    private String channelCode;

    /**
     * 渠道名称
     */
    @OpenApiField(desc = "认证渠道名称", demo = "中国农业银行")
    private String channelName;

    /**
     * 状态：[IN：校验中；PASS：校验通过；FAIL：校验失败；INVALID：失效] 请参考
     */
    @OpenApiField(desc = "认证状态", demo = "PASS")
    private String status;

    /**
     * 描述
     */
    @OpenApiField(desc = "认证描述", demo = "认证通过")
    private String description;

    /**
     * 更新时间
     */
    @OpenApiField(desc = "认证更新时间", demo = "2017-12-14 14:12:52")
    private Date rowUpdateTime;
    /**
     * 银行简称
     */
    @OpenApiField(desc = "银行简称", demo = "ABC")
    private String bankCode;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRowUpdateTime() {
        return rowUpdateTime;
    }

    public void setRowUpdateTime(Date rowUpdateTime) {
        this.rowUpdateTime = rowUpdateTime;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
