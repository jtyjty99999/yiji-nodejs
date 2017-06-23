/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-10 14:44 创建
 *
 */
package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "commonRedirectToGR", type = ApiMessageType.Response)
public class CommonRedirectToGRResponse extends ApiResponse {
    /** 登陆名 */
    @OpenApiField(desc = "登录帐号",constraint = "用户登陆易极付帐号")
    private String loginId;

    @OpenApiField(desc = "外部订单号",constraint = "商户业务产生的订单号")
    private String merchantOrderBizNo;

    @OpenApiField(desc = "gid")
    private String gid;

    /** 商户卡号 */
    @OpenApiField(desc = "商户卡号",constraint = "商户卡号")
    private String merchantCardNo;

    /** 商户资金账号 */
    @OpenApiField(desc = "商户资金帐号",constraint = "商户资金帐号")
    private String merchantAccountNo;

    /** 商户会员号 */
    @OpenApiField(desc = "商户会员号",constraint = "商户会员号")
    private String merchantUserId;

    /** 入口编码 */
    @OpenApiField(desc = "入口编码",constraint = "入口编码")
    private String inlet = "01";

    @OpenApiField(desc = "请求目标",constraint = "请求目标")
    private String requestType = "gc";

    @OpenApiField(desc = "订单号",constraint = "订单号")
    private String outOrderNo;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getMerchantOrderBizNo() {
        return merchantOrderBizNo;
    }

    public void setMerchantOrderBizNo(String merchantOrderBizNo) {
        this.merchantOrderBizNo = merchantOrderBizNo;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo;
    }

    public String getMerchantAccountNo() {
        return merchantAccountNo;
    }

    public void setMerchantAccountNo(String merchantAccountNo) {
        this.merchantAccountNo = merchantAccountNo;
    }

    public String getMerchantUserId() {
        return merchantUserId;
    }

    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
    }

    public String getInlet() {
        return inlet;
    }

    public void setInlet(String inlet) {
        this.inlet = inlet;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

}
