/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-01 14:11 创建
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
public class ToBusinessCardOrderInfo {

    /** 明细外部订单号 */
    @Size(max = 64)
    @OpenApiField(desc = "明细外部订单号" , demo = "251580251aa12129aafg" , constraint = "")
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
    @OpenApiField(desc = "银行账号" , demo = "6221211992351250212" , constraint = "")
    private String bankAccountNo;
    /** 银行开户人 */
    @Size(max = 50)
    @OpenApiField(desc = "银行开户人" , demo = "熊本熊" , constraint = "")
    private String bankAccount;
    /** 银行所在省 */
    @Size(max = 50)
    @OpenApiField(desc = "银行所在省" , demo = "贵州省" , constraint = "")
    private String bankProvince;
    /** 银行所在市 */
    @Size(max = 50)
    @OpenApiField(desc = "银行所在市" , demo = "遵义市" , constraint = "")
    private String bankCity;
    /** 银行地址 */
    @Size(max = 512)
    @OpenApiField(desc = "银行地址" , demo = "重庆市渝北区龙塔街道2号" , constraint = "")
    private String bankAddress;
    /** 描述 */
    @Size(max = 512)
    @OpenApiField(desc = "描述" , demo = "该卡正在使用中 " , constraint = "")
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

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
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
