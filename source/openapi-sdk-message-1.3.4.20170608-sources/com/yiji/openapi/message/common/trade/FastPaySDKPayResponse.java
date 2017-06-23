/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-31 18:48 创建
 *
 */
package com.yiji.openapi.message.common.trade;

import com.yiji.openapi.message.common.trade.info.TradePaymentInfoApi;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-31
 */
@OpenApiMessage(service = "fastPaySDKPay", type = ApiMessageType.Response)
public class FastPaySDKPayResponse extends ApiResponse {

    /**
     * 网银支付时，返回跳转网银页面表单信息<br/>
     * 第三方公众号支付时，返回跳转公众号支付页面信息<br/>
     * 第三方扫码支付时，返回生成二维码url信息<br/>
     * 第三方控件支付时，返回跳转控件支付页面信息<br/>
     * 其它支付方式时，为空
     */
    @OpenApiField(desc = "返回打开网银、第三方支付页面信息" , demo = "" , constraint = "" +
            "     * 网银支付时，返回跳转网银页面表单信息\n" +
            "     * 第三方公众号支付时，返回跳转公众号支付页面信息\n" +
            "     * 第三方扫码支付时，返回生成二维码url信息\n" +
            "     * 第三方控件支付时，返回跳转控件支付页面信息\n" +
            "     * 其它支付方式时，为空")
    private String forwardInfo;

    /** 订单付款信息 */
    @OpenApiField(desc = "订单付款信息" , demo = "" , constraint = "")
    private TradePaymentInfoApi tradePaymentInfo;

    public String getForwardInfo() {
        return forwardInfo;
    }

    public void setForwardInfo(String forwardInfo) {
        this.forwardInfo = forwardInfo;
    }

    public TradePaymentInfoApi getTradePaymentInfo() {
        return tradePaymentInfo;
    }

    public void setTradePaymentInfo(TradePaymentInfoApi tradePaymentInfo) {
        this.tradePaymentInfo = tradePaymentInfo;
    }
}
