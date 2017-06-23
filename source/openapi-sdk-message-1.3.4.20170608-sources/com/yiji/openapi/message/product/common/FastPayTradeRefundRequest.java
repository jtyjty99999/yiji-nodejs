/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-28 11:23 创建
 *
 */
package com.yiji.openapi.message.product.common;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-28
 */
@OpenApiMessage(service = "fastPayTradeRefund", type = ApiMessageType.Request)
public class FastPayTradeRefundRequest extends ApiRequest {

    /**
     * 用户客户端ip
     */
    @Size(max = 128)
    @OpenApiField(desc = "用户客户端ip", demo = "192.168.22.33", constraint = "")
    private String userEndIp;


    /**
     * 交易流水号
     */
    @NotBlank
    @Length(min = 20, max = 20)
    @OpenApiField(desc = "交易流水号", demo = "P464742078516256741A53", constraint = "创建即时到账订单返回的业务流水号")
    private String tradeNo;

    @NotNull
    @OpenApiField(desc = "退款金额", demo = "58888", constraint = "")
    private Money refundAmount;

    @NotBlank
    @OpenApiField(desc = "退款原因", demo = "未收到货物", constraint = "")
    private String refundReason;

    /**
     * 分润退款信息
     */
    @OpenApiField(desc = "分润退款信息", constraint = "分润最多支持10笔,单笔分润格式:userId1~amount1~memo1^userId2~amount2~memo2", demo = "2012658947952258175214~88.66~分润^45631541323241~65.21~fenrun")
    private String shareProfitRefunds;

    public String getUserEndIp() {
        return userEndIp;
    }

    public void setUserEndIp(String userEndIp) {
        this.userEndIp = userEndIp;
    }


    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Money getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Money refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getShareProfitRefunds() {
        return shareProfitRefunds;
    }

    public void setShareProfitRefunds(String shareProfitRefunds) {
        this.shareProfitRefunds = shareProfitRefunds;
    }
}


