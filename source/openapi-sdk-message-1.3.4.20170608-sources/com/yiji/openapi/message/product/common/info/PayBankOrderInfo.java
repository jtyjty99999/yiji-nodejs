/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-21 14:12 创建
 *
 */
package com.yiji.openapi.message.product.common.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

import javax.validation.constraints.NotNull;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-21
 */
public class PayBankOrderInfo {

    /** 银行简称 */
    @NotNull
    @OpenApiField(desc = "支付渠道" , demo = "WEIXIN")
    private String payChannel;

    /** 微信APP支付，需要传入的信息 */
    @OpenApiField(desc = "公众号openId" , demo = "wxcdf635087fd2a8a9" , constraint = "公众号支付时需要传入")
    private String openid;

    /** 条码支付，需要传入的信息，条码编号 */
    @OpenApiField(desc = "授权码" , demo = "A1A5D1A5SD5AS6DASD" , constraint = "条码支付需要传入")
    private String authCode;

    /** 微信APP支付，需要传入的信息 */
    @OpenApiField(desc = "微信APP支付" , demo = "wxcdf635087fd2a8a9" , constraint = "微信APP支付时需要，第三方控件支付时，银行简称为WEIXIN时需要")
    private String wxAppid;

    /**
     * 微信APP支付，需要传入的信息
     */
    @OpenApiField(desc = "设备类型" , demo = "IOS" , constraint = "微信APP支付时需要")
    private String deviceType;

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getWxAppid() {
        return wxAppid;
    }

    public void setWxAppid(String wxAppid) {
        this.wxAppid = wxAppid;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
}
