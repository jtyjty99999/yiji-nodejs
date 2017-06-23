package com.yiji.openapi.message.product.ccp;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-24 15:35.
 */
@OpenApiMessage(service = "ccpComplain", type = ApiMessageType.Request)
public class CcpComplainRequest extends ApiRequest {

    @NotNull(message = "声明不能为空")
    @OpenApiField(desc = "声明内容",demo = "金额不足以赎楼，申请将额度调整至50W")
    private String statement;

    @NotNull(message = "期望贷款金额不能为空")
    @OpenApiField(desc = "期望贷款金额",demo = "50000")
    private Money complainAmount;

    @NotNull(message = "发送时间")
    @OpenApiField(desc = "发送时间",demo = "2016-04-09 12:45:14",constraint = "格式:yyyy-MM-dd HH:mm:ss")
    private Date sendTime;

    /**
     * 是否同意拟放款金额
     */
    @OpenApiField(desc = "是否同意拟放款金额",demo = "false",constraint = "默认false")
    private Boolean agreeProposedAmount = false;

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

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Money getComplainAmount() {
        return complainAmount;
    }

    public void setComplainAmount(Money complainAmount) {
        this.complainAmount = complainAmount;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Boolean getAgreeProposedAmount() {
        return agreeProposedAmount;
    }

    public void setAgreeProposedAmount(Boolean agreeProposedAmount) {
        this.agreeProposedAmount = agreeProposedAmount;
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
