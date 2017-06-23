/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-01 09:53 创建
 *
 */
package com.yiji.openapi.message.common.trade.info;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-01
 */
public class PayBankOrderInfo {


    /** 银行简称 */
    @NotBlank
    @Length(max = 20)
    @OpenApiField(desc = "支付渠道" , demo = "WEIXIN" , constraint = "WEIXIN:UNION")
    private String payChannel;


    /** 微信APP支付，需要传入的信息 */
    @OpenApiField(desc = "微信APP支付" , demo = "wxcdf635087fd2a8a9" , constraint = "微信APP支付时需要，第三方控件支付时，银行简称为WEIXIN时需要")
    private String wxAppid;

    /**
     * 微信APP支付，需要传入的信息，请参考
     * {@link com.yiji.commonproducts.products.payment.enums.DeviceTypeEnum#code()}
     */
    @OpenApiField(desc = "设备类型" , demo = "IOS" , constraint = "微信APP支付时需要")
    private String deviceType;

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getWxAppid() {
        return wxAppid;
    }

    public void setWxAppid(String wxAppid) {
        this.wxAppid = wxAppid;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

}
