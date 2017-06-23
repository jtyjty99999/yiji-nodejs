package com.yiji.openapi.message.product.ewpay.info;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-28 10:12.
 */
public class EwpaySettlementItems {


    /**
     * 结算易极付账户ID
     */
    @NotNull
    @Size(min = 20, max = 20)
    @OpenApiField(desc = "易极付ID",demo = "12346578901234567890")
    private String userId;

    /**
     * 结算金额
     */
    @NotNull
    @OpenApiField(desc = "结算金额",demo = "88.66")
    private Money amount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }
}
