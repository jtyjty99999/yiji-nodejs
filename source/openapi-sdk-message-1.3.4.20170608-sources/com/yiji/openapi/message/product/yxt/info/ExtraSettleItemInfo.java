/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-04 16:10 创建
 *
 */
package com.yiji.openapi.message.product.yxt.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-04
 */
public class ExtraSettleItemInfo {

    @NotBlank
    @OpenApiField(desc = "结算外部流水号" , demo = "bff024f3-7c20-488b-a8")
    private String externalOrderNo;

    @NotBlank
    @OpenApiField(desc = "结算UserId" , demo = "20140917010001721742")
    private String userId;

    @NotNull
    @OpenApiField(desc = "结算金额" , demo = "66.66")
    private Money amount;

    @NotBlank
    @OpenApiField(desc = "结算备注" , demo = "结算成功")
    private String settleMemo;

    public String getExternalOrderNo() {
        return externalOrderNo;
    }

    public void setExternalOrderNo(String externalOrderNo) {
        this.externalOrderNo = externalOrderNo;
    }

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

    public String getSettleMemo() {
        return settleMemo;
    }

    public void setSettleMemo(String settleMemo) {
        this.settleMemo = settleMemo;
    }
}
