/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-25 14:05 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.common.oldtonew.info.TradePoolSubTansferInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/25
 */
@OpenApiMessage(service = "tradePayPoolReverse", type = ApiMessageType.Request)
public class TradePayPoolReverseRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc="交易号",demo="123412341234")
    private String tradeNo;

    @OpenApiField(desc="交易备注",demo="需要统一发货")
    private String tradeMemo;

    @NotEmpty
    @OpenApiField(desc="集资交易子列表",demo="[交易1，交易2，交易3]")
    private List<TradePoolSubTansferInfo> subOrders;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeMemo() {
        return tradeMemo;
    }

    public void setTradeMemo(String tradeMemo) {
        this.tradeMemo = tradeMemo;
    }

    public List<TradePoolSubTansferInfo> getSubOrders() {
        return subOrders;
    }

    public void setSubOrders(List<TradePoolSubTansferInfo> subOrders) {
        this.subOrders = subOrders;
    }
}
