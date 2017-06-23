package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-11-26 9:49.
 */
@OpenApiMessage(service = "commonWchatTrade", type = ApiMessageType.Response)
public class CommonWchatTradeResponse extends ApiResponse {

    /** 扫码图片地址 */
    @OpenApiField(desc = "微信二维码",constraint = "微信二维码的图片url",demo = "http://www.yiji.com/weixin.jpg")
    private String scanCodeImageUrl;

    /** 交易流水号 */
    @OpenApiField(desc = "交易流水号",demo = "123564123856123414")
    private String tradeNo;

    /** 付款总金额 */
    @OpenApiField(desc = "付款总金额",demo = "88.66")
    private Money payAmount;

    /** 买家手续费 */
    @OpenApiField(desc = "买家手续费",demo = "6.88")
    private Money chargeAmount;

    public String getScanCodeImageUrl() {
        return scanCodeImageUrl;
    }

    public void setScanCodeImageUrl(String scanCodeImageUrl) {
        this.scanCodeImageUrl = scanCodeImageUrl;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Money getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Money payAmount) {
        this.payAmount = payAmount;
    }

    public Money getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(Money chargeAmount) {
        this.chargeAmount = chargeAmount;
    }
}
