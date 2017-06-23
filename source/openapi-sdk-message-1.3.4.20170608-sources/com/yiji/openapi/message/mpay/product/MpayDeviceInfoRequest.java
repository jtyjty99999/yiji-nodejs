/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-24 10:38 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-24
 */
@OpenApiMessage(service = "mpayDeviceInfo", type = ApiMessageType.Request)
public class MpayDeviceInfoRequest extends ApiRequest {
    /**
     * 系统名称
     */
    @NotBlank
    @Size(max = 64)
    @OpenApiField(desc = "系统名称" , demo = "一起富" , constraint = "")
    private String sysName;

    /**
     * 设备编号
     */
    @NotBlank
    @Size(max = 64)
    @OpenApiField(desc = "设备编号" , demo = "256478124AS" , constraint = "")
    private String deviceId;

    /**
     * sim卡编号
     */
    @Size(max = 64)
    @OpenApiField(desc = "sim卡编号" , demo = "5sd45s64fs56f4d5s6f" , constraint = "")
    private String sim;

    /**
     * 设备类型
     */
    @Size(max = 64)
    @OpenApiField(desc = "设备类型" , demo = "Iphone" , constraint = "Iphone/android")
    private String deviceType;

    /**
     * 设备型号
     */
    @Size(max = 32)
    @OpenApiField(desc = "设备型号" , demo = "M040" , constraint = "")
    private String model;

    /**
     * 设备名称
     */
    @Size(max = 32)
    @OpenApiField(desc = "设备名称" , demo = "MX2" , constraint = "")
    private String product;

    /**
     * 品牌名称
     */
    @Size(max = 32)
    @OpenApiField(desc = "品牌名称" , demo = "MEIZU" , constraint = "")
    private String brand;

    /**
     * 网络类型
     */
    @Size(max = 32)
    @OpenApiField(desc = "网络类型" , demo = "电信" , constraint = "")
    private String network;

    /**
     * 屏幕尺寸
     */
    @Size(max = 8)
    @OpenApiField(desc = "屏幕尺寸" , demo = "4G" , constraint = "")
    private String screen;

    /**
     * 屏幕分辨率
     */
    @Size(max = 16)
    @OpenApiField(desc = "屏幕分辨率" , demo = "1920*1080" , constraint = "")
    private String pixel;

    /**
     * App名称
     */
    @OpenApiField(desc = "App名称" , demo = "易品汇" , constraint = "")
    @Size(max = 32)
    private String appName;

    /**
     * App版本
     */
    @Size(max = 16)
    @OpenApiField(desc = "App版本" , demo = "1.2" , constraint = "")
    private String appVer;

    /**
     * SDK版本
     */
    @NotNull
    @Size(max = 16)
    @OpenApiField(desc = "SDK版本" , demo = "1.1" , constraint = "")
    private String sdkVer;

    /**
     * 是否越狱/root
     */
    @Size(max = 1)
    @OpenApiField(desc = "是否越狱" , demo = "已root" , constraint = "")
    private String jailbreak;

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getPixel() {
        return pixel;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVer() {
        return appVer;
    }

    public void setAppVer(String appVer) {
        this.appVer = appVer;
    }

    public String getSdkVer() {
        return sdkVer;
    }

    public void setSdkVer(String sdkVer) {
        this.sdkVer = sdkVer;
    }

    public String getJailbreak() {
        return jailbreak;
    }

    public void setJailbreak(String jailbreak) {
        this.jailbreak = jailbreak;
    }
}
