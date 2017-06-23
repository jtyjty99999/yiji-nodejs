/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-06-27 14:23 创建
 *
 */
package com.yiji.openapi.message.product.easyexchange.infos;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author zhike@yiji.com
 */
public class OpenapiLogisticInfo implements Serializable {
    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = -4029536858229890264L;

    /**
     * 物流机构
     */
    @NotBlank
    @OpenApiField(desc = "物流机构", demo = "顺风", constraint = "物流机构")
    private String logisticsCompany;

    /**
     * 运输单号
     */
    @NotBlank
    @OpenApiField(desc = "运输单号", demo = "1613721660499765", constraint = "运输单号")
    private String transportNumber;

    /**
     * 外部订单号
     */
    @OpenApiField(desc = "外部订单号", demo = "1613721660499765", constraint = "外部订单号")
    private String outOrderNo;

    /**
     * 收货人姓名
     */
    @NotBlank
    @OpenApiField(desc = "收货人姓名", demo = "张三", constraint = "收货人姓名")
    private String consigneeName;

    /**
     * 收货人地址
     */
    @NotBlank
    @OpenApiField(desc = "收货人地址", demo = "重庆渝北土星", constraint = "收货人地址")
    private String consigneeAddress;

    /**
     * 收货人联系方式
     */
    @OpenApiField(desc = "收货人联系方式", demo = "13542142103", constraint = "收货人联系方式")
    private String consigneeContact;

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getConsigneeContact() {
        return consigneeContact;
    }

    public void setConsigneeContact(String consigneeContact) {
        this.consigneeContact = consigneeContact;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }


    public String getLogisticsCompany() {
        return logisticsCompany;
    }


    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }


    public String getTransportNumber() {
        return transportNumber;
    }


    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber;
    }


    public String getOutOrderNo() {
        return outOrderNo;
    }


    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }
}
