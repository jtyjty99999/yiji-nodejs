/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-07-11 09:42 创建
 *
 */
package com.yiji.openapi.message.mpay.sdk.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author zhike@yiji.com
 */
public class OpenapiChannelInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
     * 渠道编码
     */
    @OpenApiField(desc = "渠道编码", constraint = "渠道编码", demo = "S060_00_0051")
    private String channelCode;

    /**
     * 渠道名称
     */
    @OpenApiField(desc = "渠道名称", constraint = "渠道名称", demo = "网银")
    private String channelName;

    /**
     * 渠道图标url
     */
    @OpenApiField(desc = "渠道图标url", constraint = "渠道图标url", demo = "https://www.baidu.com/a.jpg")
    private String icon;

    /**
     * 银行名称
     */
    @OpenApiField(desc = "银行名称", constraint = "银行名称", demo = "中信银行")
    private String bankName;

    /**
     * 卡号后四位
     */
    @OpenApiField(desc = "卡号后四位", constraint = "卡号后四位", demo = "8888")
    private String cardNo;

    /**
     * 开关:ON：开启；OFF：关闭
     */
    @OpenApiField(desc = "开关", constraint = "{\"data\":[\"ON:开启\",\"OFF:关闭\"],\"name\":\"开关\"}", demo = "ON")
    private String onOff;

    /**
     * 提示信息
     */
    @OpenApiField(desc = "提示信息", constraint = "提示信息", demo = "网银渠道信息")
    private String tips;

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getOnOff() {
        return onOff;
    }

    public void setOnOff(String onOff) {
        this.onOff = onOff;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

}
