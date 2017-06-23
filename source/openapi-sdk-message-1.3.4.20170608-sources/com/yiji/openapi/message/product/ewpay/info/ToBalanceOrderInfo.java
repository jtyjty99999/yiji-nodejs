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
public class ToBalanceOrderInfo {
    /** 明细外部订单号 */
    @Size(max = 64)
    @OpenApiField(desc = "明细外部订单号" , demo = "2015210003645008" , constraint = "")
    private String itemMerchOrderNo;
    /** 收款人易极付ID */
    @Size(min = 20, max = 20)
    @OpenApiField(desc = "收款人易极付ID" , demo = "201521000364500825" , constraint = "")
    private String payeeUserId;
    /** 收款人外部会员ID */
    @Size(max = 50)
    @OpenApiField(desc = "收款人外部会员ID" , demo = "201521000364500825" , constraint = "")
    private String outPayeeShopId;
    /** 收款人外部会员名称 */
    @Size(max = 256)
    @OpenApiField(desc = "收款人外部会员名称" , demo = "熊本熊" , constraint = "")
    private String outPayeeShopName;
    /** 交易金额 */
    @OpenApiField(desc = "交易金额" , demo = "25888" , constraint = "")
    private Money money;
    /** 描述 */
    @Size(max = 512)
    @OpenApiField(desc = "描述" , demo = "辣条食品" , constraint = "")
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

    public String getPayeeUserId() {
        return payeeUserId;
    }

    public void setPayeeUserId(String payeeUserId) {
        this.payeeUserId = payeeUserId;
    }

    public String getOutPayeeShopId() {
        return outPayeeShopId;
    }

    public void setOutPayeeShopId(String outPayeeShopId) {
        this.outPayeeShopId = outPayeeShopId;
    }

    public String getOutPayeeShopName() {
        return outPayeeShopName;
    }

    public void setOutPayeeShopName(String outPayeeShopName) {
        this.outPayeeShopName = outPayeeShopName;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
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
