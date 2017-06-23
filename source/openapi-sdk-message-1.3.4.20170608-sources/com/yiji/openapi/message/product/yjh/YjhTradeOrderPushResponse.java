package com.yiji.openapi.message.product.yjh;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by hgeshu@yiji.com on 2016/7/15.
 */
@OpenApiMessage(service = "yjhTradeOrderPush", type = ApiMessageType.Response)
public class YjhTradeOrderPushResponse extends ApiResponse {

    /**
     * 请求订单号
     */
    @OpenApiField(desc = "请求订单号",demo = "2016010618033973605")
    private String outOrderNo;
    /**
     * 易结汇用户订单推送唯一编号
     */
    @OpenApiField(desc = "易结汇用户ID",demo = "20150902300007583295")
    private String userId;
    /**
     * 销售平台
     */
    @OpenApiField(desc = "销售平台",demo = "EBAY")
    private String tradePlatform;

    /**
     * 销售平台订单号
     */
    @OpenApiField(desc = "销售平台订单号",demo = "989983000000")
    private String platformOrderNo;

    /**
     * 处理结果附加信息
     */
    @OpenApiField(desc = "处理结果附加信息",demo = "订单推送成功")
    private String message;

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTradePlatform() {
        return tradePlatform;
    }

    public void setTradePlatform(String tradePlatform) {
        this.tradePlatform = tradePlatform;
    }

    public String getPlatformOrderNo() {
        return platformOrderNo;
    }

    public void setPlatformOrderNo(String platformOrderNo) {
        this.platformOrderNo = platformOrderNo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
