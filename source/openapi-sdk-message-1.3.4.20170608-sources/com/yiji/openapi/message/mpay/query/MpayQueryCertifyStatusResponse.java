package com.yiji.openapi.message.mpay.query;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-14 13:55.
 */
@OpenApiMessage(service = "mpayQueryCertifyStatus", type = ApiMessageType.Response)
public class MpayQueryCertifyStatusResponse extends ApiResponse {

    /** 用户编号 */
    @OpenApiField(desc = "用户ID",demo = "用户登录易极付ID")
    private String userId;

    /** 真实姓名 */
    @OpenApiField(desc = "真实姓名",demo = "易极付")
    private String realName;

    /** 实名状态 */
    @OpenApiField(desc = "实名状态",constraint = "U：未认证<br>A：已认证<br>I：认证中<br>R：被驳回<br>O：过期",demo = "R")
    private String certifyStatus;

    /** 实名等级 */
    @OpenApiField(desc = "实名等级",constraint = "0：未实名<br>1：弱实名<br>2：银行卡实名<br>3：强实名<br>5：增强实名",demo = "3")
    private String certifyRank;

    @OpenApiField(desc = "处理时间",constraint = "审批通过或驳回的时间(毫秒)",demo = "1450145500884")
    private String timestamp;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCertifyStatus() {
        return certifyStatus;
    }

    public void setCertifyStatus(String certifyStatus) {
        this.certifyStatus = certifyStatus;
    }

    public String getCertifyRank() {
        return certifyRank;
    }

    public void setCertifyRank(String certifyRank) {
        this.certifyRank = certifyRank;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
