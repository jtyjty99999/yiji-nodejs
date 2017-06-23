package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/24 15:47.
 */
@OpenApiMessage(service = "mpayCreditCardWithdraw", type = ApiMessageType.Request)
public class MpayCreditCardWithdrawRequest extends ApiRequest {

    @NotBlank
    @Size(max = 20,min = 20)
    @OpenApiField(desc = "易极付用户ID",demo = "20159685485874589635")
    private String userId;

    @NotNull
    @OpenApiField(desc = "充值金额",demo = "88.66")
    private Money tradeAmount;

    @OpenApiField(desc = "分润金额",demo = "8.66")
    private Money shareAmount;

    @NotBlank
    @OpenApiField(desc = "借记卡签约编号",demo = "465316544132")
    private String debitPactNo;

    @NotBlank
    @OpenApiField(desc = "信用卡签约编号",demo = "46210325415631")
    private String creditPactNo;

    @OpenApiField(desc = "延迟处理时间",demo = "24",constraint = "单位：小时,默认24（延迟1天）")
    private int delayHours = 24;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public Money getShareAmount() {
        return shareAmount;
    }

    public void setShareAmount(Money shareAmount) {
        this.shareAmount = shareAmount;
    }

    public String getDebitPactNo() {
        return debitPactNo;
    }

    public void setDebitPactNo(String debitPactNo) {
        this.debitPactNo = debitPactNo;
    }

    public String getCreditPactNo() {
        return creditPactNo;
    }

    public void setCreditPactNo(String creditPactNo) {
        this.creditPactNo = creditPactNo;
    }

    public int getDelayHours() {
        return delayHours;
    }

    public void setDelayHours(int delayHours) {
        this.delayHours = delayHours;
    }
}
