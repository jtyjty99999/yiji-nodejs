package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-29 9:57.
 */
@OpenApiMessage(service = "freeDeposit", type = ApiMessageType.Notify)
public class FreeDepositNotify extends ApiNotify {

    @OpenApiField(desc = "易极付充值流水号",demo = "21354687901234567890")
    private String tradeNo;

    @OpenApiField(desc = "充值金额",demo = "88.66")
    private Money amount;

    @OpenApiField(desc = "到账金额",demo = "88.66")
    private Money amountIn;

    @OpenApiField(desc = "充值结果",demo = "success",constraint = "success:充值成功<br>processing:充值处理中<br>false:充值失败")
    private String status;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public Money getAmountIn() {
        return amountIn;
    }

    public void setAmountIn(Money amountIn) {
        this.amountIn = amountIn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
