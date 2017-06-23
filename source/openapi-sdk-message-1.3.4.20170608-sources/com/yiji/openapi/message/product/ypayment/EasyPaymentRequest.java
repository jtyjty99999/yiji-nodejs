/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-29 09:26 创建
 *
 */
package com.yiji.openapi.message.product.ypayment;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.product.ypayment.info.PaymentItemInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-29
 */
@OpenApiMessage(service = "easyPayment", type = ApiMessageType.Request)
public class EasyPaymentRequest extends ApiRequest {

    /**
     * 缴费类型
     */
    @NotBlank
    @OpenApiField(desc = "缴费类型",demo = "MOBILE")
    private String paymentType;


    /**
     * 签约绑卡号(水电气必传, 手机充值后台自动绑定,不传)
     */
    @OpenApiField(desc = "签约绑卡号",constraint = "水电气缴费必传, 话费充值不传",demo = "20151103000000000002")
    private String contractNo;

    /**
     * 缴费金额
     */
    @NotNull
    @OpenApiField(desc = "缴费金额",demo = "88.66")
    private Money paymentAmount;

    /**
     * 易极付用户（必填）
     */
    @NotBlank
    @OpenApiField(desc = "易极付用户ID",demo = "20141225010000062065")
    private String userId;

    /**
     * 平台类型
     */
    @NotBlank
    @OpenApiField(desc = "商户平台标识",demo = "YiPinHui",constraint = "签约时分配的平台类型")
    private String platformType;

    /**
     * 缴费模型
     */
    @NotBlank
    @OpenApiField(desc = "缴费模型",demo = "RECHARGE",constraint = "")
    private String paymentModel;

    /**
     * 用户卡号(水电气卡号，充值为手机号；不使用绑定功能，必填)
     */
    @Length(max=32)
    @OpenApiField(desc = "用户卡号",demo = "13605254578",constraint = "水电气卡号，充值为手机号；不使用绑定功能，必填")
    private String userCode;

    /**
     * 资源代码(不使用绑定功能，必填)
     */
    @Length(max=32)
    @OpenApiField(desc = "资源代码",demo = "a5d45a6d45as6d",constraint = "不使用绑定功能，必填")
    private String resourceCode;

    /**
     * 缴费列表(缴费列表为多个，充值默认只有一个)
     */
    @NotEmpty
    @OpenApiField(desc = "缴费列表",demo = "",constraint = "")
    private List<PaymentItemInfo> paymentItems;

    /**
     * 门店号(易生活门店缴电费必传)
     */
    @Length(max=35)
    @OpenApiField(desc = "门店号",demo = "2058523555",constraint = "易生活门店缴电费必传")
    private String storeId;

    public String getPaymentModel() {
        return paymentModel;
    }

    public void setPaymentModel(String paymentModel) {
        this.paymentModel = paymentModel;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public List<PaymentItemInfo> getPaymentItems() {
        return paymentItems;
    }

    public void setPaymentItems(List<PaymentItemInfo> paymentItems) {
        this.paymentItems = paymentItems;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Money getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Money paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }


}

