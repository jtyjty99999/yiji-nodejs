/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-06-27 14:04 创建
 *
 */
package com.yiji.openapi.message.product.easyexchange.infos;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author zhike@yiji.com
 */
public class OpenapiCrossBorderRemittranceDetailInfo implements Serializable {
    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;

    /** -------业务选择参数------ */
    /**
     * 贸易类型，参考String.GOODS_TRADE 和 SERVICES_TRADE
     */
    @NotBlank
    @OpenApiField(desc = "贸易类型", demo = "GOODS_TRADE", constraint = "")
    private String tradeType;
    /**
     * 交易编码 122030-未纳入海关统计的网络购物
     */
    @NotBlank
    @OpenApiField(desc = "交易编码", demo = "122030", constraint = "默认值为122030")
    private String tradeCode = "122030";

    /**
     * 唯一序列号
     */
    @NotBlank
    @OpenApiField(desc = "唯一序列号", demo = "122sdf323fffdg030", constraint = "唯一序列号")
    private String detailOrderSerialNo;
    /**
     * 明细金额
     */
    @NotNull
    @OpenApiField(desc = "明细金额", demo = "66.66", constraint = "明细金额")
    private Money detailOrderAmount;
    /**
     * 明细币种
     */
    @NotBlank
    @OpenApiField(desc = "明细币种", demo = "CNY", constraint = "明细币种")
    private String detailOrderCurrency;
    /**
     * 是否为保税货物项下付款 （Y or N）
     */
    @NotBlank
    @OpenApiField(desc = "是否为保税货物项下付款", demo = "Y", constraint = "{\"data\":[\"Y:是\",\"N:否\"],\"name\":\"是否为保税货物项下付款,默认为Y\"}")
    private String verificationFlag = "Y";

    /**
     * 买家真实名称
     */
    @OpenApiField(desc = "买家真实名称", demo = "张三", constraint = "买家真实名称")
    private String buyerRealName;

    /**
     * 买家身份证号
     */
    @OpenApiField(desc = "买家身份证号", demo = "500221195610191214", constraint = "买家身份证号")
    private String buyerIDNumber;

    /**
     * 物流信息
     */
    @NotNull
    @OpenApiField(desc = "物流信息", demo = "", constraint = "物流信息")
    private OpenapiLogisticInfo logisticInfo;

    /**
     * 商品信息
     */
    @NotNull
    @OpenApiField(desc = "商品信息", demo = "", constraint = "商品信息")
    private OpenapiGoodsClause goodsClause;

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getDetailOrderSerialNo() {
        return detailOrderSerialNo;
    }

    public void setDetailOrderSerialNo(String detailOrderSerialNo) {
        this.detailOrderSerialNo = detailOrderSerialNo;
    }

    public Money getDetailOrderAmount() {
        return detailOrderAmount;
    }

    public String getBuyerRealName() {
        return buyerRealName;
    }

    public void setBuyerRealName(String buyerRealName) {
        this.buyerRealName = buyerRealName;
    }

    public String getBuyerIDNumber() {
        return buyerIDNumber;
    }

    public void setBuyerIDNumber(String buyerIDNumber) {
        this.buyerIDNumber = buyerIDNumber;
    }

    public void setDetailOrderAmount(Money detailOrderAmount) {
        this.detailOrderAmount = detailOrderAmount;
    }

    public String getDetailOrderCurrency() {
        return detailOrderCurrency;
    }

    public void setDetailOrderCurrency(String detailOrderCurrency) {
        this.detailOrderCurrency = detailOrderCurrency;
    }

    public String getVerificationFlag() {
        return verificationFlag;
    }

    public void setVerificationFlag(String verificationFlag) {
        this.verificationFlag = verificationFlag;
    }

    public OpenapiLogisticInfo getLogisticInfo() {
        return logisticInfo;
    }

    public void setLogisticInfo(OpenapiLogisticInfo logisticInfo) {
        this.logisticInfo = logisticInfo;
    }

    public OpenapiGoodsClause getGoodsClause() {
        return goodsClause;
    }

    public void setGoodsClause(OpenapiGoodsClause goodsClause) {
        this.goodsClause = goodsClause;
    }
}
