/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-29 17:05 创建
 *
 */
package com.yiji.openapi.message.product.ypayment;

import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.ypayment.info.PayItemsInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-29
 */
@OpenApiMessage(service = "queryUserDebtMoney", type = ApiMessageType.Response)
public class QueryUserDebtMoneyResponse extends ApiResponse {

    /** 用户缴费代码 */
    @NotBlank
    @OpenApiField(desc = "用户缴费代码",constraint = "话费充值时，为手机号；水电气缴费，为卡号",demo = "00503011295")
    private String userCode;

    /** 资源代码 */
    @NotBlank
    @OpenApiField(desc = "资源代码",demo = "002300001")
    private String resourceCode;

    /** 用户姓名 */
    @NotBlank
    @OpenApiField(desc = "用户姓名",demo = "张飞")
    private String username;

    /** 用户地址 */
    @NotBlank
    @OpenApiField(desc = "用户地址",demo = "重庆渝北")
    private String address;

    /** 欠费总额 */
    @NotBlank
    @OpenApiField(desc = "欠费总额",demo = "31.0")
    private Money totalPayables;

    @NotBlank
    @OpenApiField(desc = "查询结果项目")
    private List<PayItemsInfo> payItemsInfos;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Money getTotalPayables() {
        return totalPayables;
    }

    public void setTotalPayables(Money totalPayables) {
        this.totalPayables = totalPayables;
    }

    public List<PayItemsInfo> getPayItemsInfos() {
        return payItemsInfos;
    }

    public void setPayItemsInfos(List<PayItemsInfo> payItemsInfos) {
        this.payItemsInfos = payItemsInfos;
    }
}
