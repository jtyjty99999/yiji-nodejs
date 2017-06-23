/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-21 16:01 创建
 *
 */
package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-21
 */
@OpenApiMessage(service = "fastPayCreateTradePay", type = ApiMessageType.Notify)
public class FastPayCreateTradePayNotify extends ApiNotify {

    /**
     * 支付流水号
     */
    @OpenApiField(desc = "支付流水号" , demo = "201500515252525625" , constraint = "")
    private String tradeNo;

    /**
     * 付款总金额
     */
    @OpenApiField(desc = "交易金额" , demo = "258888" , constraint = "")
    private Money tradeAmount;

    @OpenApiField(desc = "卖家实收金额",demo = "58880")
    private Money tradeAmountIn;

    /**
     * 业务状态
     */
    @OpenApiField(desc = "业务状态" , demo = "FINISHED" , constraint = "{\"data\":[\"FINISHED:交易成功\",\"CLOSED:交易失败\"],\"name\":\"业务状态\"}")
    private String fastPayStatus;

    @OpenApiField(desc = "支付方式" , demo = "THIRDPUBLICPAY" , constraint = "{\"data\":[\"THIRDPUBLICPAY:第三方公众号支付\",\"THIRDSCANPAY:第三方扫码支付\",\"THIRDSCANNEDPAY:第三方条码支付\"],\"name\":\"支付方式\"}")
    private String  payMethod;

    @OpenApiField(desc = "平台商手续费",demo = "88.66")
    private String merchantChargeAmount;

    public Money getTradeAmountIn() {
        return tradeAmountIn;
    }

    public void setTradeAmountIn(Money tradeAmountIn) {
        this.tradeAmountIn = tradeAmountIn;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getFastPayStatus() {
        return fastPayStatus;
    }

    public void setFastPayStatus(String fastPayStatus) {
        this.fastPayStatus = fastPayStatus;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getMerchantChargeAmount() {
        return merchantChargeAmount;
    }

    public void setMerchantChargeAmount(String merchantChargeAmount) {
        this.merchantChargeAmount = merchantChargeAmount;
    }
}
