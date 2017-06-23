package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.oldtonew.info.TradePoolSubTansferInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by tyongfu@yiji.com on 2016/2/14.
 */
@Deprecated
@OpenApiMessage(service = "receiveBorrow", type = ApiMessageType.Request)
public class ReceiveBorrowRequest extends ApiRequest {

    @OpenApiField(constraint = "只能20位",demo = "20160214001111111111",desc = "交易号")
    @NotBlank
    private String tradeNo;

    @OpenApiField(constraint = "不能太长,最长256",demo = "好交易",desc = "交易备注")
    @Length(max = 256)
    private String tradeMemo;

    @OpenApiField(desc = "子交易信息")
    private List<TradePoolSubTansferInfo> tradePoolSubTansferOrders;

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

    public List<TradePoolSubTansferInfo> getTradePoolSubTansferOrders() {
        return tradePoolSubTansferOrders;
    }

    public void setTradePoolSubTansferOrders(
            List<TradePoolSubTansferInfo> tradePoolSubTansferOrders) {
        this.tradePoolSubTansferOrders = tradePoolSubTansferOrders;
    }
}
