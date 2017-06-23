package com.yiji.openapi.message.product.ccp;

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
 * @since 2016-03-25 11:25.
 */
@OpenApiMessage(service = "ccpRefundNotify", type = ApiMessageType.Request)
public class CcpRefundNotifyRequest extends ApiRequest {

    @OpenApiField(desc = "归还金额",demo = "88.66")
    private Money amount;

    @OpenApiField(desc = "交易流水号",demo = "45321684146544132")
    private String transferNo;

    @NotNull(message = "赎楼成功标识")
    @OpenApiField(desc = "赎楼成功标识",demo = "true")
    private Boolean redeemSuccess;

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

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getTransferNo() {
        return transferNo;
    }

    public void setTransferNo(String transferNo) {
        this.transferNo = transferNo;
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

    public Boolean getRedeemSuccess() {
        return redeemSuccess;
    }

    public void setRedeemSuccess(Boolean redeemSuccess) {
        this.redeemSuccess = redeemSuccess;
    }
}
