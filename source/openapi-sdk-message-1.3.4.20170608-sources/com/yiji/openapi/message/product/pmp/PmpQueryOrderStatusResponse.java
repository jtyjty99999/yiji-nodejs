package com.yiji.openapi.message.product.pmp;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-14 10:57.
 */
@OpenApiMessage(service = "pmpQueryOrderStatus", type = ApiMessageType.Response)
public class PmpQueryOrderStatusResponse extends ApiResponse {

    /**
     * 订单号
     */
    @OpenApiField(desc = "订单号",demo = "132546123456")
    private String orderCode;

    /**
     * 订单状态 WA:初始状态；ZS:转发成功；ZD:转发中；ZF：转发失败；SS:支付成功；CO:交易关闭
     */
    @OpenApiField(desc = "订单状态",demo = "WA",constraint = "WA:初始状态<br>ZS:转发成功<br>ZD:转发中<br>ZF：转发失败<br>SS:支付成功<br>CO:交易关闭")
    private String orderStatus;

    /**
     * 订单通知状态 N:未通知,D:通知中,Y:通知成功,F:通知失败,O:不再通知
     */
    @OpenApiField(desc = "订单通知状态",demo = "N",constraint = "N:未通知<br>D:通知中<br>Y:通知成功<br>F:通知失败<br>O:不再通知")
    private String orderNotifyStatus;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderNotifyStatus() {
        return orderNotifyStatus;
    }

    public void setOrderNotifyStatus(String orderNotifyStatus) {
        this.orderNotifyStatus = orderNotifyStatus;
    }
}
