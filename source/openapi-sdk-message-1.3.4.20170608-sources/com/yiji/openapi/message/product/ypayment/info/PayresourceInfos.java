/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-03 10:02 创建
 *
 */
package com.yiji.openapi.message.product.ypayment.info;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-03
 */
public class PayresourceInfos {

    /** 资源代码（产品用） */
    @NotBlank
    @OpenApiField(desc = "资源代码",demo = "151d54512")
    private String resourceCode;

    /** 资源名称 */
    @NotBlank
    @OpenApiField(desc = "资源代码",demo = "151d54512")
    private String resourceName;

    /** 省名称 */
    @NotBlank
    @OpenApiField(desc = "省名称",demo = "贵州省")
    private String provinceName;

    /** 市名称 */
    @NotBlank
    @OpenApiField(desc = "市名称",demo = "遵义市")
    private String cityName;

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
