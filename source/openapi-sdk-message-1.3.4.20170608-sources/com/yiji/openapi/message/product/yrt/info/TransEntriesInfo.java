/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-17 16:53 创建
 *
 */
package com.yiji.openapi.message.product.yrt.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-17
 */
public class TransEntriesInfo {

    /** 转出账号 <code>payer</code> */
    @NotBlank(message = "转出账号不能为空")
    @OpenApiField(desc = "转出账号" , demo = "20140730020001144381" , constraint = "")
    private String payerUserId;

    /** 转入账号 <code>payee</code> */
    @NotBlank(message = "转入账号不能为空")
    @OpenApiField(desc = "转入账号" , demo = "20140730020001144381" , constraint = "")
    private String payeeUserId;

    /** 交易金额 <code>transAmount</code> */
    @NotNull(message = "交易金额不能为空")
    @OpenApiField(desc = "交易金额" , demo = "800" , constraint = "")
    private Money transAmount;

    /** 备注 <code>memo</code> */
    @Length(max = 64)
    @OpenApiField(desc = "备注" , demo = "可以放款" , constraint = "")
    private String memo;

    /** 冻结金额 */
    @OpenApiField(desc = "冻结金额" , demo = "3000" , constraint = "")
    private Money freezeAmount;

    /** 解冻金额 */
    @OpenApiField(desc = "解冻金额" , demo = "18" , constraint = "")
    private Money unfreezeAmount;

    /**业务流水号*/
    @NotNull(message = "业务流水号不能为空")
    @OpenApiField(desc = "业务流水号" , demo = "ydh02016051710162479" , constraint = "")
    private String orderNo;

    public String getPayerUserId() {
        return payerUserId;
    }

    public void setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId;
    }

    public String getPayeeUserId() {
        return payeeUserId;
    }

    public void setPayeeUserId(String payeeUserId) {
        this.payeeUserId = payeeUserId;
    }

    public Money getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(Money transAmount) {
        this.transAmount = transAmount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Money getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(Money freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public Money getUnfreezeAmount() {
        return unfreezeAmount;
    }

    public void setUnfreezeAmount(Money unfreezeAmount) {
        this.unfreezeAmount = unfreezeAmount;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
