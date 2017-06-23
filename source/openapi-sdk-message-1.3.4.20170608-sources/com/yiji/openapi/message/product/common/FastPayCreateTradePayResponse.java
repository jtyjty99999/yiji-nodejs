/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-21 08:59 创建
 *
 */
package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-21
 */
@OpenApiMessage(service = "fastPayCreateTradePay", type = ApiMessageType.Response)
public class FastPayCreateTradePayResponse extends ApiResponse {
    /**
     * 支付流水号
     */
    @OpenApiField(desc = "支付流水号" , demo = "201500515252525625" , constraint = "")
    private String tradeNo;

    /**
     * 付款总金额
     */
    @OpenApiField(desc = "付款总金额" , demo = "258888" , constraint = "")
    private Money payAmount;

    /**
     * 买家手续费
     */
    @OpenApiField(desc = "买家手续费" , demo = "258888" , constraint = "")
    private Money buyerFee;

    /**
     * 业务状态
     */
    @OpenApiField(desc = "业务状态" , demo = "PAY_PROCESSING" , constraint = "{\"data\":[\"FINISHED:交易成功\",\"CLOSE:交易失败\",\"PAY_PROCESSING:付款处理中\",\"WAIT_PAY:等待付款\"],\"name\":\"业务状态\"}")
    private String fastPayStatus;
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

    public Money getBuyerFee() {
        return buyerFee;
    }

    public void setBuyerFee(Money buyerFee) {
        this.buyerFee = buyerFee;
    }

    public String getFastPayStatus() {
        return fastPayStatus;
    }

    public void setFastPayStatus(String fastPayStatus) {
        this.fastPayStatus = fastPayStatus;
    }

    public String getForwardInfo() {
        return forwardInfo;
    }

    public void setForwardInfo(String forwardInfo) {
        this.forwardInfo = forwardInfo;
    }
}
