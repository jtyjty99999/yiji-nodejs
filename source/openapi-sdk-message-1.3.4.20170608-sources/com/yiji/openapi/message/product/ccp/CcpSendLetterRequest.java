package com.yiji.openapi.message.product.ccp;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-23 16:09.
 */
@OpenApiMessage(service = "ccpSendLetter", type = ApiMessageType.Request)
public class CcpSendLetterRequest extends ApiRequest {

    @NotBlank(message = "函件信息不能为空")
    @OpenApiField(desc = "函件信息",demo = "信息内容")
    private String message;

    @NotNull(message = "发送时间")
    @OpenApiField(desc = "发送时间",demo = "2016-03-24 14:45:14")
    private Date sendTime;

    @NotBlank(message = "函件接收者不能为空")
    @OpenApiField(desc = "函件接收者",demo = "xxxxx")
    private String receiver;

    /** 调用系统平台id. */
    @NotBlank(message = "调用系统平台ID不能为空")
    @Size(min = 1, max = 64, message = "调用系统平台ID长度不能超过64位")
    @OpenApiField(desc = "平台id",demo = "23416531685")
    private String platformId;

    /** 外部流水. */
    @NotBlank(message = "外部流水不能为空")
    @Size(max = 128, message = "外部流水长度不能超过128位")
    @OpenApiField(desc = "外部订单号",demo = "1235465185653")
    private String outOrderNo;

    /** 融资订单CODE */
    @Size(max = 20, message = "融资订单编号长度不能超过20位")
    @OpenApiField(desc = "融资订单号",demo = "456132412")
    private String bizNo;

    /** 回调地址 */
    @Size(max = 512, message = "回调地址长度不能超过512位")
    @OpenApiField(desc = "回调地址",demo = "http://www.yiji.com")
    private String callBackUrl;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }
}
