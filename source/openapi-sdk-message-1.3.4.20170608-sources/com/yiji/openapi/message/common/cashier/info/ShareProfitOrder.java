/*
 * 修订记录:
 * zhike@yiji.com 2016-11-08 14:22 创建
 *
 */
package com.yiji.openapi.message.common.cashier.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 修订记录：
 *
 * @author zhike@yiji.com
 */
public class ShareProfitOrder {

    /**
     * 收款人userID
     */
    @NotBlank
    @OpenApiField(desc = "收款人userID",demo = "2342354563232123")
    private String payeeUserId;

    /**
     * 分润金额
     */
    @OpenApiField(desc = "分润金额",demo = "6.66")
    private Money shareAmount;

    /**
     * 备注
     */
    @Length(max = 128)
    @OpenApiField(desc = "备注")
    private String memo;

    public String getPayeeUserId() {
        return payeeUserId;
    }

    public void setPayeeUserId(String payeeUserId) {
        this.payeeUserId = payeeUserId;
    }

    public Money getShareAmount() {
        return shareAmount;
    }

    public void setShareAmount(Money shareAmount) {
        this.shareAmount = shareAmount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
