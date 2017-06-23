package com.yiji.openapi.message.mpay.sdk;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by hgeshu@yiji.com on 2016/7/14.
 */
@OpenApiMessage(service = "mpayIDCardOcr", type = ApiMessageType.Response)
public class MpayIDCardOcrResponse extends ApiResponse {
    /**
     * 身份证号
     */
    @NotBlank
    @OpenApiField(desc = "身份证号",demo = "5242556784893548147",security = true)
    private String certNo;

    /**
     * 真实姓名
     */
    @NotBlank
    @OpenApiField(desc = "真实姓名",demo = "张三",security = true)
    private String realName;

    /**
     * 证件有效期
     */
    @NotBlank
    @OpenApiField(desc = "证件有效期",demo = "2020-12-12",constraint = "如果有效期是长期，则返回“长期”",security = true)
    private String licenseValidTime;

    /**
     * 地址
     */
    @NotBlank
    @OpenApiField(desc = "地址",demo = "重庆市渝北区黄山大道中段",security = true)
    private String address;

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getLicenseValidTime() {
        return licenseValidTime;
    }

    public void setLicenseValidTime(String licenseValidTime) {
        this.licenseValidTime = licenseValidTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
