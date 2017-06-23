/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-26 17:12 创建
 *
 */
package com.yiji.openapi.message.common.trade;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-26
 */
@OpenApiMessage(service = "fastPayQueryTrade", type = ApiMessageType.Response)
public class FastPayQueryTradeResponse extends ApiResponse {

    /**
     * 业务流水号
     */
    @OpenApiField(desc = "业务流水号" , demo = "2016052630793904" , constraint = "")
    private String tradeNo;

    /**
     * 商品类型名称
     */
    @OpenApiField(desc = "商品类型" , demo = "食品类" , constraint = "")
    private String goodsType;

    /**
     * 商品名称
     */
    @OpenApiField(desc = "商品名称" , demo = "食品" , constraint = "")
    private String goodsName;

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
     * 业务状态
     */
    @OpenApiField(desc = "业务状态" , demo = "SUCCESS" , constraint = "")
    private String fastPayStatus;

    /**
     * 创建时间
     */
    @OpenApiField(desc = "创建时间" , demo = "2015-05-06" , constraint = "")
    private Date createTime;

    /**
     * 完成时间
     */
    @OpenApiField(desc = "完成时间" , demo = "2015-05-06" , constraint = "")
    private Date finishTime;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }
}
