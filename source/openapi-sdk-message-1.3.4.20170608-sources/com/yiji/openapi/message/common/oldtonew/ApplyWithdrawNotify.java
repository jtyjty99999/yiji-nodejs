package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-11 17:30.
 */
@OpenApiMessage(service = "applyWithdraw", type = ApiMessageType.Notify)
public class ApplyWithdrawNotify extends ApiNotify {

    @OpenApiField(desc = "账期",demo = "20160311")
    private String accountDay;

    @OpenApiField(desc = "金额",demo = "88.66")
    private String amount;

    @OpenApiField(desc = "身份标志",demo = "ESTATE_CQ")
    private String bizIdentity;

    @OpenApiField(desc = "外部订单号",demo = "16511324685")
    private String outBizNo;

    @OpenApiField(desc = "支付流水号",demo = "1256132456")
    private String payNo;

    @OpenApiField(desc = "支付类型",demo = "WITHDRAW")
    private String payType;

    public String getAccountDay() {
        return accountDay;
    }

    public void setAccountDay(String accountDay) {
        this.accountDay = accountDay;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBizIdentity() {
        return bizIdentity;
    }

    public void setBizIdentity(String bizIdentity) {
        this.bizIdentity = bizIdentity;
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }
}
