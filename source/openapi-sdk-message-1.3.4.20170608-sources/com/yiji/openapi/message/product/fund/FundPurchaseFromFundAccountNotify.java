package com.yiji.openapi.message.product.fund;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by qianli on 2017/1/3.
 */
@OpenApiMessage(service = "fundPurchaseFromFundAccount", type = ApiMessageType.Notify)
public class FundPurchaseFromFundAccountNotify extends ApiNotify {
    /**
     * 结果状态
     */
    @NotNull
    @OpenApiField(desc = "结果状态",demo = "SUCCESS",constraint = "{\"data\":[\"SUCCESS:申购成功\",\"FAIL:申购失败\"],\"name\":\"申购结果\"}")
    private String status;

    /**
     * 申购金额
     */
    @NotNull
    @OpenApiField(desc = "申购金额",demo = "125.66")
    private Money amount;

    @OpenApiField(desc = "基金公司受理时间",demo = "1972-12-12 00:45:54")
    private Date receiveTime;

    @OpenApiField(desc = "当前基金申购后余额",demo = "188.66")
    private Money balance;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }
}
