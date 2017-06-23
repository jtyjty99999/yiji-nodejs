/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-01 14:10 创建
 *
 */
package com.yiji.openapi.message.product.ewpay.info;

import java.util.List;

import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-01
 */
public class ToPersonCardOrderInfo {
    /** 明细外部订单号 */
    @Size(max = 64)
    @OpenApiField(desc = "明细外部订单号" , demo = "201500013510025312" , constraint = "")
    private String itemMerchOrderNo;
    /** 交易金额 */
    @OpenApiField(desc = "交易金额" , demo = "25888" , constraint = "")
    private Money money;
    /** 银行编码 */
    @Size(max = 50)
    @OpenApiField(desc = "银行编码" , demo = "ABC" , constraint = "")
    private String bankCode;
    /** 银行账号 */
    @Size(max = 50)
    @OpenApiField(desc = "银行账号" , demo = "622121345712663154" , constraint = "")
    private String bankAccountNo;
    /** 银行开户人 */
    @Size(max = 50)
    @OpenApiField(desc = "银行开户人" , demo = "熊本熊" , constraint = "")
    private String bankAccount;
    /** 描述 */
    @Size(max = 512)
    @OpenApiField(desc = "描述" , demo = "个人银行卡" , constraint = "")
    private String memo;
    /** 关联的goods */
    @OpenApiField(desc = "关联的goods" , demo = "" , constraint = "")
    private List<GoodsOrderInfo> goodsList;

    public String getItemMerchOrderNo() {
        return itemMerchOrderNo;
    }

    public void setItemMerchOrderNo(String itemMerchOrderNo) {
        this.itemMerchOrderNo = itemMerchOrderNo;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public List<GoodsOrderInfo> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsOrderInfo> goodsList) {
        this.goodsList = goodsList;
    }
}
