package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by tyongfu@yiji.com on 2016/2/14.
 */
@Deprecated
@OpenApiMessage(service = "receiveBorrow", type = ApiMessageType.Response)
public class ReceiveBorrowResponse extends ApiResponse {
    @OpenApiField(desc = "订单号",demo = "123456",constraint ="订单号" )
    private String order;

    @OpenApiField(desc = "服务码",demo = "20160128001111111111",constraint ="服务码" )
    private String tradeNo;

    @OpenApiField(desc = "交易金额",demo = "22.80",constraint ="交易金额" )
    private Money money;

    @OpenApiField(desc = "付款人",demo = "20160128001111111111",constraint ="付款人" )
    private String payerUserId;

    @OpenApiField(desc = "ui风格",demo = "PC_NORMAL",constraint ="ui风格" )
    private String uiStyle = "PC_NORMAL";

    @OpenApiField(desc = "gid",demo = "",constraint ="gid" )
    private String gid;

    @OpenApiField(desc = "inlet")
    private String inlet;

    @OpenApiField(desc = "商户卡号")
    private String merchantCardNo;

    @OpenApiField(desc = "商户资金账号")
    private String merchantAccNo;

    @OpenApiField(desc = "channeId")
    private String channelId;

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public String getPayerUserId() {
        return payerUserId;
    }

    public void setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId;
    }

    public String getUiStyle() {
        return uiStyle;
    }

    public void setUiStyle(String uiStyle) {
        this.uiStyle = uiStyle;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getInlet() {
        return inlet;
    }

    public void setInlet(String inlet) {
        this.inlet = inlet;
    }

    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo;
    }

    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
}
