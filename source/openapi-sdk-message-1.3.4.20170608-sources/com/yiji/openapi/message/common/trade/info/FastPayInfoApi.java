/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-26 17:29 创建
 *
 */
package com.yiji.openapi.message.common.trade.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-26
 */
public class FastPayInfoApi {

    /**
     * 业务流水号
     */
    @OpenApiField(desc = "业务流水号" , demo = "2016052630793904" , constraint = "")
    private String bizNo;

    /**
     * 业务状态
     */
    @OpenApiField(desc = "业务状态" , demo = "SUCCESS" , constraint = "")
    private String fastPayStatus;

    /**
     * 交易备注
     */
    @OpenApiField(desc = "交易备注" , demo = "食品类交易" , constraint = "")
    private String memo;

    /**
     * 买家ID
     */
    @OpenApiField(desc = "买家ID" , demo = "20160213010010330822" , constraint = "")
    private String buyerUserId;

    /**
     * 卖家ID
     */
    @OpenApiField(desc = "卖家ID" , demo = "20160213010010330822" , constraint = "")
    private String sellerUserId;

    /**
     * 交易金额
     */
    @OpenApiField(desc = "交易金额" , demo = "20000" , constraint = "")
    private Money tradeAmount;

    /**
     * 收费扩展维度
     */
    @OpenApiField(desc = "收费扩展维度" , demo = "\"CHANNEL\": \"PSBC\",\n" +
            "            \"PUBLICPRIVATE\": \"N\",\n" +
            "            \"SERVICECODE\": \"netbankPay\",\n" +
            "            \"CARDTYPE\": \"DEBIT\"" , constraint = "")
    private String chargeExtends;

    /**
     * 创建时间
     */
    @OpenApiField(desc = "创建时间" , demo = "2015-05-06" , constraint = "")
    private String createTime;

    /**
     * 完成时间
     */
    @OpenApiField(desc = "完成时间" , demo = "2015-05-06" , constraint = "")
    private String finishTime;


    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getFastPayStatus() {
        return fastPayStatus;
    }

    public void setFastPayStatus(String fastPayStatus) {
        this.fastPayStatus = fastPayStatus;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }


    public String getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getChargeExtends() {
        return chargeExtends;
    }

    public void setChargeExtends(String chargeExtends) {
        this.chargeExtends = chargeExtends;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }
}
